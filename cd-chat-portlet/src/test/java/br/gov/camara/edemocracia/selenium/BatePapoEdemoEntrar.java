/**
 * Copyright (c) 2009-2014 Câmara dos Deputados. Todos os direitos reservados.
 *
 * e-Democracia é um software livre; você pode redistribuí-lo e/ou modificá-lo dentro
 * dos termos da Licença Pública Geral Menor GNU como publicada pela Fundação do 
 * Software Livre (FSF); na versão 2.1 da Licença, ou (na sua opinião) qualquer versão.
 *
 * Este programa é distribuído na esperança de que possa ser  útil, mas SEM NENHUMA GARANTIA;
 * sem uma garantia implícita de ADEQUAÇÃO a qualquer MERCADO ou APLICAÇÃO EM PARTICULAR.
 * Veja a Licença Pública Geral Menor GNU para maiores detalhes. 
 */
package br.gov.camara.edemocracia.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class BatePapoEdemoEntrar implements Runnable{
	private static final String USUARIO = "userEntrar";
	private static final String EMAIL = USUARIO + "@teste.br";

	public static void main(String[] args) throws Exception {
		
		for (int cont = 0; cont < 100; cont++) {
			Thread thread = new Thread(new BatePapoEdemoEntrar(cont));
			thread.start();
		}

	}

	private int cont;

	public BatePapoEdemoEntrar(int cont) {
		this.cont = cont;
	}

	public void carregarJanela(DesiredCapabilities cap, int cont) throws Exception {
//		WebDriver driver = new FirefoxDriver(cap);
		 WebDriver driver = new HtmlUnitDriver();

		driver.get(Configuracoes.getURLDaSala());

		try {
			WebElement element = driver.findElement(By.name("nome"));
			element.sendKeys(USUARIO + cont);
			
			element = driver.findElement(By.name("email"));
			element.sendKeys(EMAIL + cont);
			
			element = driver.findElement(By.name("uf"));
			Select Select = new Select(element);
			Select.selectByIndex(3);

			element = driver.findElement(By.name("comando"));
			element.submit();
			Actions act = new Actions(driver);
			act.contextClick();


		} catch (NoSuchElementException e) {
			throw new Exception("aconteceu algum problema inesperado ao tentar entrar no chat", e);
		}

	}

	public void run() {

		Proxy proxy = new Proxy();
		proxy.setNoProxy(Configuracoes.getNoProxyURL());
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		try {
			carregarJanela(cap, cont);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
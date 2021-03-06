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
package br.gov.camara.edemocracia.portlets.comunidades.portlet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.portlet.PortletRequest;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.Group;
import com.liferay.portal.model.GroupConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
/**
 * Portlet implementation class MyCommunities
 */
public class MinhasComunidades extends ListaComunidadesPortlet {

	private static Log _log = LogFactoryUtil.getLog(MinhasComunidades.class);

	@Override
	protected List<Group> getComunidades(PortletRequest renderRequest, ThemeDisplay td) {
		
		List<Group> publicGroups = Collections.<Group> emptyList();
		try {
			User user = td.getUser();
			if (user != null) {
				List<Group> groups = user.getGroups();
				publicGroups = new ArrayList<Group>(groups.size());
				for (Group grp : groups) {
					if (grp.isRegularSite()
							&& !GroupConstants.GUEST.equals(grp.getName())
							&& !grp.getName().equals("")
							&& grp.getPublicLayoutsPageCount() != 0) {
						publicGroups.add(grp);
					}
				}
			}
		} catch (PortalException e) {
			_log.error(e);
		} catch (SystemException e) {
			_log.error(e);
		}

		return publicGroups;
	}

	@Override
	protected String getTitulo() {
		return "Minhas Comunidades";
	}

}

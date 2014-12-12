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
package br.gov.camara.edemocracia.portlets.graficos.service.base;

import br.gov.camara.edemocracia.portlets.graficos.service.ContadorAcessoLocalService;
import br.gov.camara.edemocracia.portlets.graficos.service.GraficosLocalService;
import br.gov.camara.edemocracia.portlets.graficos.service.ParticipacaoLocalService;
import br.gov.camara.edemocracia.portlets.graficos.service.persistence.ContadorAcessoPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the graficos local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.graficos.service.impl.GraficosLocalServiceImpl}.
 * </p>
 *
 * @author Robson Miranda
 * @see br.gov.camara.edemocracia.portlets.graficos.service.impl.GraficosLocalServiceImpl
 * @see br.gov.camara.edemocracia.portlets.graficos.service.GraficosLocalServiceUtil
 * @generated
 */
public abstract class GraficosLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements GraficosLocalService, IdentifiableBean {
    @BeanReference(type = ContadorAcessoLocalService.class)
    protected ContadorAcessoLocalService contadorAcessoLocalService;
    @BeanReference(type = ContadorAcessoPersistence.class)
    protected ContadorAcessoPersistence contadorAcessoPersistence;
    @BeanReference(type = GraficosLocalService.class)
    protected GraficosLocalService graficosLocalService;
    @BeanReference(type = ParticipacaoLocalService.class)
    protected ParticipacaoLocalService participacaoLocalService;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private GraficosLocalServiceClpInvoker _clpInvoker = new GraficosLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.graficos.service.GraficosLocalServiceUtil} to access the graficos local service.
     */

    /**
     * Returns the contador acesso local service.
     *
     * @return the contador acesso local service
     */
    public ContadorAcessoLocalService getContadorAcessoLocalService() {
        return contadorAcessoLocalService;
    }

    /**
     * Sets the contador acesso local service.
     *
     * @param contadorAcessoLocalService the contador acesso local service
     */
    public void setContadorAcessoLocalService(
        ContadorAcessoLocalService contadorAcessoLocalService) {
        this.contadorAcessoLocalService = contadorAcessoLocalService;
    }

    /**
     * Returns the contador acesso persistence.
     *
     * @return the contador acesso persistence
     */
    public ContadorAcessoPersistence getContadorAcessoPersistence() {
        return contadorAcessoPersistence;
    }

    /**
     * Sets the contador acesso persistence.
     *
     * @param contadorAcessoPersistence the contador acesso persistence
     */
    public void setContadorAcessoPersistence(
        ContadorAcessoPersistence contadorAcessoPersistence) {
        this.contadorAcessoPersistence = contadorAcessoPersistence;
    }

    /**
     * Returns the graficos local service.
     *
     * @return the graficos local service
     */
    public GraficosLocalService getGraficosLocalService() {
        return graficosLocalService;
    }

    /**
     * Sets the graficos local service.
     *
     * @param graficosLocalService the graficos local service
     */
    public void setGraficosLocalService(
        GraficosLocalService graficosLocalService) {
        this.graficosLocalService = graficosLocalService;
    }

    /**
     * Returns the participacao local service.
     *
     * @return the participacao local service
     */
    public ParticipacaoLocalService getParticipacaoLocalService() {
        return participacaoLocalService;
    }

    /**
     * Sets the participacao local service.
     *
     * @param participacaoLocalService the participacao local service
     */
    public void setParticipacaoLocalService(
        ParticipacaoLocalService participacaoLocalService) {
        this.participacaoLocalService = participacaoLocalService;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = InfrastructureUtil.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

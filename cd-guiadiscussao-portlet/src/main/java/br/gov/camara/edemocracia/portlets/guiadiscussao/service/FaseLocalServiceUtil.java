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
package br.gov.camara.edemocracia.portlets.guiadiscussao.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the fase local service. This utility wraps {@link br.gov.camara.edemocracia.portlets.guiadiscussao.service.impl.FaseLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Robson
 * @see FaseLocalService
 * @see br.gov.camara.edemocracia.portlets.guiadiscussao.service.base.FaseLocalServiceBaseImpl
 * @see br.gov.camara.edemocracia.portlets.guiadiscussao.service.impl.FaseLocalServiceImpl
 * @generated
 */
public class FaseLocalServiceUtil {
    private static FaseLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link br.gov.camara.edemocracia.portlets.guiadiscussao.service.impl.FaseLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the fase to the database. Also notifies the appropriate model listeners.
    *
    * @param fase the fase
    * @return the fase that was added
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase addFase(
        br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addFase(fase);
    }

    /**
    * Creates a new fase with the primary key. Does not add the fase to the database.
    *
    * @param faseId the primary key for the new fase
    * @return the new fase
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase createFase(
        long faseId) {
        return getService().createFase(faseId);
    }

    /**
    * Deletes the fase with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param faseId the primary key of the fase
    * @return the fase that was removed
    * @throws PortalException if a fase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase deleteFase(
        long faseId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFase(faseId);
    }

    /**
    * Deletes the fase from the database. Also notifies the appropriate model listeners.
    *
    * @param fase the fase
    * @return the fase that was removed
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase deleteFase(
        br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFase(fase);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fetchFase(
        long faseId) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFase(faseId);
    }

    /**
    * Returns the fase with the primary key.
    *
    * @param faseId the primary key of the fase
    * @return the fase
    * @throws PortalException if a fase with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase getFase(
        long faseId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFase(faseId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the fases.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of fases
    * @param end the upper bound of the range of fases (not inclusive)
    * @return the range of fases
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase> getFases(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFases(start, end);
    }

    /**
    * Returns the number of fases.
    *
    * @return the number of fases
    * @throws SystemException if a system exception occurred
    */
    public static int getFasesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFasesCount();
    }

    /**
    * Updates the fase in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param fase the fase
    * @return the fase that was updated
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase updateFase(
        br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fase)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFase(fase);
    }

    /**
    * Updates the fase in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param fase the fase
    * @param merge whether to merge the fase with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the fase that was updated
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase updateFase(
        br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fase,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFase(fase, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase criaFase(
        br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase fase)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().criaFase(fase);
    }

    public static java.util.List<br.gov.camara.edemocracia.portlets.guiadiscussao.model.Fase> getFasesByConfiguracaoId(
        long configuracaoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFasesByConfiguracaoId(configuracaoId);
    }

    public static void excluirFase(long faseId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().excluirFase(faseId);
    }

    public static void moverFaseParaCima(long faseId)
        throws br.gov.camara.edemocracia.portlets.guiadiscussao.CantFaseMoveUpException,
            com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().moverFaseParaCima(faseId);
    }

    public static void moverFaseParaBaixo(long faseId)
        throws br.gov.camara.edemocracia.portlets.guiadiscussao.CantFaseMoveDownException,
            com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().moverFaseParaBaixo(faseId);
    }

    public static void clearService() {
        _service = null;
    }

    public static FaseLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    FaseLocalService.class.getName());

            if (invokableLocalService instanceof FaseLocalService) {
                _service = (FaseLocalService) invokableLocalService;
            } else {
                _service = new FaseLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(FaseLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated
     */
    public void setService(FaseLocalService service) {
    }
}

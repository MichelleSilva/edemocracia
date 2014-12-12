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
package br.gov.camara.edemocracia.portlets.wikilegis.service.persistence;

import br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the contribuicao service. This utility wraps {@link ContribuicaoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author robson
 * @see ContribuicaoPersistence
 * @see ContribuicaoPersistenceImpl
 * @generated
 */
public class ContribuicaoUtil {
    private static ContribuicaoPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Contribuicao contribuicao) {
        getPersistence().clearCache(contribuicao);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Contribuicao> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Contribuicao> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Contribuicao> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static Contribuicao update(Contribuicao contribuicao, boolean merge)
        throws SystemException {
        return getPersistence().update(contribuicao, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static Contribuicao update(Contribuicao contribuicao, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(contribuicao, merge, serviceContext);
    }

    /**
    * Caches the contribuicao in the entity cache if it is enabled.
    *
    * @param contribuicao the contribuicao
    */
    public static void cacheResult(
        br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao contribuicao) {
        getPersistence().cacheResult(contribuicao);
    }

    /**
    * Caches the contribuicaos in the entity cache if it is enabled.
    *
    * @param contribuicaos the contribuicaos
    */
    public static void cacheResult(
        java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> contribuicaos) {
        getPersistence().cacheResult(contribuicaos);
    }

    /**
    * Creates a new contribuicao with the primary key. Does not add the contribuicao to the database.
    *
    * @param contribuicaoId the primary key for the new contribuicao
    * @return the new contribuicao
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao create(
        long contribuicaoId) {
        return getPersistence().create(contribuicaoId);
    }

    /**
    * Removes the contribuicao with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param contribuicaoId the primary key of the contribuicao
    * @return the contribuicao that was removed
    * @throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException if a contribuicao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao remove(
        long contribuicaoId)
        throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(contribuicaoId);
    }

    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao updateImpl(
        br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao contribuicao,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(contribuicao, merge);
    }

    /**
    * Returns the contribuicao with the primary key or throws a {@link br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException} if it could not be found.
    *
    * @param contribuicaoId the primary key of the contribuicao
    * @return the contribuicao
    * @throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException if a contribuicao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao findByPrimaryKey(
        long contribuicaoId)
        throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(contribuicaoId);
    }

    /**
    * Returns the contribuicao with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param contribuicaoId the primary key of the contribuicao
    * @return the contribuicao, or <code>null</code> if a contribuicao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao fetchByPrimaryKey(
        long contribuicaoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(contribuicaoId);
    }

    /**
    * Returns all the contribuicaos where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @return the matching contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findByA(
        long artigoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA(artigoId);
    }

    /**
    * Returns a range of all the contribuicaos where artigoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param artigoId the artigo ID
    * @param start the lower bound of the range of contribuicaos
    * @param end the upper bound of the range of contribuicaos (not inclusive)
    * @return the range of matching contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findByA(
        long artigoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA(artigoId, start, end);
    }

    /**
    * Returns an ordered range of all the contribuicaos where artigoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param artigoId the artigo ID
    * @param start the lower bound of the range of contribuicaos
    * @param end the upper bound of the range of contribuicaos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findByA(
        long artigoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA(artigoId, start, end, orderByComparator);
    }

    /**
    * Returns the first contribuicao in the ordered set where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contribuicao
    * @throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException if a matching contribuicao could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao findByA_First(
        long artigoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_First(artigoId, orderByComparator);
    }

    /**
    * Returns the first contribuicao in the ordered set where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contribuicao, or <code>null</code> if a matching contribuicao could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao fetchByA_First(
        long artigoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByA_First(artigoId, orderByComparator);
    }

    /**
    * Returns the last contribuicao in the ordered set where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contribuicao
    * @throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException if a matching contribuicao could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao findByA_Last(
        long artigoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByA_Last(artigoId, orderByComparator);
    }

    /**
    * Returns the last contribuicao in the ordered set where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contribuicao, or <code>null</code> if a matching contribuicao could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao fetchByA_Last(
        long artigoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByA_Last(artigoId, orderByComparator);
    }

    /**
    * Returns the contribuicaos before and after the current contribuicao in the ordered set where artigoId = &#63;.
    *
    * @param contribuicaoId the primary key of the current contribuicao
    * @param artigoId the artigo ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contribuicao
    * @throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException if a contribuicao with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao[] findByA_PrevAndNext(
        long contribuicaoId, long artigoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws br.gov.camara.edemocracia.portlets.wikilegis.NoSuchContribuicaoException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByA_PrevAndNext(contribuicaoId, artigoId,
            orderByComparator);
    }

    /**
    * Returns all the contribuicaos.
    *
    * @return the contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the contribuicaos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contribuicaos
    * @param end the upper bound of the range of contribuicaos (not inclusive)
    * @return the range of contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the contribuicaos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contribuicaos
    * @param end the upper bound of the range of contribuicaos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<br.gov.camara.edemocracia.portlets.wikilegis.model.Contribuicao> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the contribuicaos where artigoId = &#63; from the database.
    *
    * @param artigoId the artigo ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByA(long artigoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByA(artigoId);
    }

    /**
    * Removes all the contribuicaos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of contribuicaos where artigoId = &#63;.
    *
    * @param artigoId the artigo ID
    * @return the number of matching contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static int countByA(long artigoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByA(artigoId);
    }

    /**
    * Returns the number of contribuicaos.
    *
    * @return the number of contribuicaos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ContribuicaoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ContribuicaoPersistence) PortletBeanLocatorUtil.locate(br.gov.camara.edemocracia.portlets.wikilegis.service.ClpSerializer.getServletContextName(),
                    ContribuicaoPersistence.class.getName());

            ReferenceRegistry.registerReference(ContribuicaoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated
     */
    public void setPersistence(ContribuicaoPersistence persistence) {
    }
}

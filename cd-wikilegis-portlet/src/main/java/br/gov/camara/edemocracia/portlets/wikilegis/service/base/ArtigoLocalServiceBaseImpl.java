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
package br.gov.camara.edemocracia.portlets.wikilegis.service.base;

import br.gov.camara.edemocracia.portlets.wikilegis.model.Artigo;
import br.gov.camara.edemocracia.portlets.wikilegis.service.ArtigoLocalService;
import br.gov.camara.edemocracia.portlets.wikilegis.service.ContribuicaoLocalService;
import br.gov.camara.edemocracia.portlets.wikilegis.service.EstruturaLocalService;
import br.gov.camara.edemocracia.portlets.wikilegis.service.WikiLegisService;
import br.gov.camara.edemocracia.portlets.wikilegis.service.persistence.ArtigoFinder;
import br.gov.camara.edemocracia.portlets.wikilegis.service.persistence.ArtigoPersistence;
import br.gov.camara.edemocracia.portlets.wikilegis.service.persistence.ContribuicaoPersistence;
import br.gov.camara.edemocracia.portlets.wikilegis.service.persistence.EstruturaPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * The base implementation of the artigo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.wikilegis.service.impl.ArtigoLocalServiceImpl}.
 * </p>
 *
 * @author robson
 * @see br.gov.camara.edemocracia.portlets.wikilegis.service.impl.ArtigoLocalServiceImpl
 * @see br.gov.camara.edemocracia.portlets.wikilegis.service.ArtigoLocalServiceUtil
 * @generated
 */
public abstract class ArtigoLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements ArtigoLocalService, IdentifiableBean {
    @BeanReference(type = ArtigoLocalService.class)
    protected ArtigoLocalService artigoLocalService;
    @BeanReference(type = ArtigoPersistence.class)
    protected ArtigoPersistence artigoPersistence;
    @BeanReference(type = ArtigoFinder.class)
    protected ArtigoFinder artigoFinder;
    @BeanReference(type = ContribuicaoLocalService.class)
    protected ContribuicaoLocalService contribuicaoLocalService;
    @BeanReference(type = ContribuicaoPersistence.class)
    protected ContribuicaoPersistence contribuicaoPersistence;
    @BeanReference(type = EstruturaLocalService.class)
    protected EstruturaLocalService estruturaLocalService;
    @BeanReference(type = EstruturaPersistence.class)
    protected EstruturaPersistence estruturaPersistence;
    @BeanReference(type = WikiLegisService.class)
    protected WikiLegisService wikiLegisService;
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
    private ArtigoLocalServiceClpInvoker _clpInvoker = new ArtigoLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.wikilegis.service.ArtigoLocalServiceUtil} to access the artigo local service.
     */

    /**
     * Adds the artigo to the database. Also notifies the appropriate model listeners.
     *
     * @param artigo the artigo
     * @return the artigo that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Artigo addArtigo(Artigo artigo) throws SystemException {
        artigo.setNew(true);

        return artigoPersistence.update(artigo, false);
    }

    /**
     * Creates a new artigo with the primary key. Does not add the artigo to the database.
     *
     * @param artigoId the primary key for the new artigo
     * @return the new artigo
     */
    public Artigo createArtigo(long artigoId) {
        return artigoPersistence.create(artigoId);
    }

    /**
     * Deletes the artigo with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param artigoId the primary key of the artigo
     * @return the artigo that was removed
     * @throws PortalException if a artigo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Artigo deleteArtigo(long artigoId)
        throws PortalException, SystemException {
        return artigoPersistence.remove(artigoId);
    }

    /**
     * Deletes the artigo from the database. Also notifies the appropriate model listeners.
     *
     * @param artigo the artigo
     * @return the artigo that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Artigo deleteArtigo(Artigo artigo) throws SystemException {
        return artigoPersistence.remove(artigo);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Artigo.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return artigoPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return artigoPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return artigoPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return artigoPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public Artigo fetchArtigo(long artigoId) throws SystemException {
        return artigoPersistence.fetchByPrimaryKey(artigoId);
    }

    /**
     * Returns the artigo with the primary key.
     *
     * @param artigoId the primary key of the artigo
     * @return the artigo
     * @throws PortalException if a artigo with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Artigo getArtigo(long artigoId)
        throws PortalException, SystemException {
        return artigoPersistence.findByPrimaryKey(artigoId);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return artigoPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the artigos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of artigos
     * @param end the upper bound of the range of artigos (not inclusive)
     * @return the range of artigos
     * @throws SystemException if a system exception occurred
     */
    public List<Artigo> getArtigos(int start, int end)
        throws SystemException {
        return artigoPersistence.findAll(start, end);
    }

    /**
     * Returns the number of artigos.
     *
     * @return the number of artigos
     * @throws SystemException if a system exception occurred
     */
    public int getArtigosCount() throws SystemException {
        return artigoPersistence.countAll();
    }

    /**
     * Updates the artigo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param artigo the artigo
     * @return the artigo that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Artigo updateArtigo(Artigo artigo) throws SystemException {
        return updateArtigo(artigo, true);
    }

    /**
     * Updates the artigo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param artigo the artigo
     * @param merge whether to merge the artigo with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the artigo that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Artigo updateArtigo(Artigo artigo, boolean merge)
        throws SystemException {
        artigo.setNew(false);

        return artigoPersistence.update(artigo, merge);
    }

    /**
     * Returns the artigo local service.
     *
     * @return the artigo local service
     */
    public ArtigoLocalService getArtigoLocalService() {
        return artigoLocalService;
    }

    /**
     * Sets the artigo local service.
     *
     * @param artigoLocalService the artigo local service
     */
    public void setArtigoLocalService(ArtigoLocalService artigoLocalService) {
        this.artigoLocalService = artigoLocalService;
    }

    /**
     * Returns the artigo persistence.
     *
     * @return the artigo persistence
     */
    public ArtigoPersistence getArtigoPersistence() {
        return artigoPersistence;
    }

    /**
     * Sets the artigo persistence.
     *
     * @param artigoPersistence the artigo persistence
     */
    public void setArtigoPersistence(ArtigoPersistence artigoPersistence) {
        this.artigoPersistence = artigoPersistence;
    }

    /**
     * Returns the artigo finder.
     *
     * @return the artigo finder
     */
    public ArtigoFinder getArtigoFinder() {
        return artigoFinder;
    }

    /**
     * Sets the artigo finder.
     *
     * @param artigoFinder the artigo finder
     */
    public void setArtigoFinder(ArtigoFinder artigoFinder) {
        this.artigoFinder = artigoFinder;
    }

    /**
     * Returns the contribuicao local service.
     *
     * @return the contribuicao local service
     */
    public ContribuicaoLocalService getContribuicaoLocalService() {
        return contribuicaoLocalService;
    }

    /**
     * Sets the contribuicao local service.
     *
     * @param contribuicaoLocalService the contribuicao local service
     */
    public void setContribuicaoLocalService(
        ContribuicaoLocalService contribuicaoLocalService) {
        this.contribuicaoLocalService = contribuicaoLocalService;
    }

    /**
     * Returns the contribuicao persistence.
     *
     * @return the contribuicao persistence
     */
    public ContribuicaoPersistence getContribuicaoPersistence() {
        return contribuicaoPersistence;
    }

    /**
     * Sets the contribuicao persistence.
     *
     * @param contribuicaoPersistence the contribuicao persistence
     */
    public void setContribuicaoPersistence(
        ContribuicaoPersistence contribuicaoPersistence) {
        this.contribuicaoPersistence = contribuicaoPersistence;
    }

    /**
     * Returns the estrutura local service.
     *
     * @return the estrutura local service
     */
    public EstruturaLocalService getEstruturaLocalService() {
        return estruturaLocalService;
    }

    /**
     * Sets the estrutura local service.
     *
     * @param estruturaLocalService the estrutura local service
     */
    public void setEstruturaLocalService(
        EstruturaLocalService estruturaLocalService) {
        this.estruturaLocalService = estruturaLocalService;
    }

    /**
     * Returns the estrutura persistence.
     *
     * @return the estrutura persistence
     */
    public EstruturaPersistence getEstruturaPersistence() {
        return estruturaPersistence;
    }

    /**
     * Sets the estrutura persistence.
     *
     * @param estruturaPersistence the estrutura persistence
     */
    public void setEstruturaPersistence(
        EstruturaPersistence estruturaPersistence) {
        this.estruturaPersistence = estruturaPersistence;
    }

    /**
     * Returns the wiki legis remote service.
     *
     * @return the wiki legis remote service
     */
    public WikiLegisService getWikiLegisService() {
        return wikiLegisService;
    }

    /**
     * Sets the wiki legis remote service.
     *
     * @param wikiLegisService the wiki legis remote service
     */
    public void setWikiLegisService(WikiLegisService wikiLegisService) {
        this.wikiLegisService = wikiLegisService;
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
        PersistedModelLocalServiceRegistryUtil.register("br.gov.camara.edemocracia.portlets.wikilegis.model.Artigo",
            artigoLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "br.gov.camara.edemocracia.portlets.wikilegis.model.Artigo");
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

    protected Class<?> getModelClass() {
        return Artigo.class;
    }

    protected String getModelClassName() {
        return Artigo.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = artigoPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

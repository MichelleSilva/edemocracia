package br.gov.camara.edemocracia.portlets.guiadiscussao.service.base;

import br.gov.camara.edemocracia.portlets.guiadiscussao.model.Configuracao;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.AcaoLocalService;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.ConfiguracaoLocalService;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.FaseLocalService;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.persistence.AcaoPersistence;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.persistence.ConfiguracaoPersistence;
import br.gov.camara.edemocracia.portlets.guiadiscussao.service.persistence.FasePersistence;

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
 * The base implementation of the configuracao local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.guiadiscussao.service.impl.ConfiguracaoLocalServiceImpl}.
 * </p>
 *
 * @author Robson
 * @see br.gov.camara.edemocracia.portlets.guiadiscussao.service.impl.ConfiguracaoLocalServiceImpl
 * @see br.gov.camara.edemocracia.portlets.guiadiscussao.service.ConfiguracaoLocalServiceUtil
 * @generated
 */
public abstract class ConfiguracaoLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements ConfiguracaoLocalService,
        IdentifiableBean {
    @BeanReference(type = AcaoLocalService.class)
    protected AcaoLocalService acaoLocalService;
    @BeanReference(type = AcaoPersistence.class)
    protected AcaoPersistence acaoPersistence;
    @BeanReference(type = ConfiguracaoLocalService.class)
    protected ConfiguracaoLocalService configuracaoLocalService;
    @BeanReference(type = ConfiguracaoPersistence.class)
    protected ConfiguracaoPersistence configuracaoPersistence;
    @BeanReference(type = FaseLocalService.class)
    protected FaseLocalService faseLocalService;
    @BeanReference(type = FasePersistence.class)
    protected FasePersistence fasePersistence;
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
    private ConfiguracaoLocalServiceClpInvoker _clpInvoker = new ConfiguracaoLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.guiadiscussao.service.ConfiguracaoLocalServiceUtil} to access the configuracao local service.
     */

    /**
     * Adds the configuracao to the database. Also notifies the appropriate model listeners.
     *
     * @param configuracao the configuracao
     * @return the configuracao that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Configuracao addConfiguracao(Configuracao configuracao)
        throws SystemException {
        configuracao.setNew(true);

        return configuracaoPersistence.update(configuracao, false);
    }

    /**
     * Creates a new configuracao with the primary key. Does not add the configuracao to the database.
     *
     * @param configuracaoId the primary key for the new configuracao
     * @return the new configuracao
     */
    public Configuracao createConfiguracao(long configuracaoId) {
        return configuracaoPersistence.create(configuracaoId);
    }

    /**
     * Deletes the configuracao with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param configuracaoId the primary key of the configuracao
     * @return the configuracao that was removed
     * @throws PortalException if a configuracao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Configuracao deleteConfiguracao(long configuracaoId)
        throws PortalException, SystemException {
        return configuracaoPersistence.remove(configuracaoId);
    }

    /**
     * Deletes the configuracao from the database. Also notifies the appropriate model listeners.
     *
     * @param configuracao the configuracao
     * @return the configuracao that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Configuracao deleteConfiguracao(Configuracao configuracao)
        throws SystemException {
        return configuracaoPersistence.remove(configuracao);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Configuracao.class,
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
        return configuracaoPersistence.findWithDynamicQuery(dynamicQuery);
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
        return configuracaoPersistence.findWithDynamicQuery(dynamicQuery,
            start, end);
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
        return configuracaoPersistence.findWithDynamicQuery(dynamicQuery,
            start, end, orderByComparator);
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
        return configuracaoPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public Configuracao fetchConfiguracao(long configuracaoId)
        throws SystemException {
        return configuracaoPersistence.fetchByPrimaryKey(configuracaoId);
    }

    /**
     * Returns the configuracao with the primary key.
     *
     * @param configuracaoId the primary key of the configuracao
     * @return the configuracao
     * @throws PortalException if a configuracao with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Configuracao getConfiguracao(long configuracaoId)
        throws PortalException, SystemException {
        return configuracaoPersistence.findByPrimaryKey(configuracaoId);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return configuracaoPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the configuracaos.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of configuracaos
     * @param end the upper bound of the range of configuracaos (not inclusive)
     * @return the range of configuracaos
     * @throws SystemException if a system exception occurred
     */
    public List<Configuracao> getConfiguracaos(int start, int end)
        throws SystemException {
        return configuracaoPersistence.findAll(start, end);
    }

    /**
     * Returns the number of configuracaos.
     *
     * @return the number of configuracaos
     * @throws SystemException if a system exception occurred
     */
    public int getConfiguracaosCount() throws SystemException {
        return configuracaoPersistence.countAll();
    }

    /**
     * Updates the configuracao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param configuracao the configuracao
     * @return the configuracao that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Configuracao updateConfiguracao(Configuracao configuracao)
        throws SystemException {
        return updateConfiguracao(configuracao, true);
    }

    /**
     * Updates the configuracao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param configuracao the configuracao
     * @param merge whether to merge the configuracao with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the configuracao that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Configuracao updateConfiguracao(Configuracao configuracao,
        boolean merge) throws SystemException {
        configuracao.setNew(false);

        return configuracaoPersistence.update(configuracao, merge);
    }

    /**
     * Returns the acao local service.
     *
     * @return the acao local service
     */
    public AcaoLocalService getAcaoLocalService() {
        return acaoLocalService;
    }

    /**
     * Sets the acao local service.
     *
     * @param acaoLocalService the acao local service
     */
    public void setAcaoLocalService(AcaoLocalService acaoLocalService) {
        this.acaoLocalService = acaoLocalService;
    }

    /**
     * Returns the acao persistence.
     *
     * @return the acao persistence
     */
    public AcaoPersistence getAcaoPersistence() {
        return acaoPersistence;
    }

    /**
     * Sets the acao persistence.
     *
     * @param acaoPersistence the acao persistence
     */
    public void setAcaoPersistence(AcaoPersistence acaoPersistence) {
        this.acaoPersistence = acaoPersistence;
    }

    /**
     * Returns the configuracao local service.
     *
     * @return the configuracao local service
     */
    public ConfiguracaoLocalService getConfiguracaoLocalService() {
        return configuracaoLocalService;
    }

    /**
     * Sets the configuracao local service.
     *
     * @param configuracaoLocalService the configuracao local service
     */
    public void setConfiguracaoLocalService(
        ConfiguracaoLocalService configuracaoLocalService) {
        this.configuracaoLocalService = configuracaoLocalService;
    }

    /**
     * Returns the configuracao persistence.
     *
     * @return the configuracao persistence
     */
    public ConfiguracaoPersistence getConfiguracaoPersistence() {
        return configuracaoPersistence;
    }

    /**
     * Sets the configuracao persistence.
     *
     * @param configuracaoPersistence the configuracao persistence
     */
    public void setConfiguracaoPersistence(
        ConfiguracaoPersistence configuracaoPersistence) {
        this.configuracaoPersistence = configuracaoPersistence;
    }

    /**
     * Returns the fase local service.
     *
     * @return the fase local service
     */
    public FaseLocalService getFaseLocalService() {
        return faseLocalService;
    }

    /**
     * Sets the fase local service.
     *
     * @param faseLocalService the fase local service
     */
    public void setFaseLocalService(FaseLocalService faseLocalService) {
        this.faseLocalService = faseLocalService;
    }

    /**
     * Returns the fase persistence.
     *
     * @return the fase persistence
     */
    public FasePersistence getFasePersistence() {
        return fasePersistence;
    }

    /**
     * Sets the fase persistence.
     *
     * @param fasePersistence the fase persistence
     */
    public void setFasePersistence(FasePersistence fasePersistence) {
        this.fasePersistence = fasePersistence;
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
        PersistedModelLocalServiceRegistryUtil.register("br.gov.camara.edemocracia.portlets.guiadiscussao.model.Configuracao",
            configuracaoLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "br.gov.camara.edemocracia.portlets.guiadiscussao.model.Configuracao");
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
        return Configuracao.class;
    }

    protected String getModelClassName() {
        return Configuracao.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = configuracaoPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

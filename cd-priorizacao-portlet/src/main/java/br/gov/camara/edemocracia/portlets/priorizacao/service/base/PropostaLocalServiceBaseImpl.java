package br.gov.camara.edemocracia.portlets.priorizacao.service.base;

import br.gov.camara.edemocracia.portlets.priorizacao.model.Proposta;
import br.gov.camara.edemocracia.portlets.priorizacao.service.ConfiguracaoLocalService;
import br.gov.camara.edemocracia.portlets.priorizacao.service.EixoLocalService;
import br.gov.camara.edemocracia.portlets.priorizacao.service.PriorizacaoService;
import br.gov.camara.edemocracia.portlets.priorizacao.service.PropostaLocalService;
import br.gov.camara.edemocracia.portlets.priorizacao.service.VotoLocalService;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.ConfiguracaoPersistence;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.EixoPersistence;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.PropostaFinder;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.PropostaPersistence;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.VotoFinder;
import br.gov.camara.edemocracia.portlets.priorizacao.service.persistence.VotoPersistence;

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
 * The base implementation of the proposta local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.priorizacao.service.impl.PropostaLocalServiceImpl}.
 * </p>
 *
 * @author robson
 * @see br.gov.camara.edemocracia.portlets.priorizacao.service.impl.PropostaLocalServiceImpl
 * @see br.gov.camara.edemocracia.portlets.priorizacao.service.PropostaLocalServiceUtil
 * @generated
 */
public abstract class PropostaLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements PropostaLocalService, IdentifiableBean {
    @BeanReference(type = ConfiguracaoLocalService.class)
    protected ConfiguracaoLocalService configuracaoLocalService;
    @BeanReference(type = ConfiguracaoPersistence.class)
    protected ConfiguracaoPersistence configuracaoPersistence;
    @BeanReference(type = EixoLocalService.class)
    protected EixoLocalService eixoLocalService;
    @BeanReference(type = EixoPersistence.class)
    protected EixoPersistence eixoPersistence;
    @BeanReference(type = PriorizacaoService.class)
    protected PriorizacaoService priorizacaoService;
    @BeanReference(type = PropostaLocalService.class)
    protected PropostaLocalService propostaLocalService;
    @BeanReference(type = PropostaPersistence.class)
    protected PropostaPersistence propostaPersistence;
    @BeanReference(type = PropostaFinder.class)
    protected PropostaFinder propostaFinder;
    @BeanReference(type = VotoLocalService.class)
    protected VotoLocalService votoLocalService;
    @BeanReference(type = VotoPersistence.class)
    protected VotoPersistence votoPersistence;
    @BeanReference(type = VotoFinder.class)
    protected VotoFinder votoFinder;
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
    private PropostaLocalServiceClpInvoker _clpInvoker = new PropostaLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.priorizacao.service.PropostaLocalServiceUtil} to access the proposta local service.
     */

    /**
     * Adds the proposta to the database. Also notifies the appropriate model listeners.
     *
     * @param proposta the proposta
     * @return the proposta that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Proposta addProposta(Proposta proposta) throws SystemException {
        proposta.setNew(true);

        return propostaPersistence.update(proposta, false);
    }

    /**
     * Creates a new proposta with the primary key. Does not add the proposta to the database.
     *
     * @param propostaId the primary key for the new proposta
     * @return the new proposta
     */
    public Proposta createProposta(long propostaId) {
        return propostaPersistence.create(propostaId);
    }

    /**
     * Deletes the proposta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param propostaId the primary key of the proposta
     * @return the proposta that was removed
     * @throws PortalException if a proposta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Proposta deleteProposta(long propostaId)
        throws PortalException, SystemException {
        return propostaPersistence.remove(propostaId);
    }

    /**
     * Deletes the proposta from the database. Also notifies the appropriate model listeners.
     *
     * @param proposta the proposta
     * @return the proposta that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public Proposta deleteProposta(Proposta proposta) throws SystemException {
        return propostaPersistence.remove(proposta);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Proposta.class,
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
        return propostaPersistence.findWithDynamicQuery(dynamicQuery);
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
        return propostaPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
        return propostaPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return propostaPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public Proposta fetchProposta(long propostaId) throws SystemException {
        return propostaPersistence.fetchByPrimaryKey(propostaId);
    }

    /**
     * Returns the proposta with the primary key.
     *
     * @param propostaId the primary key of the proposta
     * @return the proposta
     * @throws PortalException if a proposta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public Proposta getProposta(long propostaId)
        throws PortalException, SystemException {
        return propostaPersistence.findByPrimaryKey(propostaId);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return propostaPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the propostas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of propostas
     * @param end the upper bound of the range of propostas (not inclusive)
     * @return the range of propostas
     * @throws SystemException if a system exception occurred
     */
    public List<Proposta> getPropostas(int start, int end)
        throws SystemException {
        return propostaPersistence.findAll(start, end);
    }

    /**
     * Returns the number of propostas.
     *
     * @return the number of propostas
     * @throws SystemException if a system exception occurred
     */
    public int getPropostasCount() throws SystemException {
        return propostaPersistence.countAll();
    }

    /**
     * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param proposta the proposta
     * @return the proposta that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Proposta updateProposta(Proposta proposta) throws SystemException {
        return updateProposta(proposta, true);
    }

    /**
     * Updates the proposta in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param proposta the proposta
     * @param merge whether to merge the proposta with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the proposta that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public Proposta updateProposta(Proposta proposta, boolean merge)
        throws SystemException {
        proposta.setNew(false);

        return propostaPersistence.update(proposta, merge);
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
     * Returns the eixo local service.
     *
     * @return the eixo local service
     */
    public EixoLocalService getEixoLocalService() {
        return eixoLocalService;
    }

    /**
     * Sets the eixo local service.
     *
     * @param eixoLocalService the eixo local service
     */
    public void setEixoLocalService(EixoLocalService eixoLocalService) {
        this.eixoLocalService = eixoLocalService;
    }

    /**
     * Returns the eixo persistence.
     *
     * @return the eixo persistence
     */
    public EixoPersistence getEixoPersistence() {
        return eixoPersistence;
    }

    /**
     * Sets the eixo persistence.
     *
     * @param eixoPersistence the eixo persistence
     */
    public void setEixoPersistence(EixoPersistence eixoPersistence) {
        this.eixoPersistence = eixoPersistence;
    }

    /**
     * Returns the priorizacao remote service.
     *
     * @return the priorizacao remote service
     */
    public PriorizacaoService getPriorizacaoService() {
        return priorizacaoService;
    }

    /**
     * Sets the priorizacao remote service.
     *
     * @param priorizacaoService the priorizacao remote service
     */
    public void setPriorizacaoService(PriorizacaoService priorizacaoService) {
        this.priorizacaoService = priorizacaoService;
    }

    /**
     * Returns the proposta local service.
     *
     * @return the proposta local service
     */
    public PropostaLocalService getPropostaLocalService() {
        return propostaLocalService;
    }

    /**
     * Sets the proposta local service.
     *
     * @param propostaLocalService the proposta local service
     */
    public void setPropostaLocalService(
        PropostaLocalService propostaLocalService) {
        this.propostaLocalService = propostaLocalService;
    }

    /**
     * Returns the proposta persistence.
     *
     * @return the proposta persistence
     */
    public PropostaPersistence getPropostaPersistence() {
        return propostaPersistence;
    }

    /**
     * Sets the proposta persistence.
     *
     * @param propostaPersistence the proposta persistence
     */
    public void setPropostaPersistence(PropostaPersistence propostaPersistence) {
        this.propostaPersistence = propostaPersistence;
    }

    /**
     * Returns the proposta finder.
     *
     * @return the proposta finder
     */
    public PropostaFinder getPropostaFinder() {
        return propostaFinder;
    }

    /**
     * Sets the proposta finder.
     *
     * @param propostaFinder the proposta finder
     */
    public void setPropostaFinder(PropostaFinder propostaFinder) {
        this.propostaFinder = propostaFinder;
    }

    /**
     * Returns the voto local service.
     *
     * @return the voto local service
     */
    public VotoLocalService getVotoLocalService() {
        return votoLocalService;
    }

    /**
     * Sets the voto local service.
     *
     * @param votoLocalService the voto local service
     */
    public void setVotoLocalService(VotoLocalService votoLocalService) {
        this.votoLocalService = votoLocalService;
    }

    /**
     * Returns the voto persistence.
     *
     * @return the voto persistence
     */
    public VotoPersistence getVotoPersistence() {
        return votoPersistence;
    }

    /**
     * Sets the voto persistence.
     *
     * @param votoPersistence the voto persistence
     */
    public void setVotoPersistence(VotoPersistence votoPersistence) {
        this.votoPersistence = votoPersistence;
    }

    /**
     * Returns the voto finder.
     *
     * @return the voto finder
     */
    public VotoFinder getVotoFinder() {
        return votoFinder;
    }

    /**
     * Sets the voto finder.
     *
     * @param votoFinder the voto finder
     */
    public void setVotoFinder(VotoFinder votoFinder) {
        this.votoFinder = votoFinder;
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
        PersistedModelLocalServiceRegistryUtil.register("br.gov.camara.edemocracia.portlets.priorizacao.model.Proposta",
            propostaLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "br.gov.camara.edemocracia.portlets.priorizacao.model.Proposta");
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
        return Proposta.class;
    }

    protected String getModelClassName() {
        return Proposta.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = propostaPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

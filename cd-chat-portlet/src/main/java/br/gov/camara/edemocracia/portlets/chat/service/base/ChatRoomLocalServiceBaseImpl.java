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
package br.gov.camara.edemocracia.portlets.chat.service.base;

import br.gov.camara.edemocracia.portlets.chat.model.ChatRoom;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomLocalService;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomMessageLocalService;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomService;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomTwitterLocalService;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomUserLocalService;
import br.gov.camara.edemocracia.portlets.chat.service.ChatRoomVideoLocalService;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomFinder;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomMessagePersistence;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomPersistence;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomTwitterPersistence;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomUserPersistence;
import br.gov.camara.edemocracia.portlets.chat.service.persistence.ChatRoomVideoPersistence;

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
 * The base implementation of the chat room local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.chat.service.impl.ChatRoomLocalServiceImpl}.
 * </p>
 *
 * @author Ricardo Lima
 * @see br.gov.camara.edemocracia.portlets.chat.service.impl.ChatRoomLocalServiceImpl
 * @see br.gov.camara.edemocracia.portlets.chat.service.ChatRoomLocalServiceUtil
 * @generated
 */
public abstract class ChatRoomLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements ChatRoomLocalService, IdentifiableBean {
    @BeanReference(type = ChatRoomLocalService.class)
    protected ChatRoomLocalService chatRoomLocalService;
    @BeanReference(type = ChatRoomService.class)
    protected ChatRoomService chatRoomService;
    @BeanReference(type = ChatRoomPersistence.class)
    protected ChatRoomPersistence chatRoomPersistence;
    @BeanReference(type = ChatRoomFinder.class)
    protected ChatRoomFinder chatRoomFinder;
    @BeanReference(type = ChatRoomMessageLocalService.class)
    protected ChatRoomMessageLocalService chatRoomMessageLocalService;
    @BeanReference(type = ChatRoomMessagePersistence.class)
    protected ChatRoomMessagePersistence chatRoomMessagePersistence;
    @BeanReference(type = ChatRoomTwitterLocalService.class)
    protected ChatRoomTwitterLocalService chatRoomTwitterLocalService;
    @BeanReference(type = ChatRoomTwitterPersistence.class)
    protected ChatRoomTwitterPersistence chatRoomTwitterPersistence;
    @BeanReference(type = ChatRoomUserLocalService.class)
    protected ChatRoomUserLocalService chatRoomUserLocalService;
    @BeanReference(type = ChatRoomUserPersistence.class)
    protected ChatRoomUserPersistence chatRoomUserPersistence;
    @BeanReference(type = ChatRoomVideoLocalService.class)
    protected ChatRoomVideoLocalService chatRoomVideoLocalService;
    @BeanReference(type = ChatRoomVideoPersistence.class)
    protected ChatRoomVideoPersistence chatRoomVideoPersistence;
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
    private ChatRoomLocalServiceClpInvoker _clpInvoker = new ChatRoomLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.chat.service.ChatRoomLocalServiceUtil} to access the chat room local service.
     */

    /**
     * Adds the chat room to the database. Also notifies the appropriate model listeners.
     *
     * @param chatRoom the chat room
     * @return the chat room that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public ChatRoom addChatRoom(ChatRoom chatRoom) throws SystemException {
        chatRoom.setNew(true);

        return chatRoomPersistence.update(chatRoom, false);
    }

    /**
     * Creates a new chat room with the primary key. Does not add the chat room to the database.
     *
     * @param roomId the primary key for the new chat room
     * @return the new chat room
     */
    public ChatRoom createChatRoom(long roomId) {
        return chatRoomPersistence.create(roomId);
    }

    /**
     * Deletes the chat room with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param roomId the primary key of the chat room
     * @return the chat room that was removed
     * @throws PortalException if a chat room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public ChatRoom deleteChatRoom(long roomId)
        throws PortalException, SystemException {
        return chatRoomPersistence.remove(roomId);
    }

    /**
     * Deletes the chat room from the database. Also notifies the appropriate model listeners.
     *
     * @param chatRoom the chat room
     * @return the chat room that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    public ChatRoom deleteChatRoom(ChatRoom chatRoom) throws SystemException {
        return chatRoomPersistence.remove(chatRoom);
    }

    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(ChatRoom.class,
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
        return chatRoomPersistence.findWithDynamicQuery(dynamicQuery);
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
        return chatRoomPersistence.findWithDynamicQuery(dynamicQuery, start, end);
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
        return chatRoomPersistence.findWithDynamicQuery(dynamicQuery, start,
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
        return chatRoomPersistence.countWithDynamicQuery(dynamicQuery);
    }

    public ChatRoom fetchChatRoom(long roomId) throws SystemException {
        return chatRoomPersistence.fetchByPrimaryKey(roomId);
    }

    /**
     * Returns the chat room with the primary key.
     *
     * @param roomId the primary key of the chat room
     * @return the chat room
     * @throws PortalException if a chat room with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ChatRoom getChatRoom(long roomId)
        throws PortalException, SystemException {
        return chatRoomPersistence.findByPrimaryKey(roomId);
    }

    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return chatRoomPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the chat rooms.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of chat rooms
     * @param end the upper bound of the range of chat rooms (not inclusive)
     * @return the range of chat rooms
     * @throws SystemException if a system exception occurred
     */
    public List<ChatRoom> getChatRooms(int start, int end)
        throws SystemException {
        return chatRoomPersistence.findAll(start, end);
    }

    /**
     * Returns the number of chat rooms.
     *
     * @return the number of chat rooms
     * @throws SystemException if a system exception occurred
     */
    public int getChatRoomsCount() throws SystemException {
        return chatRoomPersistence.countAll();
    }

    /**
     * Updates the chat room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param chatRoom the chat room
     * @return the chat room that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public ChatRoom updateChatRoom(ChatRoom chatRoom) throws SystemException {
        return updateChatRoom(chatRoom, true);
    }

    /**
     * Updates the chat room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param chatRoom the chat room
     * @param merge whether to merge the chat room with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
     * @return the chat room that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    public ChatRoom updateChatRoom(ChatRoom chatRoom, boolean merge)
        throws SystemException {
        chatRoom.setNew(false);

        return chatRoomPersistence.update(chatRoom, merge);
    }

    /**
     * Returns the chat room local service.
     *
     * @return the chat room local service
     */
    public ChatRoomLocalService getChatRoomLocalService() {
        return chatRoomLocalService;
    }

    /**
     * Sets the chat room local service.
     *
     * @param chatRoomLocalService the chat room local service
     */
    public void setChatRoomLocalService(
        ChatRoomLocalService chatRoomLocalService) {
        this.chatRoomLocalService = chatRoomLocalService;
    }

    /**
     * Returns the chat room remote service.
     *
     * @return the chat room remote service
     */
    public ChatRoomService getChatRoomService() {
        return chatRoomService;
    }

    /**
     * Sets the chat room remote service.
     *
     * @param chatRoomService the chat room remote service
     */
    public void setChatRoomService(ChatRoomService chatRoomService) {
        this.chatRoomService = chatRoomService;
    }

    /**
     * Returns the chat room persistence.
     *
     * @return the chat room persistence
     */
    public ChatRoomPersistence getChatRoomPersistence() {
        return chatRoomPersistence;
    }

    /**
     * Sets the chat room persistence.
     *
     * @param chatRoomPersistence the chat room persistence
     */
    public void setChatRoomPersistence(ChatRoomPersistence chatRoomPersistence) {
        this.chatRoomPersistence = chatRoomPersistence;
    }

    /**
     * Returns the chat room finder.
     *
     * @return the chat room finder
     */
    public ChatRoomFinder getChatRoomFinder() {
        return chatRoomFinder;
    }

    /**
     * Sets the chat room finder.
     *
     * @param chatRoomFinder the chat room finder
     */
    public void setChatRoomFinder(ChatRoomFinder chatRoomFinder) {
        this.chatRoomFinder = chatRoomFinder;
    }

    /**
     * Returns the chat room message local service.
     *
     * @return the chat room message local service
     */
    public ChatRoomMessageLocalService getChatRoomMessageLocalService() {
        return chatRoomMessageLocalService;
    }

    /**
     * Sets the chat room message local service.
     *
     * @param chatRoomMessageLocalService the chat room message local service
     */
    public void setChatRoomMessageLocalService(
        ChatRoomMessageLocalService chatRoomMessageLocalService) {
        this.chatRoomMessageLocalService = chatRoomMessageLocalService;
    }

    /**
     * Returns the chat room message persistence.
     *
     * @return the chat room message persistence
     */
    public ChatRoomMessagePersistence getChatRoomMessagePersistence() {
        return chatRoomMessagePersistence;
    }

    /**
     * Sets the chat room message persistence.
     *
     * @param chatRoomMessagePersistence the chat room message persistence
     */
    public void setChatRoomMessagePersistence(
        ChatRoomMessagePersistence chatRoomMessagePersistence) {
        this.chatRoomMessagePersistence = chatRoomMessagePersistence;
    }

    /**
     * Returns the chat room twitter local service.
     *
     * @return the chat room twitter local service
     */
    public ChatRoomTwitterLocalService getChatRoomTwitterLocalService() {
        return chatRoomTwitterLocalService;
    }

    /**
     * Sets the chat room twitter local service.
     *
     * @param chatRoomTwitterLocalService the chat room twitter local service
     */
    public void setChatRoomTwitterLocalService(
        ChatRoomTwitterLocalService chatRoomTwitterLocalService) {
        this.chatRoomTwitterLocalService = chatRoomTwitterLocalService;
    }

    /**
     * Returns the chat room twitter persistence.
     *
     * @return the chat room twitter persistence
     */
    public ChatRoomTwitterPersistence getChatRoomTwitterPersistence() {
        return chatRoomTwitterPersistence;
    }

    /**
     * Sets the chat room twitter persistence.
     *
     * @param chatRoomTwitterPersistence the chat room twitter persistence
     */
    public void setChatRoomTwitterPersistence(
        ChatRoomTwitterPersistence chatRoomTwitterPersistence) {
        this.chatRoomTwitterPersistence = chatRoomTwitterPersistence;
    }

    /**
     * Returns the chat room user local service.
     *
     * @return the chat room user local service
     */
    public ChatRoomUserLocalService getChatRoomUserLocalService() {
        return chatRoomUserLocalService;
    }

    /**
     * Sets the chat room user local service.
     *
     * @param chatRoomUserLocalService the chat room user local service
     */
    public void setChatRoomUserLocalService(
        ChatRoomUserLocalService chatRoomUserLocalService) {
        this.chatRoomUserLocalService = chatRoomUserLocalService;
    }

    /**
     * Returns the chat room user persistence.
     *
     * @return the chat room user persistence
     */
    public ChatRoomUserPersistence getChatRoomUserPersistence() {
        return chatRoomUserPersistence;
    }

    /**
     * Sets the chat room user persistence.
     *
     * @param chatRoomUserPersistence the chat room user persistence
     */
    public void setChatRoomUserPersistence(
        ChatRoomUserPersistence chatRoomUserPersistence) {
        this.chatRoomUserPersistence = chatRoomUserPersistence;
    }

    /**
     * Returns the chat room video local service.
     *
     * @return the chat room video local service
     */
    public ChatRoomVideoLocalService getChatRoomVideoLocalService() {
        return chatRoomVideoLocalService;
    }

    /**
     * Sets the chat room video local service.
     *
     * @param chatRoomVideoLocalService the chat room video local service
     */
    public void setChatRoomVideoLocalService(
        ChatRoomVideoLocalService chatRoomVideoLocalService) {
        this.chatRoomVideoLocalService = chatRoomVideoLocalService;
    }

    /**
     * Returns the chat room video persistence.
     *
     * @return the chat room video persistence
     */
    public ChatRoomVideoPersistence getChatRoomVideoPersistence() {
        return chatRoomVideoPersistence;
    }

    /**
     * Sets the chat room video persistence.
     *
     * @param chatRoomVideoPersistence the chat room video persistence
     */
    public void setChatRoomVideoPersistence(
        ChatRoomVideoPersistence chatRoomVideoPersistence) {
        this.chatRoomVideoPersistence = chatRoomVideoPersistence;
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
        PersistedModelLocalServiceRegistryUtil.register("br.gov.camara.edemocracia.portlets.chat.model.ChatRoom",
            chatRoomLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "br.gov.camara.edemocracia.portlets.chat.model.ChatRoom");
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
        return ChatRoom.class;
    }

    protected String getModelClassName() {
        return ChatRoom.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = chatRoomPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}

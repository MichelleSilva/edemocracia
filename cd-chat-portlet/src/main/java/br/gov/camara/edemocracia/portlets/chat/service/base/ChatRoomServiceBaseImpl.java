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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the chat room remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.gov.camara.edemocracia.portlets.chat.service.impl.ChatRoomServiceImpl}.
 * </p>
 *
 * @author Ricardo Lima
 * @see br.gov.camara.edemocracia.portlets.chat.service.impl.ChatRoomServiceImpl
 * @see br.gov.camara.edemocracia.portlets.chat.service.ChatRoomServiceUtil
 * @generated
 */
public abstract class ChatRoomServiceBaseImpl extends BaseServiceImpl
    implements ChatRoomService, IdentifiableBean {
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
    private ChatRoomServiceClpInvoker _clpInvoker = new ChatRoomServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link br.gov.camara.edemocracia.portlets.chat.service.ChatRoomServiceUtil} to access the chat room remote service.
     */

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

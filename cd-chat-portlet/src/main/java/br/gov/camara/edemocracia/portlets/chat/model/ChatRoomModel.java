package br.gov.camara.edemocracia.portlets.chat.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the ChatRoom service. Represents a row in the &quot;CDChat_ChatRoom&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link br.gov.camara.edemocracia.portlets.chat.model.impl.ChatRoomModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link br.gov.camara.edemocracia.portlets.chat.model.impl.ChatRoomImpl}.
 * </p>
 *
 * @author Ricardo Lima
 * @see ChatRoom
 * @see br.gov.camara.edemocracia.portlets.chat.model.impl.ChatRoomImpl
 * @see br.gov.camara.edemocracia.portlets.chat.model.impl.ChatRoomModelImpl
 * @generated
 */
public interface ChatRoomModel extends BaseModel<ChatRoom> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a chat room model instance should use the {@link ChatRoom} interface instead.
     */

    /**
     * Returns the primary key of this chat room.
     *
     * @return the primary key of this chat room
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this chat room.
     *
     * @param primaryKey the primary key of this chat room
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the room ID of this chat room.
     *
     * @return the room ID of this chat room
     */
    public long getRoomId();

    /**
     * Sets the room ID of this chat room.
     *
     * @param roomId the room ID of this chat room
     */
    public void setRoomId(long roomId);

    /**
     * Returns the room name of this chat room.
     *
     * @return the room name of this chat room
     */
    @AutoEscape
    public String getRoomName();

    /**
     * Sets the room name of this chat room.
     *
     * @param roomName the room name of this chat room
     */
    public void setRoomName(String roomName);

    /**
     * Returns the description of this chat room.
     *
     * @return the description of this chat room
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this chat room.
     *
     * @param description the description of this chat room
     */
    public void setDescription(String description);

    /**
     * Returns the open policy of this chat room.
     *
     * @return the open policy of this chat room
     */
    public int getOpenPolicy();

    /**
     * Sets the open policy of this chat room.
     *
     * @param openPolicy the open policy of this chat room
     */
    public void setOpenPolicy(int openPolicy);

    /**
     * Returns the status of this chat room.
     *
     * @return the status of this chat room
     */
    public int getStatus();

    /**
     * Sets the status of this chat room.
     *
     * @param status the status of this chat room
     */
    public void setStatus(int status);

    /**
     * Returns the open from of this chat room.
     *
     * @return the open from of this chat room
     */
    public Date getOpenFrom();

    /**
     * Sets the open from of this chat room.
     *
     * @param openFrom the open from of this chat room
     */
    public void setOpenFrom(Date openFrom);

    /**
     * Returns the open until of this chat room.
     *
     * @return the open until of this chat room
     */
    public Date getOpenUntil();

    /**
     * Sets the open until of this chat room.
     *
     * @param openUntil the open until of this chat room
     */
    public void setOpenUntil(Date openUntil);

    /**
     * Returns the moderated of this chat room.
     *
     * @return the moderated of this chat room
     */
    public boolean getModerated();

    /**
     * Returns <code>true</code> if this chat room is moderated.
     *
     * @return <code>true</code> if this chat room is moderated; <code>false</code> otherwise
     */
    public boolean isModerated();

    /**
     * Sets whether this chat room is moderated.
     *
     * @param moderated the moderated of this chat room
     */
    public void setModerated(boolean moderated);

    /**
     * Returns the capacity of this chat room.
     *
     * @return the capacity of this chat room
     */
    public int getCapacity();

    /**
     * Sets the capacity of this chat room.
     *
     * @param capacity the capacity of this chat room
     */
    public void setCapacity(int capacity);

    /**
     * Returns the max simultaneous users spying of this chat room.
     *
     * @return the max simultaneous users spying of this chat room
     */
    public int getMaxSimultaneousUsersSpying();

    /**
     * Sets the max simultaneous users spying of this chat room.
     *
     * @param maxSimultaneousUsersSpying the max simultaneous users spying of this chat room
     */
    public void setMaxSimultaneousUsersSpying(int maxSimultaneousUsersSpying);

    /**
     * Returns the max simultaneous users of this chat room.
     *
     * @return the max simultaneous users of this chat room
     */
    public int getMaxSimultaneousUsers();

    /**
     * Sets the max simultaneous users of this chat room.
     *
     * @param maxSimultaneousUsers the max simultaneous users of this chat room
     */
    public void setMaxSimultaneousUsers(int maxSimultaneousUsers);

    /**
     * Returns the anonymous allowed of this chat room.
     *
     * @return the anonymous allowed of this chat room
     */
    public boolean getAnonymousAllowed();

    /**
     * Returns <code>true</code> if this chat room is anonymous allowed.
     *
     * @return <code>true</code> if this chat room is anonymous allowed; <code>false</code> otherwise
     */
    public boolean isAnonymousAllowed();

    /**
     * Sets whether this chat room is anonymous allowed.
     *
     * @param anonymousAllowed the anonymous allowed of this chat room
     */
    public void setAnonymousAllowed(boolean anonymousAllowed);

    /**
     * Returns the guest ID of this chat room.
     *
     * @return the guest ID of this chat room
     */
    public long getGuestId();

    /**
     * Sets the guest ID of this chat room.
     *
     * @param guestId the guest ID of this chat room
     */
    public void setGuestId(long guestId);

    /**
     * Returns the guest name of this chat room.
     *
     * @return the guest name of this chat room
     */
    @AutoEscape
    public String getGuestName();

    /**
     * Sets the guest name of this chat room.
     *
     * @param guestName the guest name of this chat room
     */
    public void setGuestName(String guestName);

    /**
     * Returns the company ID of this chat room.
     *
     * @return the company ID of this chat room
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this chat room.
     *
     * @param companyId the company ID of this chat room
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this chat room.
     *
     * @return the group ID of this chat room
     */
    public long getGroupId();

    /**
     * Sets the group ID of this chat room.
     *
     * @param groupId the group ID of this chat room
     */
    public void setGroupId(long groupId);

    /**
     * Returns the use policy enabled of this chat room.
     *
     * @return the use policy enabled of this chat room
     */
    public boolean getUsePolicyEnabled();

    /**
     * Returns <code>true</code> if this chat room is use policy enabled.
     *
     * @return <code>true</code> if this chat room is use policy enabled; <code>false</code> otherwise
     */
    public boolean isUsePolicyEnabled();

    /**
     * Sets whether this chat room is use policy enabled.
     *
     * @param usePolicyEnabled the use policy enabled of this chat room
     */
    public void setUsePolicyEnabled(boolean usePolicyEnabled);

    /**
     * Returns the use policy u r l of this chat room.
     *
     * @return the use policy u r l of this chat room
     */
    @AutoEscape
    public String getUsePolicyURL();

    /**
     * Sets the use policy u r l of this chat room.
     *
     * @param usePolicyURL the use policy u r l of this chat room
     */
    public void setUsePolicyURL(String usePolicyURL);

    /**
     * Returns the image ID of this chat room.
     *
     * @return the image ID of this chat room
     */
    public long getImageId();

    /**
     * Sets the image ID of this chat room.
     *
     * @param imageId the image ID of this chat room
     */
    public void setImageId(long imageId);

    /**
     * Returns the video live ID of this chat room.
     *
     * @return the video live ID of this chat room
     */
    public long getVideoLiveId();

    /**
     * Sets the video live ID of this chat room.
     *
     * @param videoLiveId the video live ID of this chat room
     */
    public void setVideoLiveId(long videoLiveId);

    /**
     * Returns the video recorded ID of this chat room.
     *
     * @return the video recorded ID of this chat room
     */
    public long getVideoRecordedId();

    /**
     * Sets the video recorded ID of this chat room.
     *
     * @param videoRecordedId the video recorded ID of this chat room
     */
    public void setVideoRecordedId(long videoRecordedId);

    /**
     * Returns the create date of this chat room.
     *
     * @return the create date of this chat room
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this chat room.
     *
     * @param createDate the create date of this chat room
     */
    public void setCreateDate(Date createDate);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(ChatRoom chatRoom);

    public int hashCode();

    public CacheModel<ChatRoom> toCacheModel();

    public ChatRoom toEscapedModel();

    public String toString();

    public String toXmlString();
}

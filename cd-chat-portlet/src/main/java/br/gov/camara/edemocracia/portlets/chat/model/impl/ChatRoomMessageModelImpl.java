package br.gov.camara.edemocracia.portlets.chat.model.impl;

import br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage;
import br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessageModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ChatRoomMessage service. Represents a row in the &quot;CDChat_ChatRoomMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ChatRoomMessageImpl}.
 * </p>
 *
 * @author Ricardo Lima
 * @see ChatRoomMessageImpl
 * @see br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage
 * @see br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessageModel
 * @generated
 */
public class ChatRoomMessageModelImpl extends BaseModelImpl<ChatRoomMessage>
    implements ChatRoomMessageModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a chat room message model instance should use the {@link br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage} interface instead.
     */
    public static final String TABLE_NAME = "CDChat_ChatRoomMessage";
    public static final Object[][] TABLE_COLUMNS = {
            { "chatMessageId", Types.BIGINT },
            { "parentMessageId", Types.BIGINT },
            { "chatRoomId", Types.BIGINT },
            { "exportedPosition", Types.BIGINT },
            { "exportedRemoved", Types.BOOLEAN },
            { "messageType", Types.INTEGER },
            { "messageStatus", Types.INTEGER },
            { "senderId", Types.BIGINT },
            { "senderName", Types.VARCHAR },
            { "senderUF", Types.BIGINT },
            { "senderEmail", Types.VARCHAR },
            { "senderType", Types.INTEGER },
            { "messageText", Types.VARCHAR },
            { "textType", Types.INTEGER },
            { "messageTS", Types.TIMESTAMP },
            { "messagePublic", Types.BOOLEAN },
            { "adminMessage", Types.BOOLEAN },
            { "recipientUserId", Types.BIGINT },
            { "recipientUserName", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table CDChat_ChatRoomMessage (chatMessageId LONG not null primary key,parentMessageId LONG,chatRoomId LONG,exportedPosition LONG,exportedRemoved BOOLEAN,messageType INTEGER,messageStatus INTEGER,senderId LONG,senderName VARCHAR(75) null,senderUF LONG,senderEmail VARCHAR(75) null,senderType INTEGER,messageText VARCHAR(3900) null,textType INTEGER,messageTS DATE null,messagePublic BOOLEAN,adminMessage BOOLEAN,recipientUserId LONG,recipientUserName VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table CDChat_ChatRoomMessage";
    public static final String ORDER_BY_JPQL = " ORDER BY chatRoomMessage.messageTS ASC";
    public static final String ORDER_BY_SQL = " ORDER BY CDChat_ChatRoomMessage.messageTS ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage"),
            true);
    public static long MESSAGEPUBLIC_COLUMN_BITMASK = 1L;
    public static long MESSAGETS_COLUMN_BITMASK = 2L;
    public static long RECIPIENTUSERID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage"));
    private static ClassLoader _classLoader = ChatRoomMessage.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            ChatRoomMessage.class
        };
    private long _chatMessageId;
    private long _parentMessageId;
    private long _chatRoomId;
    private long _exportedPosition;
    private boolean _exportedRemoved;
    private int _messageType;
    private int _messageStatus;
    private long _senderId;
    private String _senderName;
    private long _senderUF;
    private String _senderEmail;
    private int _senderType;
    private String _messageText;
    private int _textType;
    private Date _messageTS;
    private Date _originalMessageTS;
    private boolean _messagePublic;
    private boolean _originalMessagePublic;
    private boolean _setOriginalMessagePublic;
    private boolean _adminMessage;
    private long _recipientUserId;
    private String _recipientUserUuid;
    private long _originalRecipientUserId;
    private boolean _setOriginalRecipientUserId;
    private String _recipientUserName;
    private long _columnBitmask;
    private ChatRoomMessage _escapedModelProxy;

    public ChatRoomMessageModelImpl() {
    }

    public long getPrimaryKey() {
        return _chatMessageId;
    }

    public void setPrimaryKey(long primaryKey) {
        setChatMessageId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_chatMessageId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return ChatRoomMessage.class;
    }

    public String getModelClassName() {
        return ChatRoomMessage.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("chatMessageId", getChatMessageId());
        attributes.put("parentMessageId", getParentMessageId());
        attributes.put("chatRoomId", getChatRoomId());
        attributes.put("exportedPosition", getExportedPosition());
        attributes.put("exportedRemoved", getExportedRemoved());
        attributes.put("messageType", getMessageType());
        attributes.put("messageStatus", getMessageStatus());
        attributes.put("senderId", getSenderId());
        attributes.put("senderName", getSenderName());
        attributes.put("senderUF", getSenderUF());
        attributes.put("senderEmail", getSenderEmail());
        attributes.put("senderType", getSenderType());
        attributes.put("messageText", getMessageText());
        attributes.put("textType", getTextType());
        attributes.put("messageTS", getMessageTS());
        attributes.put("messagePublic", getMessagePublic());
        attributes.put("adminMessage", getAdminMessage());
        attributes.put("recipientUserId", getRecipientUserId());
        attributes.put("recipientUserName", getRecipientUserName());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long chatMessageId = (Long) attributes.get("chatMessageId");

        if (chatMessageId != null) {
            setChatMessageId(chatMessageId);
        }

        Long parentMessageId = (Long) attributes.get("parentMessageId");

        if (parentMessageId != null) {
            setParentMessageId(parentMessageId);
        }

        Long chatRoomId = (Long) attributes.get("chatRoomId");

        if (chatRoomId != null) {
            setChatRoomId(chatRoomId);
        }

        Long exportedPosition = (Long) attributes.get("exportedPosition");

        if (exportedPosition != null) {
            setExportedPosition(exportedPosition);
        }

        Boolean exportedRemoved = (Boolean) attributes.get("exportedRemoved");

        if (exportedRemoved != null) {
            setExportedRemoved(exportedRemoved);
        }

        Integer messageType = (Integer) attributes.get("messageType");

        if (messageType != null) {
            setMessageType(messageType);
        }

        Integer messageStatus = (Integer) attributes.get("messageStatus");

        if (messageStatus != null) {
            setMessageStatus(messageStatus);
        }

        Long senderId = (Long) attributes.get("senderId");

        if (senderId != null) {
            setSenderId(senderId);
        }

        String senderName = (String) attributes.get("senderName");

        if (senderName != null) {
            setSenderName(senderName);
        }

        Long senderUF = (Long) attributes.get("senderUF");

        if (senderUF != null) {
            setSenderUF(senderUF);
        }

        String senderEmail = (String) attributes.get("senderEmail");

        if (senderEmail != null) {
            setSenderEmail(senderEmail);
        }

        Integer senderType = (Integer) attributes.get("senderType");

        if (senderType != null) {
            setSenderType(senderType);
        }

        String messageText = (String) attributes.get("messageText");

        if (messageText != null) {
            setMessageText(messageText);
        }

        Integer textType = (Integer) attributes.get("textType");

        if (textType != null) {
            setTextType(textType);
        }

        Date messageTS = (Date) attributes.get("messageTS");

        if (messageTS != null) {
            setMessageTS(messageTS);
        }

        Boolean messagePublic = (Boolean) attributes.get("messagePublic");

        if (messagePublic != null) {
            setMessagePublic(messagePublic);
        }

        Boolean adminMessage = (Boolean) attributes.get("adminMessage");

        if (adminMessage != null) {
            setAdminMessage(adminMessage);
        }

        Long recipientUserId = (Long) attributes.get("recipientUserId");

        if (recipientUserId != null) {
            setRecipientUserId(recipientUserId);
        }

        String recipientUserName = (String) attributes.get("recipientUserName");

        if (recipientUserName != null) {
            setRecipientUserName(recipientUserName);
        }
    }

    public long getChatMessageId() {
        return _chatMessageId;
    }

    public void setChatMessageId(long chatMessageId) {
        _chatMessageId = chatMessageId;
    }

    public long getParentMessageId() {
        return _parentMessageId;
    }

    public void setParentMessageId(long parentMessageId) {
        _parentMessageId = parentMessageId;
    }

    public long getChatRoomId() {
        return _chatRoomId;
    }

    public void setChatRoomId(long chatRoomId) {
        _chatRoomId = chatRoomId;
    }

    public long getExportedPosition() {
        return _exportedPosition;
    }

    public void setExportedPosition(long exportedPosition) {
        _exportedPosition = exportedPosition;
    }

    public boolean getExportedRemoved() {
        return _exportedRemoved;
    }

    public boolean isExportedRemoved() {
        return _exportedRemoved;
    }

    public void setExportedRemoved(boolean exportedRemoved) {
        _exportedRemoved = exportedRemoved;
    }

    public int getMessageType() {
        return _messageType;
    }

    public void setMessageType(int messageType) {
        _messageType = messageType;
    }

    public int getMessageStatus() {
        return _messageStatus;
    }

    public void setMessageStatus(int messageStatus) {
        _messageStatus = messageStatus;
    }

    public long getSenderId() {
        return _senderId;
    }

    public void setSenderId(long senderId) {
        _senderId = senderId;
    }

    public String getSenderName() {
        if (_senderName == null) {
            return StringPool.BLANK;
        } else {
            return _senderName;
        }
    }

    public void setSenderName(String senderName) {
        _senderName = senderName;
    }

    public long getSenderUF() {
        return _senderUF;
    }

    public void setSenderUF(long senderUF) {
        _senderUF = senderUF;
    }

    public String getSenderEmail() {
        if (_senderEmail == null) {
            return StringPool.BLANK;
        } else {
            return _senderEmail;
        }
    }

    public void setSenderEmail(String senderEmail) {
        _senderEmail = senderEmail;
    }

    public int getSenderType() {
        return _senderType;
    }

    public void setSenderType(int senderType) {
        _senderType = senderType;
    }

    public String getMessageText() {
        if (_messageText == null) {
            return StringPool.BLANK;
        } else {
            return _messageText;
        }
    }

    public void setMessageText(String messageText) {
        _messageText = messageText;
    }

    public int getTextType() {
        return _textType;
    }

    public void setTextType(int textType) {
        _textType = textType;
    }

    public Date getMessageTS() {
        return _messageTS;
    }

    public void setMessageTS(Date messageTS) {
        _columnBitmask = -1L;

        if (_originalMessageTS == null) {
            _originalMessageTS = _messageTS;
        }

        _messageTS = messageTS;
    }

    public Date getOriginalMessageTS() {
        return _originalMessageTS;
    }

    public boolean getMessagePublic() {
        return _messagePublic;
    }

    public boolean isMessagePublic() {
        return _messagePublic;
    }

    public void setMessagePublic(boolean messagePublic) {
        _columnBitmask |= MESSAGEPUBLIC_COLUMN_BITMASK;

        if (!_setOriginalMessagePublic) {
            _setOriginalMessagePublic = true;

            _originalMessagePublic = _messagePublic;
        }

        _messagePublic = messagePublic;
    }

    public boolean getOriginalMessagePublic() {
        return _originalMessagePublic;
    }

    public boolean getAdminMessage() {
        return _adminMessage;
    }

    public boolean isAdminMessage() {
        return _adminMessage;
    }

    public void setAdminMessage(boolean adminMessage) {
        _adminMessage = adminMessage;
    }

    public long getRecipientUserId() {
        return _recipientUserId;
    }

    public void setRecipientUserId(long recipientUserId) {
        _columnBitmask |= RECIPIENTUSERID_COLUMN_BITMASK;

        if (!_setOriginalRecipientUserId) {
            _setOriginalRecipientUserId = true;

            _originalRecipientUserId = _recipientUserId;
        }

        _recipientUserId = recipientUserId;
    }

    public String getRecipientUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getRecipientUserId(), "uuid",
            _recipientUserUuid);
    }

    public void setRecipientUserUuid(String recipientUserUuid) {
        _recipientUserUuid = recipientUserUuid;
    }

    public long getOriginalRecipientUserId() {
        return _originalRecipientUserId;
    }

    public String getRecipientUserName() {
        if (_recipientUserName == null) {
            return StringPool.BLANK;
        } else {
            return _recipientUserName;
        }
    }

    public void setRecipientUserName(String recipientUserName) {
        _recipientUserName = recipientUserName;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            ChatRoomMessage.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public ChatRoomMessage toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (ChatRoomMessage) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        ChatRoomMessageImpl chatRoomMessageImpl = new ChatRoomMessageImpl();

        chatRoomMessageImpl.setChatMessageId(getChatMessageId());
        chatRoomMessageImpl.setParentMessageId(getParentMessageId());
        chatRoomMessageImpl.setChatRoomId(getChatRoomId());
        chatRoomMessageImpl.setExportedPosition(getExportedPosition());
        chatRoomMessageImpl.setExportedRemoved(getExportedRemoved());
        chatRoomMessageImpl.setMessageType(getMessageType());
        chatRoomMessageImpl.setMessageStatus(getMessageStatus());
        chatRoomMessageImpl.setSenderId(getSenderId());
        chatRoomMessageImpl.setSenderName(getSenderName());
        chatRoomMessageImpl.setSenderUF(getSenderUF());
        chatRoomMessageImpl.setSenderEmail(getSenderEmail());
        chatRoomMessageImpl.setSenderType(getSenderType());
        chatRoomMessageImpl.setMessageText(getMessageText());
        chatRoomMessageImpl.setTextType(getTextType());
        chatRoomMessageImpl.setMessageTS(getMessageTS());
        chatRoomMessageImpl.setMessagePublic(getMessagePublic());
        chatRoomMessageImpl.setAdminMessage(getAdminMessage());
        chatRoomMessageImpl.setRecipientUserId(getRecipientUserId());
        chatRoomMessageImpl.setRecipientUserName(getRecipientUserName());

        chatRoomMessageImpl.resetOriginalValues();

        return chatRoomMessageImpl;
    }

    public int compareTo(ChatRoomMessage chatRoomMessage) {
        int value = 0;

        value = DateUtil.compareTo(getMessageTS(),
                chatRoomMessage.getMessageTS());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        ChatRoomMessage chatRoomMessage = null;

        try {
            chatRoomMessage = (ChatRoomMessage) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = chatRoomMessage.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
        ChatRoomMessageModelImpl chatRoomMessageModelImpl = this;

        chatRoomMessageModelImpl._originalMessageTS = chatRoomMessageModelImpl._messageTS;

        chatRoomMessageModelImpl._originalMessagePublic = chatRoomMessageModelImpl._messagePublic;

        chatRoomMessageModelImpl._setOriginalMessagePublic = false;

        chatRoomMessageModelImpl._originalRecipientUserId = chatRoomMessageModelImpl._recipientUserId;

        chatRoomMessageModelImpl._setOriginalRecipientUserId = false;

        chatRoomMessageModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<ChatRoomMessage> toCacheModel() {
        ChatRoomMessageCacheModel chatRoomMessageCacheModel = new ChatRoomMessageCacheModel();

        chatRoomMessageCacheModel.chatMessageId = getChatMessageId();

        chatRoomMessageCacheModel.parentMessageId = getParentMessageId();

        chatRoomMessageCacheModel.chatRoomId = getChatRoomId();

        chatRoomMessageCacheModel.exportedPosition = getExportedPosition();

        chatRoomMessageCacheModel.exportedRemoved = getExportedRemoved();

        chatRoomMessageCacheModel.messageType = getMessageType();

        chatRoomMessageCacheModel.messageStatus = getMessageStatus();

        chatRoomMessageCacheModel.senderId = getSenderId();

        chatRoomMessageCacheModel.senderName = getSenderName();

        String senderName = chatRoomMessageCacheModel.senderName;

        if ((senderName != null) && (senderName.length() == 0)) {
            chatRoomMessageCacheModel.senderName = null;
        }

        chatRoomMessageCacheModel.senderUF = getSenderUF();

        chatRoomMessageCacheModel.senderEmail = getSenderEmail();

        String senderEmail = chatRoomMessageCacheModel.senderEmail;

        if ((senderEmail != null) && (senderEmail.length() == 0)) {
            chatRoomMessageCacheModel.senderEmail = null;
        }

        chatRoomMessageCacheModel.senderType = getSenderType();

        chatRoomMessageCacheModel.messageText = getMessageText();

        String messageText = chatRoomMessageCacheModel.messageText;

        if ((messageText != null) && (messageText.length() == 0)) {
            chatRoomMessageCacheModel.messageText = null;
        }

        chatRoomMessageCacheModel.textType = getTextType();

        Date messageTS = getMessageTS();

        if (messageTS != null) {
            chatRoomMessageCacheModel.messageTS = messageTS.getTime();
        } else {
            chatRoomMessageCacheModel.messageTS = Long.MIN_VALUE;
        }

        chatRoomMessageCacheModel.messagePublic = getMessagePublic();

        chatRoomMessageCacheModel.adminMessage = getAdminMessage();

        chatRoomMessageCacheModel.recipientUserId = getRecipientUserId();

        chatRoomMessageCacheModel.recipientUserName = getRecipientUserName();

        String recipientUserName = chatRoomMessageCacheModel.recipientUserName;

        if ((recipientUserName != null) && (recipientUserName.length() == 0)) {
            chatRoomMessageCacheModel.recipientUserName = null;
        }

        return chatRoomMessageCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(39);

        sb.append("{chatMessageId=");
        sb.append(getChatMessageId());
        sb.append(", parentMessageId=");
        sb.append(getParentMessageId());
        sb.append(", chatRoomId=");
        sb.append(getChatRoomId());
        sb.append(", exportedPosition=");
        sb.append(getExportedPosition());
        sb.append(", exportedRemoved=");
        sb.append(getExportedRemoved());
        sb.append(", messageType=");
        sb.append(getMessageType());
        sb.append(", messageStatus=");
        sb.append(getMessageStatus());
        sb.append(", senderId=");
        sb.append(getSenderId());
        sb.append(", senderName=");
        sb.append(getSenderName());
        sb.append(", senderUF=");
        sb.append(getSenderUF());
        sb.append(", senderEmail=");
        sb.append(getSenderEmail());
        sb.append(", senderType=");
        sb.append(getSenderType());
        sb.append(", messageText=");
        sb.append(getMessageText());
        sb.append(", textType=");
        sb.append(getTextType());
        sb.append(", messageTS=");
        sb.append(getMessageTS());
        sb.append(", messagePublic=");
        sb.append(getMessagePublic());
        sb.append(", adminMessage=");
        sb.append(getAdminMessage());
        sb.append(", recipientUserId=");
        sb.append(getRecipientUserId());
        sb.append(", recipientUserName=");
        sb.append(getRecipientUserName());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(61);

        sb.append("<model><model-name>");
        sb.append(
            "br.gov.camara.edemocracia.portlets.chat.model.ChatRoomMessage");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>chatMessageId</column-name><column-value><![CDATA[");
        sb.append(getChatMessageId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>parentMessageId</column-name><column-value><![CDATA[");
        sb.append(getParentMessageId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>chatRoomId</column-name><column-value><![CDATA[");
        sb.append(getChatRoomId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>exportedPosition</column-name><column-value><![CDATA[");
        sb.append(getExportedPosition());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>exportedRemoved</column-name><column-value><![CDATA[");
        sb.append(getExportedRemoved());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messageType</column-name><column-value><![CDATA[");
        sb.append(getMessageType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messageStatus</column-name><column-value><![CDATA[");
        sb.append(getMessageStatus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderId</column-name><column-value><![CDATA[");
        sb.append(getSenderId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderName</column-name><column-value><![CDATA[");
        sb.append(getSenderName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderUF</column-name><column-value><![CDATA[");
        sb.append(getSenderUF());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderEmail</column-name><column-value><![CDATA[");
        sb.append(getSenderEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>senderType</column-name><column-value><![CDATA[");
        sb.append(getSenderType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messageText</column-name><column-value><![CDATA[");
        sb.append(getMessageText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>textType</column-name><column-value><![CDATA[");
        sb.append(getTextType());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messageTS</column-name><column-value><![CDATA[");
        sb.append(getMessageTS());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>messagePublic</column-name><column-value><![CDATA[");
        sb.append(getMessagePublic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>adminMessage</column-name><column-value><![CDATA[");
        sb.append(getAdminMessage());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>recipientUserId</column-name><column-value><![CDATA[");
        sb.append(getRecipientUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>recipientUserName</column-name><column-value><![CDATA[");
        sb.append(getRecipientUserName());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

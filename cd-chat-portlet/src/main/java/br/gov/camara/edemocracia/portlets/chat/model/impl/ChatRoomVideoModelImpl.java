package br.gov.camara.edemocracia.portlets.chat.model.impl;

import br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo;
import br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideoModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the ChatRoomVideo service. Represents a row in the &quot;CDChat_ChatRoomVideo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ChatRoomVideoImpl}.
 * </p>
 *
 * @author Ricardo Lima
 * @see ChatRoomVideoImpl
 * @see br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo
 * @see br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideoModel
 * @generated
 */
public class ChatRoomVideoModelImpl extends BaseModelImpl<ChatRoomVideo>
    implements ChatRoomVideoModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a chat room video model instance should use the {@link br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo} interface instead.
     */
    public static final String TABLE_NAME = "CDChat_ChatRoomVideo";
    public static final Object[][] TABLE_COLUMNS = {
            { "videoId", Types.BIGINT },
            { "videoTitle", Types.VARCHAR },
            { "videoSubtitle", Types.VARCHAR },
            { "videoDescription", Types.VARCHAR },
            { "videoEnabled", Types.BOOLEAN },
            { "videoUrl", Types.VARCHAR },
            { "videoType", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table CDChat_ChatRoomVideo (videoId LONG not null primary key,videoTitle VARCHAR(75) null,videoSubtitle VARCHAR(75) null,videoDescription VARCHAR(3900) null,videoEnabled BOOLEAN,videoUrl VARCHAR(3900) null,videoType VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table CDChat_ChatRoomVideo";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo"));
    private static ClassLoader _classLoader = ChatRoomVideo.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            ChatRoomVideo.class
        };
    private long _videoId;
    private String _videoTitle;
    private String _videoSubtitle;
    private String _videoDescription;
    private boolean _videoEnabled;
    private String _videoUrl;
    private String _videoType;
    private ChatRoomVideo _escapedModelProxy;

    public ChatRoomVideoModelImpl() {
    }

    public long getPrimaryKey() {
        return _videoId;
    }

    public void setPrimaryKey(long primaryKey) {
        setVideoId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_videoId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return ChatRoomVideo.class;
    }

    public String getModelClassName() {
        return ChatRoomVideo.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("videoId", getVideoId());
        attributes.put("videoTitle", getVideoTitle());
        attributes.put("videoSubtitle", getVideoSubtitle());
        attributes.put("videoDescription", getVideoDescription());
        attributes.put("videoEnabled", getVideoEnabled());
        attributes.put("videoUrl", getVideoUrl());
        attributes.put("videoType", getVideoType());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long videoId = (Long) attributes.get("videoId");

        if (videoId != null) {
            setVideoId(videoId);
        }

        String videoTitle = (String) attributes.get("videoTitle");

        if (videoTitle != null) {
            setVideoTitle(videoTitle);
        }

        String videoSubtitle = (String) attributes.get("videoSubtitle");

        if (videoSubtitle != null) {
            setVideoSubtitle(videoSubtitle);
        }

        String videoDescription = (String) attributes.get("videoDescription");

        if (videoDescription != null) {
            setVideoDescription(videoDescription);
        }

        Boolean videoEnabled = (Boolean) attributes.get("videoEnabled");

        if (videoEnabled != null) {
            setVideoEnabled(videoEnabled);
        }

        String videoUrl = (String) attributes.get("videoUrl");

        if (videoUrl != null) {
            setVideoUrl(videoUrl);
        }

        String videoType = (String) attributes.get("videoType");

        if (videoType != null) {
            setVideoType(videoType);
        }
    }

    public long getVideoId() {
        return _videoId;
    }

    public void setVideoId(long videoId) {
        _videoId = videoId;
    }

    public String getVideoTitle() {
        if (_videoTitle == null) {
            return StringPool.BLANK;
        } else {
            return _videoTitle;
        }
    }

    public void setVideoTitle(String videoTitle) {
        _videoTitle = videoTitle;
    }

    public String getVideoSubtitle() {
        if (_videoSubtitle == null) {
            return StringPool.BLANK;
        } else {
            return _videoSubtitle;
        }
    }

    public void setVideoSubtitle(String videoSubtitle) {
        _videoSubtitle = videoSubtitle;
    }

    public String getVideoDescription() {
        if (_videoDescription == null) {
            return StringPool.BLANK;
        } else {
            return _videoDescription;
        }
    }

    public void setVideoDescription(String videoDescription) {
        _videoDescription = videoDescription;
    }

    public boolean getVideoEnabled() {
        return _videoEnabled;
    }

    public boolean isVideoEnabled() {
        return _videoEnabled;
    }

    public void setVideoEnabled(boolean videoEnabled) {
        _videoEnabled = videoEnabled;
    }

    public String getVideoUrl() {
        if (_videoUrl == null) {
            return StringPool.BLANK;
        } else {
            return _videoUrl;
        }
    }

    public void setVideoUrl(String videoUrl) {
        _videoUrl = videoUrl;
    }

    public String getVideoType() {
        if (_videoType == null) {
            return StringPool.BLANK;
        } else {
            return _videoType;
        }
    }

    public void setVideoType(String videoType) {
        _videoType = videoType;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            ChatRoomVideo.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public ChatRoomVideo toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (ChatRoomVideo) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        ChatRoomVideoImpl chatRoomVideoImpl = new ChatRoomVideoImpl();

        chatRoomVideoImpl.setVideoId(getVideoId());
        chatRoomVideoImpl.setVideoTitle(getVideoTitle());
        chatRoomVideoImpl.setVideoSubtitle(getVideoSubtitle());
        chatRoomVideoImpl.setVideoDescription(getVideoDescription());
        chatRoomVideoImpl.setVideoEnabled(getVideoEnabled());
        chatRoomVideoImpl.setVideoUrl(getVideoUrl());
        chatRoomVideoImpl.setVideoType(getVideoType());

        chatRoomVideoImpl.resetOriginalValues();

        return chatRoomVideoImpl;
    }

    public int compareTo(ChatRoomVideo chatRoomVideo) {
        long primaryKey = chatRoomVideo.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        ChatRoomVideo chatRoomVideo = null;

        try {
            chatRoomVideo = (ChatRoomVideo) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = chatRoomVideo.getPrimaryKey();

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
    }

    @Override
    public CacheModel<ChatRoomVideo> toCacheModel() {
        ChatRoomVideoCacheModel chatRoomVideoCacheModel = new ChatRoomVideoCacheModel();

        chatRoomVideoCacheModel.videoId = getVideoId();

        chatRoomVideoCacheModel.videoTitle = getVideoTitle();

        String videoTitle = chatRoomVideoCacheModel.videoTitle;

        if ((videoTitle != null) && (videoTitle.length() == 0)) {
            chatRoomVideoCacheModel.videoTitle = null;
        }

        chatRoomVideoCacheModel.videoSubtitle = getVideoSubtitle();

        String videoSubtitle = chatRoomVideoCacheModel.videoSubtitle;

        if ((videoSubtitle != null) && (videoSubtitle.length() == 0)) {
            chatRoomVideoCacheModel.videoSubtitle = null;
        }

        chatRoomVideoCacheModel.videoDescription = getVideoDescription();

        String videoDescription = chatRoomVideoCacheModel.videoDescription;

        if ((videoDescription != null) && (videoDescription.length() == 0)) {
            chatRoomVideoCacheModel.videoDescription = null;
        }

        chatRoomVideoCacheModel.videoEnabled = getVideoEnabled();

        chatRoomVideoCacheModel.videoUrl = getVideoUrl();

        String videoUrl = chatRoomVideoCacheModel.videoUrl;

        if ((videoUrl != null) && (videoUrl.length() == 0)) {
            chatRoomVideoCacheModel.videoUrl = null;
        }

        chatRoomVideoCacheModel.videoType = getVideoType();

        String videoType = chatRoomVideoCacheModel.videoType;

        if ((videoType != null) && (videoType.length() == 0)) {
            chatRoomVideoCacheModel.videoType = null;
        }

        return chatRoomVideoCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{videoId=");
        sb.append(getVideoId());
        sb.append(", videoTitle=");
        sb.append(getVideoTitle());
        sb.append(", videoSubtitle=");
        sb.append(getVideoSubtitle());
        sb.append(", videoDescription=");
        sb.append(getVideoDescription());
        sb.append(", videoEnabled=");
        sb.append(getVideoEnabled());
        sb.append(", videoUrl=");
        sb.append(getVideoUrl());
        sb.append(", videoType=");
        sb.append(getVideoType());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>videoId</column-name><column-value><![CDATA[");
        sb.append(getVideoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoTitle</column-name><column-value><![CDATA[");
        sb.append(getVideoTitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoSubtitle</column-name><column-value><![CDATA[");
        sb.append(getVideoSubtitle());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoDescription</column-name><column-value><![CDATA[");
        sb.append(getVideoDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoEnabled</column-name><column-value><![CDATA[");
        sb.append(getVideoEnabled());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoUrl</column-name><column-value><![CDATA[");
        sb.append(getVideoUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>videoType</column-name><column-value><![CDATA[");
        sb.append(getVideoType());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

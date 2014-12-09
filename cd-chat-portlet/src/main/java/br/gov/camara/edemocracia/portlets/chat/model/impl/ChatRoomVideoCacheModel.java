package br.gov.camara.edemocracia.portlets.chat.model.impl;

import br.gov.camara.edemocracia.portlets.chat.model.ChatRoomVideo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing ChatRoomVideo in entity cache.
 *
 * @author Ricardo Lima
 * @see ChatRoomVideo
 * @generated
 */
public class ChatRoomVideoCacheModel implements CacheModel<ChatRoomVideo>,
    Serializable {
    public long videoId;
    public String videoTitle;
    public String videoSubtitle;
    public String videoDescription;
    public boolean videoEnabled;
    public String videoUrl;
    public String videoType;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{videoId=");
        sb.append(videoId);
        sb.append(", videoTitle=");
        sb.append(videoTitle);
        sb.append(", videoSubtitle=");
        sb.append(videoSubtitle);
        sb.append(", videoDescription=");
        sb.append(videoDescription);
        sb.append(", videoEnabled=");
        sb.append(videoEnabled);
        sb.append(", videoUrl=");
        sb.append(videoUrl);
        sb.append(", videoType=");
        sb.append(videoType);
        sb.append("}");

        return sb.toString();
    }

    public ChatRoomVideo toEntityModel() {
        ChatRoomVideoImpl chatRoomVideoImpl = new ChatRoomVideoImpl();

        chatRoomVideoImpl.setVideoId(videoId);

        if (videoTitle == null) {
            chatRoomVideoImpl.setVideoTitle(StringPool.BLANK);
        } else {
            chatRoomVideoImpl.setVideoTitle(videoTitle);
        }

        if (videoSubtitle == null) {
            chatRoomVideoImpl.setVideoSubtitle(StringPool.BLANK);
        } else {
            chatRoomVideoImpl.setVideoSubtitle(videoSubtitle);
        }

        if (videoDescription == null) {
            chatRoomVideoImpl.setVideoDescription(StringPool.BLANK);
        } else {
            chatRoomVideoImpl.setVideoDescription(videoDescription);
        }

        chatRoomVideoImpl.setVideoEnabled(videoEnabled);

        if (videoUrl == null) {
            chatRoomVideoImpl.setVideoUrl(StringPool.BLANK);
        } else {
            chatRoomVideoImpl.setVideoUrl(videoUrl);
        }

        if (videoType == null) {
            chatRoomVideoImpl.setVideoType(StringPool.BLANK);
        } else {
            chatRoomVideoImpl.setVideoType(videoType);
        }

        chatRoomVideoImpl.resetOriginalValues();

        return chatRoomVideoImpl;
    }
}

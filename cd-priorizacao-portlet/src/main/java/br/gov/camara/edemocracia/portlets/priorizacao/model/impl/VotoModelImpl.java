package br.gov.camara.edemocracia.portlets.priorizacao.model.impl;

import br.gov.camara.edemocracia.portlets.priorizacao.model.Voto;
import br.gov.camara.edemocracia.portlets.priorizacao.model.VotoModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
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
 * The base model implementation for the Voto service. Represents a row in the &quot;PR_Voto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link br.gov.camara.edemocracia.portlets.priorizacao.model.VotoModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VotoImpl}.
 * </p>
 *
 * @author robson
 * @see VotoImpl
 * @see br.gov.camara.edemocracia.portlets.priorizacao.model.Voto
 * @see br.gov.camara.edemocracia.portlets.priorizacao.model.VotoModel
 * @generated
 */
public class VotoModelImpl extends BaseModelImpl<Voto> implements VotoModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a voto model instance should use the {@link br.gov.camara.edemocracia.portlets.priorizacao.model.Voto} interface instead.
     */
    public static final String TABLE_NAME = "PR_Voto";
    public static final Object[][] TABLE_COLUMNS = {
            { "votoId", Types.BIGINT },
            { "propostaId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "userName", Types.VARCHAR },
            { "numeroVotos", Types.INTEGER },
            { "votosDisponiveis", Types.INTEGER },
            { "data_", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table PR_Voto (votoId LONG not null primary key,propostaId LONG,userId LONG,userName VARCHAR(75) null,numeroVotos INTEGER,votosDisponiveis INTEGER,data_ DATE null)";
    public static final String TABLE_SQL_DROP = "drop table PR_Voto";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.br.gov.camara.edemocracia.portlets.priorizacao.model.Voto"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.br.gov.camara.edemocracia.portlets.priorizacao.model.Voto"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.br.gov.camara.edemocracia.portlets.priorizacao.model.Voto"),
            true);
    public static long PROPOSTAID_COLUMN_BITMASK = 1L;
    public static long USERID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.br.gov.camara.edemocracia.portlets.priorizacao.model.Voto"));
    private static ClassLoader _classLoader = Voto.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            Voto.class
        };
    private long _votoId;
    private long _propostaId;
    private long _originalPropostaId;
    private boolean _setOriginalPropostaId;
    private long _userId;
    private String _userUuid;
    private long _originalUserId;
    private boolean _setOriginalUserId;
    private String _userName;
    private int _numeroVotos;
    private int _votosDisponiveis;
    private Date _data;
    private long _columnBitmask;
    private Voto _escapedModelProxy;

    public VotoModelImpl() {
    }

    public long getPrimaryKey() {
        return _votoId;
    }

    public void setPrimaryKey(long primaryKey) {
        setVotoId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_votoId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return Voto.class;
    }

    public String getModelClassName() {
        return Voto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("votoId", getVotoId());
        attributes.put("propostaId", getPropostaId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("numeroVotos", getNumeroVotos());
        attributes.put("votosDisponiveis", getVotosDisponiveis());
        attributes.put("data", getData());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long votoId = (Long) attributes.get("votoId");

        if (votoId != null) {
            setVotoId(votoId);
        }

        Long propostaId = (Long) attributes.get("propostaId");

        if (propostaId != null) {
            setPropostaId(propostaId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Integer numeroVotos = (Integer) attributes.get("numeroVotos");

        if (numeroVotos != null) {
            setNumeroVotos(numeroVotos);
        }

        Integer votosDisponiveis = (Integer) attributes.get("votosDisponiveis");

        if (votosDisponiveis != null) {
            setVotosDisponiveis(votosDisponiveis);
        }

        Date data = (Date) attributes.get("data");

        if (data != null) {
            setData(data);
        }
    }

    public long getVotoId() {
        return _votoId;
    }

    public void setVotoId(long votoId) {
        _votoId = votoId;
    }

    public long getPropostaId() {
        return _propostaId;
    }

    public void setPropostaId(long propostaId) {
        _columnBitmask |= PROPOSTAID_COLUMN_BITMASK;

        if (!_setOriginalPropostaId) {
            _setOriginalPropostaId = true;

            _originalPropostaId = _propostaId;
        }

        _propostaId = propostaId;
    }

    public long getOriginalPropostaId() {
        return _originalPropostaId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _columnBitmask |= USERID_COLUMN_BITMASK;

        if (!_setOriginalUserId) {
            _setOriginalUserId = true;

            _originalUserId = _userId;
        }

        _userId = userId;
    }

    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getOriginalUserId() {
        return _originalUserId;
    }

    public String getUserName() {
        if (_userName == null) {
            return StringPool.BLANK;
        } else {
            return _userName;
        }
    }

    public void setUserName(String userName) {
        _userName = userName;
    }

    public int getNumeroVotos() {
        return _numeroVotos;
    }

    public void setNumeroVotos(int numeroVotos) {
        _numeroVotos = numeroVotos;
    }

    public int getVotosDisponiveis() {
        return _votosDisponiveis;
    }

    public void setVotosDisponiveis(int votosDisponiveis) {
        _votosDisponiveis = votosDisponiveis;
    }

    public Date getData() {
        return _data;
    }

    public void setData(Date data) {
        _data = data;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            Voto.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Voto toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (Voto) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        VotoImpl votoImpl = new VotoImpl();

        votoImpl.setVotoId(getVotoId());
        votoImpl.setPropostaId(getPropostaId());
        votoImpl.setUserId(getUserId());
        votoImpl.setUserName(getUserName());
        votoImpl.setNumeroVotos(getNumeroVotos());
        votoImpl.setVotosDisponiveis(getVotosDisponiveis());
        votoImpl.setData(getData());

        votoImpl.resetOriginalValues();

        return votoImpl;
    }

    public int compareTo(Voto voto) {
        long primaryKey = voto.getPrimaryKey();

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

        Voto voto = null;

        try {
            voto = (Voto) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        long primaryKey = voto.getPrimaryKey();

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
        VotoModelImpl votoModelImpl = this;

        votoModelImpl._originalPropostaId = votoModelImpl._propostaId;

        votoModelImpl._setOriginalPropostaId = false;

        votoModelImpl._originalUserId = votoModelImpl._userId;

        votoModelImpl._setOriginalUserId = false;

        votoModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<Voto> toCacheModel() {
        VotoCacheModel votoCacheModel = new VotoCacheModel();

        votoCacheModel.votoId = getVotoId();

        votoCacheModel.propostaId = getPropostaId();

        votoCacheModel.userId = getUserId();

        votoCacheModel.userName = getUserName();

        String userName = votoCacheModel.userName;

        if ((userName != null) && (userName.length() == 0)) {
            votoCacheModel.userName = null;
        }

        votoCacheModel.numeroVotos = getNumeroVotos();

        votoCacheModel.votosDisponiveis = getVotosDisponiveis();

        Date data = getData();

        if (data != null) {
            votoCacheModel.data = data.getTime();
        } else {
            votoCacheModel.data = Long.MIN_VALUE;
        }

        return votoCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(15);

        sb.append("{votoId=");
        sb.append(getVotoId());
        sb.append(", propostaId=");
        sb.append(getPropostaId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", numeroVotos=");
        sb.append(getNumeroVotos());
        sb.append(", votosDisponiveis=");
        sb.append(getVotosDisponiveis());
        sb.append(", data=");
        sb.append(getData());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(25);

        sb.append("<model><model-name>");
        sb.append("br.gov.camara.edemocracia.portlets.priorizacao.model.Voto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>votoId</column-name><column-value><![CDATA[");
        sb.append(getVotoId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>propostaId</column-name><column-value><![CDATA[");
        sb.append(getPropostaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numeroVotos</column-name><column-value><![CDATA[");
        sb.append(getNumeroVotos());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>votosDisponiveis</column-name><column-value><![CDATA[");
        sb.append(getVotosDisponiveis());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>data</column-name><column-value><![CDATA[");
        sb.append(getData());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}

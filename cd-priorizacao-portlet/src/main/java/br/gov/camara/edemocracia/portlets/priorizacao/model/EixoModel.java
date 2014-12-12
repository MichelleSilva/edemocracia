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
package br.gov.camara.edemocracia.portlets.priorizacao.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Eixo service. Represents a row in the &quot;PR_Eixo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link br.gov.camara.edemocracia.portlets.priorizacao.model.impl.EixoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link br.gov.camara.edemocracia.portlets.priorizacao.model.impl.EixoImpl}.
 * </p>
 *
 * @author robson
 * @see Eixo
 * @see br.gov.camara.edemocracia.portlets.priorizacao.model.impl.EixoImpl
 * @see br.gov.camara.edemocracia.portlets.priorizacao.model.impl.EixoModelImpl
 * @generated
 */
public interface EixoModel extends BaseModel<Eixo> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a eixo model instance should use the {@link Eixo} interface instead.
     */

    /**
     * Returns the primary key of this eixo.
     *
     * @return the primary key of this eixo
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this eixo.
     *
     * @param primaryKey the primary key of this eixo
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the eixo ID of this eixo.
     *
     * @return the eixo ID of this eixo
     */
    public long getEixoId();

    /**
     * Sets the eixo ID of this eixo.
     *
     * @param eixoId the eixo ID of this eixo
     */
    public void setEixoId(long eixoId);

    /**
     * Returns the company ID of this eixo.
     *
     * @return the company ID of this eixo
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this eixo.
     *
     * @param companyId the company ID of this eixo
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this eixo.
     *
     * @return the group ID of this eixo
     */
    public long getGroupId();

    /**
     * Sets the group ID of this eixo.
     *
     * @param groupId the group ID of this eixo
     */
    public void setGroupId(long groupId);

    /**
     * Returns the category ID of this eixo.
     *
     * @return the category ID of this eixo
     */
    public long getCategoryId();

    /**
     * Sets the category ID of this eixo.
     *
     * @param categoryId the category ID of this eixo
     */
    public void setCategoryId(long categoryId);

    /**
     * Returns the titulo of this eixo.
     *
     * @return the titulo of this eixo
     */
    @AutoEscape
    public String getTitulo();

    /**
     * Sets the titulo of this eixo.
     *
     * @param titulo the titulo of this eixo
     */
    public void setTitulo(String titulo);

    /**
     * Returns the sumario of this eixo.
     *
     * @return the sumario of this eixo
     */
    @AutoEscape
    public String getSumario();

    /**
     * Sets the sumario of this eixo.
     *
     * @param sumario the sumario of this eixo
     */
    public void setSumario(String sumario);

    /**
     * Returns the ordem of this eixo.
     *
     * @return the ordem of this eixo
     */
    public int getOrdem();

    /**
     * Sets the ordem of this eixo.
     *
     * @param ordem the ordem of this eixo
     */
    public void setOrdem(int ordem);

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

    public int compareTo(Eixo eixo);

    public int hashCode();

    public CacheModel<Eixo> toCacheModel();

    public Eixo toEscapedModel();

    public String toString();

    public String toXmlString();
}

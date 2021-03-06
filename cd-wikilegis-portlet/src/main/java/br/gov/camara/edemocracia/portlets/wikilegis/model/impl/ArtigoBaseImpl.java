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
package br.gov.camara.edemocracia.portlets.wikilegis.model.impl;

import br.gov.camara.edemocracia.portlets.wikilegis.model.Artigo;
import br.gov.camara.edemocracia.portlets.wikilegis.service.ArtigoLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Artigo service. Represents a row in the &quot;CDWL_Artigo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ArtigoImpl}.
 * </p>
 *
 * @author robson
 * @see ArtigoImpl
 * @see br.gov.camara.edemocracia.portlets.wikilegis.model.Artigo
 * @generated
 */
public abstract class ArtigoBaseImpl extends ArtigoModelImpl implements Artigo {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a artigo model instance should use the {@link Artigo} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            ArtigoLocalServiceUtil.addArtigo(this);
        } else {
            ArtigoLocalServiceUtil.updateArtigo(this);
        }
    }
}

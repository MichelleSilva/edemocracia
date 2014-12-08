package br.gov.camara.edemocracia.portlets.priorizacao.model.impl;

import br.gov.camara.edemocracia.portlets.priorizacao.model.Eixo;
import br.gov.camara.edemocracia.portlets.priorizacao.service.EixoLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Eixo service. Represents a row in the &quot;PR_Eixo&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EixoImpl}.
 * </p>
 *
 * @author robson
 * @see EixoImpl
 * @see br.gov.camara.edemocracia.portlets.priorizacao.model.Eixo
 * @generated
 */
public abstract class EixoBaseImpl extends EixoModelImpl implements Eixo {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a eixo model instance should use the {@link Eixo} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            EixoLocalServiceUtil.addEixo(this);
        } else {
            EixoLocalServiceUtil.updateEixo(this);
        }
    }
}

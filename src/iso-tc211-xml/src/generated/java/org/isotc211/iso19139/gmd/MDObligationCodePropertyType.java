/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Obligation Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getMDObligationCode <em>MD Obligation Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDObligationCodePropertyType()
 * @model extendedMetaData="name='MD_ObligationCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDObligationCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Obligation Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.isotc211.iso19139.gmd.MDObligationCodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Obligation Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDObligationCodeType
	 * @see #isSetMDObligationCode()
	 * @see #unsetMDObligationCode()
	 * @see #setMDObligationCode(MDObligationCodeType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDObligationCodePropertyType_MDObligationCode()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='MD_ObligationCode' namespace='##targetNamespace'"
	 * @generated
	 */
	MDObligationCodeType getMDObligationCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getMDObligationCode <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Obligation Code</em>' attribute.
	 * @see org.isotc211.iso19139.gmd.MDObligationCodeType
	 * @see #isSetMDObligationCode()
	 * @see #unsetMDObligationCode()
	 * @see #getMDObligationCode()
	 * @generated
	 */
	void setMDObligationCode(MDObligationCodeType value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getMDObligationCode <em>MD Obligation Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMDObligationCode()
	 * @see #getMDObligationCode()
	 * @see #setMDObligationCode(MDObligationCodeType)
	 * @generated
	 */
	void unsetMDObligationCode();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getMDObligationCode <em>MD Obligation Code</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MD Obligation Code</em>' attribute is set.
	 * @see #unsetMDObligationCode()
	 * @see #getMDObligationCode()
	 * @see #setMDObligationCode(MDObligationCodeType)
	 * @generated
	 */
	boolean isSetMDObligationCode();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDObligationCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDObligationCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDObligationCodePropertyType

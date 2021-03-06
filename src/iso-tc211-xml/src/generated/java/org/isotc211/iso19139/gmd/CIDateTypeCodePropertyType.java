/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CI Date Type Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.CIDateTypeCodePropertyType#getCIDateTypeCode <em>CI Date Type Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.CIDateTypeCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateTypeCodePropertyType()
 * @model extendedMetaData="name='CI_DateTypeCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface CIDateTypeCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>CI Date Type Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CI Date Type Code</em>' containment reference.
	 * @see #setCIDateTypeCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateTypeCodePropertyType_CIDateTypeCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CI_DateTypeCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getCIDateTypeCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.CIDateTypeCodePropertyType#getCIDateTypeCode <em>CI Date Type Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CI Date Type Code</em>' containment reference.
	 * @see #getCIDateTypeCode()
	 * @generated
	 */
	void setCIDateTypeCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getCIDateTypeCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.CIDateTypeCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // CIDateTypeCodePropertyType

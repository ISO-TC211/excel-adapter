/**
 */
package org.isotc211.iso19139.gmd;

import org.eclipse.emf.ecore.EObject;

import org.isotc211.iso19139.gco.CodeListValueType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MD Progress Code Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.MDProgressCodePropertyType#getMDProgressCode <em>MD Progress Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.MDProgressCodePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDProgressCodePropertyType()
 * @model extendedMetaData="name='MD_ProgressCode_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MDProgressCodePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>MD Progress Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MD Progress Code</em>' containment reference.
	 * @see #setMDProgressCode(CodeListValueType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDProgressCodePropertyType_MDProgressCode()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MD_ProgressCode' namespace='##targetNamespace'"
	 * @generated
	 */
	CodeListValueType getMDProgressCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDProgressCodePropertyType#getMDProgressCode <em>MD Progress Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MD Progress Code</em>' containment reference.
	 * @see #getMDProgressCode()
	 * @generated
	 */
	void setMDProgressCode(CodeListValueType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getMDProgressCodePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='http://www.isotc211.org/2005/gco'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.MDProgressCodePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MDProgressCodePropertyType

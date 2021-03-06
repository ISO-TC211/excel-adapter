/**
 */
package org.isotc211.iso19139.gco;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Real Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.RealPropertyType#getReal <em>Real</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.RealPropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getRealPropertyType()
 * @model extendedMetaData="name='Real_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface RealPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Real</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #setReal(double)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getRealPropertyType_Real()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double"
	 *        extendedMetaData="kind='element' name='Real' namespace='##targetNamespace'"
	 * @generated
	 */
	double getReal();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.RealPropertyType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Real</em>' attribute.
	 * @see #isSetReal()
	 * @see #unsetReal()
	 * @see #getReal()
	 * @generated
	 */
	void setReal(double value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gco.RealPropertyType#getReal <em>Real</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	void unsetReal();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gco.RealPropertyType#getReal <em>Real</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Real</em>' attribute is set.
	 * @see #unsetReal()
	 * @see #getReal()
	 * @see #setReal(double)
	 * @generated
	 */
	boolean isSetReal();

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getRealPropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.RealPropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // RealPropertyType

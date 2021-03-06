/**
 */
package org.isotc211.iso19139.gco;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unlimited Integer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#getValue <em>Value</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#isIsInfinite <em>Is Infinite</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerType()
 * @model extendedMetaData="name='UnlimitedInteger_Type' kind='simple'"
 * @generated
 */
public interface UnlimitedIntegerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(BigInteger)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerType_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NonNegativeInteger"
	 *        extendedMetaData="name=':0' kind='simple'"
	 * @generated
	 */
	BigInteger getValue();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Is Infinite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Infinite</em>' attribute.
	 * @see #isSetIsInfinite()
	 * @see #unsetIsInfinite()
	 * @see #setIsInfinite(boolean)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getUnlimitedIntegerType_IsInfinite()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isInfinite'"
	 * @generated
	 */
	boolean isIsInfinite();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#isIsInfinite <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Infinite</em>' attribute.
	 * @see #isSetIsInfinite()
	 * @see #unsetIsInfinite()
	 * @see #isIsInfinite()
	 * @generated
	 */
	void setIsInfinite(boolean value);

	/**
	 * Unsets the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#isIsInfinite <em>Is Infinite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsInfinite()
	 * @see #isIsInfinite()
	 * @see #setIsInfinite(boolean)
	 * @generated
	 */
	void unsetIsInfinite();

	/**
	 * Returns whether the value of the '{@link org.isotc211.iso19139.gco.UnlimitedIntegerType#isIsInfinite <em>Is Infinite</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Infinite</em>' attribute is set.
	 * @see #unsetIsInfinite()
	 * @see #isIsInfinite()
	 * @see #setIsInfinite(boolean)
	 * @generated
	 */
	boolean isSetIsInfinite();

} // UnlimitedIntegerType

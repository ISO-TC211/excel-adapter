/**
 */
package org.isotc211.iso19139.gmd;

import org.isotc211.iso19139.gco.AbstractObjectType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Locale Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.PTLocaleType#getLanguageCode <em>Language Code</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.PTLocaleType#getCountry <em>Country</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.PTLocaleType#getCharacterEncoding <em>Character Encoding</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTLocaleType()
 * @model extendedMetaData="name='PT_Locale_Type' kind='elementOnly'"
 * @generated
 */
public interface PTLocaleType extends AbstractObjectType {
	/**
	 * Returns the value of the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Language Code</em>' containment reference.
	 * @see #setLanguageCode(LanguageCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTLocaleType_LanguageCode()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='languageCode' namespace='##targetNamespace'"
	 * @generated
	 */
	LanguageCodePropertyType getLanguageCode();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.PTLocaleType#getLanguageCode <em>Language Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language Code</em>' containment reference.
	 * @see #getLanguageCode()
	 * @generated
	 */
	void setLanguageCode(LanguageCodePropertyType value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' containment reference.
	 * @see #setCountry(CountryPropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTLocaleType_Country()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='country' namespace='##targetNamespace'"
	 * @generated
	 */
	CountryPropertyType getCountry();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.PTLocaleType#getCountry <em>Country</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' containment reference.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(CountryPropertyType value);

	/**
	 * Returns the value of the '<em><b>Character Encoding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character Encoding</em>' containment reference.
	 * @see #setCharacterEncoding(MDCharacterSetCodePropertyType)
	 * @see org.isotc211.iso19139.gmd.GMDPackage#getPTLocaleType_CharacterEncoding()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='characterEncoding' namespace='##targetNamespace'"
	 * @generated
	 */
	MDCharacterSetCodePropertyType getCharacterEncoding();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gmd.PTLocaleType#getCharacterEncoding <em>Character Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character Encoding</em>' containment reference.
	 * @see #getCharacterEncoding()
	 * @generated
	 */
	void setCharacterEncoding(MDCharacterSetCodePropertyType value);

} // PTLocaleType

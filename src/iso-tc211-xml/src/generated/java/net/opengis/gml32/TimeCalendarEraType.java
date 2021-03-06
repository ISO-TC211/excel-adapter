/**
 */
package net.opengis.gml32;

import java.math.BigDecimal;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Calendar Era Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TimeCalendarEraType#getReferenceEvent <em>Reference Event</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeCalendarEraType#getReferenceDate <em>Reference Date</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeCalendarEraType#getJulianReference <em>Julian Reference</em>}</li>
 *   <li>{@link net.opengis.gml32.TimeCalendarEraType#getEpochOfUse <em>Epoch Of Use</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTimeCalendarEraType()
 * @model extendedMetaData="name='TimeCalendarEraType' kind='elementOnly'"
 * @generated
 */
public interface TimeCalendarEraType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Reference Event</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Event</em>' containment reference.
	 * @see #setReferenceEvent(StringOrRefType)
	 * @see net.opengis.gml32.GMLPackage#getTimeCalendarEraType_ReferenceEvent()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='referenceEvent' namespace='##targetNamespace'"
	 * @generated
	 */
	StringOrRefType getReferenceEvent();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeCalendarEraType#getReferenceEvent <em>Reference Event</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Event</em>' containment reference.
	 * @see #getReferenceEvent()
	 * @generated
	 */
	void setReferenceEvent(StringOrRefType value);

	/**
	 * Returns the value of the '<em><b>Reference Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Date</em>' attribute.
	 * @see #setReferenceDate(XMLGregorianCalendar)
	 * @see net.opengis.gml32.GMLPackage#getTimeCalendarEraType_ReferenceDate()
	 * @model dataType="net.opengis.gml32.CalDate" required="true"
	 *        extendedMetaData="kind='element' name='referenceDate' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getReferenceDate();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeCalendarEraType#getReferenceDate <em>Reference Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Date</em>' attribute.
	 * @see #getReferenceDate()
	 * @generated
	 */
	void setReferenceDate(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Julian Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Julian Reference</em>' attribute.
	 * @see #setJulianReference(BigDecimal)
	 * @see net.opengis.gml32.GMLPackage#getTimeCalendarEraType_JulianReference()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Decimal" required="true"
	 *        extendedMetaData="kind='element' name='julianReference' namespace='##targetNamespace'"
	 * @generated
	 */
	BigDecimal getJulianReference();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeCalendarEraType#getJulianReference <em>Julian Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Julian Reference</em>' attribute.
	 * @see #getJulianReference()
	 * @generated
	 */
	void setJulianReference(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Epoch Of Use</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epoch Of Use</em>' containment reference.
	 * @see #setEpochOfUse(TimePeriodPropertyType)
	 * @see net.opengis.gml32.GMLPackage#getTimeCalendarEraType_EpochOfUse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='epochOfUse' namespace='##targetNamespace'"
	 * @generated
	 */
	TimePeriodPropertyType getEpochOfUse();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TimeCalendarEraType#getEpochOfUse <em>Epoch Of Use</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epoch Of Use</em>' containment reference.
	 * @see #getEpochOfUse()
	 * @generated
	 */
	void setEpochOfUse(TimePeriodPropertyType value);

} // TimeCalendarEraType

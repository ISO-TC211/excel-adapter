/**
 */
package org.isotc211.iso19139.gco;

import net.opengis.gml32.MeasureType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measure Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gco.MeasurePropertyType#getMeasureGroup <em>Measure Group</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.MeasurePropertyType#getMeasure <em>Measure</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gco.MeasurePropertyType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see org.isotc211.iso19139.gco.GCOPackage#getMeasurePropertyType()
 * @model extendedMetaData="name='Measure_PropertyType' kind='elementOnly'"
 * @generated
 */
public interface MeasurePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Measure Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure Group</em>' attribute list.
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMeasurePropertyType_MeasureGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Measure:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getMeasureGroup();

	/**
	 * Returns the value of the '<em><b>Measure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measure</em>' containment reference.
	 * @see #setMeasure(MeasureType)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMeasurePropertyType_Measure()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Measure' namespace='##targetNamespace' group='Measure:group'"
	 * @generated
	 */
	MeasureType getMeasure();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.MeasurePropertyType#getMeasure <em>Measure</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measure</em>' containment reference.
	 * @see #getMeasure()
	 * @generated
	 */
	void setMeasure(MeasureType value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see org.isotc211.iso19139.gco.GCOPackage#getMeasurePropertyType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link org.isotc211.iso19139.gco.MeasurePropertyType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // MeasurePropertyType

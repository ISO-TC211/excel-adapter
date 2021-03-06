/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounding Shape Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.BoundingShapeType#getEnvelopeGroup <em>Envelope Group</em>}</li>
 *   <li>{@link net.opengis.gml32.BoundingShapeType#getEnvelope <em>Envelope</em>}</li>
 *   <li>{@link net.opengis.gml32.BoundingShapeType#getNull <em>Null</em>}</li>
 *   <li>{@link net.opengis.gml32.BoundingShapeType#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getBoundingShapeType()
 * @model extendedMetaData="name='BoundingShapeType' kind='elementOnly'"
 * @generated
 */
public interface BoundingShapeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Envelope Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Envelope defines an extent using a pair of positions defining opposite corners in arbitrary dimensions. The first direct position is the "lower corner" (a coordinate position consisting of all the minimal ordinates for each dimension for all points within the envelope), the second one the "upper corner" (a coordinate position consisting of all the maximal ordinates for each dimension for all points within the envelope).
	 * The use of the properties "coordinates" and "pos" has been deprecated. The explicitly named properties "lowerCorner" and "upperCorner" shall be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Envelope Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getBoundingShapeType_EnvelopeGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='Envelope:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getEnvelopeGroup();

	/**
	 * Returns the value of the '<em><b>Envelope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Envelope defines an extent using a pair of positions defining opposite corners in arbitrary dimensions. The first direct position is the "lower corner" (a coordinate position consisting of all the minimal ordinates for each dimension for all points within the envelope), the second one the "upper corner" (a coordinate position consisting of all the maximal ordinates for each dimension for all points within the envelope).
	 * The use of the properties "coordinates" and "pos" has been deprecated. The explicitly named properties "lowerCorner" and "upperCorner" shall be used instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Envelope</em>' containment reference.
	 * @see #setEnvelope(EnvelopeType)
	 * @see net.opengis.gml32.GMLPackage#getBoundingShapeType_Envelope()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Envelope' namespace='##targetNamespace' group='Envelope:group'"
	 * @generated
	 */
	EnvelopeType getEnvelope();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.BoundingShapeType#getEnvelope <em>Envelope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Envelope</em>' containment reference.
	 * @see #getEnvelope()
	 * @generated
	 */
	void setEnvelope(EnvelopeType value);

	/**
	 * Returns the value of the '<em><b>Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Null</em>' attribute.
	 * @see #setNull(Object)
	 * @see net.opengis.gml32.GMLPackage#getBoundingShapeType_Null()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='element' name='Null' namespace='##targetNamespace'"
	 * @generated
	 */
	Object getNull();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.BoundingShapeType#getNull <em>Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null</em>' attribute.
	 * @see #getNull()
	 * @generated
	 */
	void setNull(Object value);

	/**
	 * Returns the value of the '<em><b>Nil Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nil Reason</em>' attribute.
	 * @see #setNilReason(Object)
	 * @see net.opengis.gml32.GMLPackage#getBoundingShapeType_NilReason()
	 * @model dataType="net.opengis.gml32.NilReasonType"
	 *        extendedMetaData="kind='attribute' name='nilReason'"
	 * @generated
	 */
	Object getNilReason();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.BoundingShapeType#getNilReason <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nil Reason</em>' attribute.
	 * @see #getNilReason()
	 * @generated
	 */
	void setNilReason(Object value);

} // BoundingShapeType

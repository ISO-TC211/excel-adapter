/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoSurfaceType#getDirectedFace <em>Directed Face</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoSurfaceType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoSurfaceType()
 * @model extendedMetaData="name='TopoSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface TopoSurfaceType extends AbstractTopologyType {
	/**
	 * Returns the value of the '<em><b>Directed Face</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DirectedFacePropertyType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The gml:directedFace property element describes the boundary of topology solids, in the coBoundary of topology edges and is used in the support of surface features via the gml:TopoSurface expression, see below. The orientation attribute of type gml:SignType expresses the sense in which the included face is used i.e. inward or outward with respect to the surface normal in any geometric realisation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Directed Face</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getTopoSurfaceType_DirectedFace()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='directedFace' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<DirectedFacePropertyType> getDirectedFace();

	/**
	 * Returns the value of the '<em><b>Aggregation Type</b></em>' attribute.
	 * The literals are from the enumeration {@link net.opengis.gml32.AggregationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @see net.opengis.gml32.GMLPackage#getTopoSurfaceType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoSurfaceType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation Type</em>' attribute.
	 * @see net.opengis.gml32.AggregationType
	 * @see #isSetAggregationType()
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @generated
	 */
	void setAggregationType(AggregationType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.TopoSurfaceType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoSurfaceType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // TopoSurfaceType

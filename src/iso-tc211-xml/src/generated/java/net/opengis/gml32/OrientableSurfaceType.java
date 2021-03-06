/**
 */
package net.opengis.gml32;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orientable Surface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.OrientableSurfaceType#getBaseSurface <em>Base Surface</em>}</li>
 *   <li>{@link net.opengis.gml32.OrientableSurfaceType#getOrientation <em>Orientation</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getOrientableSurfaceType()
 * @model extendedMetaData="name='OrientableSurfaceType' kind='elementOnly'"
 * @generated
 */
public interface OrientableSurfaceType extends AbstractSurfaceType {
	/**
	 * Returns the value of the '<em><b>Base Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The property baseSurface references or contains the base surface. The property baseSurface either references the base surface via the XLink-attributes or contains the surface element. A surface element is any element which is substitutable for gml:AbstractSurface. The base surface has positive orientation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Surface</em>' containment reference.
	 * @see #setBaseSurface(SurfacePropertyType)
	 * @see net.opengis.gml32.GMLPackage#getOrientableSurfaceType_BaseSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='baseSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	SurfacePropertyType getBaseSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.OrientableSurfaceType#getBaseSurface <em>Base Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Surface</em>' containment reference.
	 * @see #getBaseSurface()
	 * @generated
	 */
	void setBaseSurface(SurfacePropertyType value);

	/**
	 * Returns the value of the '<em><b>Orientation</b></em>' attribute.
	 * The default value is <code>"+"</code>.
	 * The literals are from the enumeration {@link net.opengis.gml32.SignType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orientation</em>' attribute.
	 * @see net.opengis.gml32.SignType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #setOrientation(SignType)
	 * @see net.opengis.gml32.GMLPackage#getOrientableSurfaceType_Orientation()
	 * @model default="+" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='orientation'"
	 * @generated
	 */
	SignType getOrientation();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.OrientableSurfaceType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orientation</em>' attribute.
	 * @see net.opengis.gml32.SignType
	 * @see #isSetOrientation()
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @generated
	 */
	void setOrientation(SignType value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.OrientableSurfaceType#getOrientation <em>Orientation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(SignType)
	 * @generated
	 */
	void unsetOrientation();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.OrientableSurfaceType#getOrientation <em>Orientation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Orientation</em>' attribute is set.
	 * @see #unsetOrientation()
	 * @see #getOrientation()
	 * @see #setOrientation(SignType)
	 * @generated
	 */
	boolean isSetOrientation();

} // OrientableSurfaceType

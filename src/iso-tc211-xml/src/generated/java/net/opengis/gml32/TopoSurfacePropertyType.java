/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Surface Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoSurfacePropertyType#getTopoSurface <em>Topo Surface</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoSurfacePropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoSurfacePropertyType()
 * @model extendedMetaData="name='TopoSurfacePropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoSurfacePropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Surface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:TopoSurface represents a homogeneous topological expression, a set of directed faces, which if realised are isomorphic to a geometric surface primitive. The intended use of gml:TopoSurface is to appear within a surface feature to express the structural and possibly geometric relationships of this surface feature to other features via the shared face definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Surface</em>' containment reference.
	 * @see #setTopoSurface(TopoSurfaceType)
	 * @see net.opengis.gml32.GMLPackage#getTopoSurfacePropertyType_TopoSurface()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoSurface' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoSurfaceType getTopoSurface();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoSurfacePropertyType#getTopoSurface <em>Topo Surface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Surface</em>' containment reference.
	 * @see #getTopoSurface()
	 * @generated
	 */
	void setTopoSurface(TopoSurfaceType value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getTopoSurfacePropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoSurfacePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @generated
	 */
	void setOwns(boolean value);

	/**
	 * Unsets the value of the '{@link net.opengis.gml32.TopoSurfacePropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoSurfacePropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // TopoSurfacePropertyType

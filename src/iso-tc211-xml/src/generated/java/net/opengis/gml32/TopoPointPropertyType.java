/**
 */
package net.opengis.gml32;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Topo Point Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}</li>
 *   <li>{@link net.opengis.gml32.TopoPointPropertyType#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getTopoPointPropertyType()
 * @model extendedMetaData="name='TopoPointPropertyType' kind='elementOnly'"
 * @generated
 */
public interface TopoPointPropertyType extends EObject {
	/**
	 * Returns the value of the '<em><b>Topo Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The intended use of gml:TopoPoint is to appear within a point feature to express the structural and possibly geometric relationships of this feature to other features via shared node definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topo Point</em>' containment reference.
	 * @see #setTopoPoint(TopoPointType)
	 * @see net.opengis.gml32.GMLPackage#getTopoPointPropertyType_TopoPoint()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TopoPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	TopoPointType getTopoPoint();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoPointPropertyType#getTopoPoint <em>Topo Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topo Point</em>' containment reference.
	 * @see #getTopoPoint()
	 * @generated
	 */
	void setTopoPoint(TopoPointType value);

	/**
	 * Returns the value of the '<em><b>Owns</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owns</em>' attribute.
	 * @see #isSetOwns()
	 * @see #unsetOwns()
	 * @see #setOwns(boolean)
	 * @see net.opengis.gml32.GMLPackage#getTopoPointPropertyType_Owns()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='owns'"
	 * @generated
	 */
	boolean isOwns();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.TopoPointPropertyType#isOwns <em>Owns</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.TopoPointPropertyType#isOwns <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	void unsetOwns();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.TopoPointPropertyType#isOwns <em>Owns</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Owns</em>' attribute is set.
	 * @see #unsetOwns()
	 * @see #isOwns()
	 * @see #setOwns(boolean)
	 * @generated
	 */
	boolean isSetOwns();

} // TopoPointPropertyType

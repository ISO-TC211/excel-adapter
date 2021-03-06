/**
 */
package net.opengis.gml32;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Block Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DataBlockType#getRangeParameters <em>Range Parameters</em>}</li>
 *   <li>{@link net.opengis.gml32.DataBlockType#getTupleList <em>Tuple List</em>}</li>
 *   <li>{@link net.opengis.gml32.DataBlockType#getDoubleOrNilReasonTupleList <em>Double Or Nil Reason Tuple List</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDataBlockType()
 * @model extendedMetaData="name='DataBlockType' kind='elementOnly'"
 * @generated
 */
public interface DataBlockType extends EObject {
	/**
	 * Returns the value of the '<em><b>Range Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range Parameters</em>' containment reference.
	 * @see #setRangeParameters(AssociationRoleType)
	 * @see net.opengis.gml32.GMLPackage#getDataBlockType_RangeParameters()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rangeParameters' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociationRoleType getRangeParameters();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DataBlockType#getRangeParameters <em>Range Parameters</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range Parameters</em>' containment reference.
	 * @see #getRangeParameters()
	 * @generated
	 */
	void setRangeParameters(AssociationRoleType value);

	/**
	 * Returns the value of the '<em><b>Tuple List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:CoordinatesType consists of a list of coordinate tuples, with each coordinate tuple separated by the ts or tuple separator (whitespace), and each coordinate in the tuple by the cs or coordinate separator (comma).
	 * The gml:tupleList encoding is effectively "band-interleaved".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tuple List</em>' containment reference.
	 * @see #setTupleList(CoordinatesType)
	 * @see net.opengis.gml32.GMLPackage#getDataBlockType_TupleList()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tupleList' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinatesType getTupleList();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DataBlockType#getTupleList <em>Tuple List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tuple List</em>' containment reference.
	 * @see #getTupleList()
	 * @generated
	 */
	void setTupleList(CoordinatesType value);

	/**
	 * Returns the value of the '<em><b>Double Or Nil Reason Tuple List</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * gml:doubleOrNilReasonList consists of a list of gml:doubleOrNilReason values, each separated by a whitespace. The gml:doubleOrNilReason values are grouped into tuples where the dimension of each tuple in the list is equal to the number of range parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Double Or Nil Reason Tuple List</em>' attribute.
	 * @see #setDoubleOrNilReasonTupleList(List)
	 * @see net.opengis.gml32.GMLPackage#getDataBlockType_DoubleOrNilReasonTupleList()
	 * @model dataType="net.opengis.gml32.DoubleOrNilReasonList" many="false"
	 *        extendedMetaData="kind='element' name='doubleOrNilReasonTupleList' namespace='##targetNamespace'"
	 * @generated
	 */
	List<Object> getDoubleOrNilReasonTupleList();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DataBlockType#getDoubleOrNilReasonTupleList <em>Double Or Nil Reason Tuple List</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Or Nil Reason Tuple List</em>' attribute.
	 * @see #getDoubleOrNilReasonTupleList()
	 * @generated
	 */
	void setDoubleOrNilReasonTupleList(List<Object> value);

} // DataBlockType

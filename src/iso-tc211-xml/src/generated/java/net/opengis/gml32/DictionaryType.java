/**
 */
package net.opengis.gml32;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dictionary Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.DictionaryType#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.DictionaryType#getDictionaryEntryGroup <em>Dictionary Entry Group</em>}</li>
 *   <li>{@link net.opengis.gml32.DictionaryType#getDictionaryEntry <em>Dictionary Entry</em>}</li>
 *   <li>{@link net.opengis.gml32.DictionaryType#getIndirectEntry <em>Indirect Entry</em>}</li>
 *   <li>{@link net.opengis.gml32.DictionaryType#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @see net.opengis.gml32.GMLPackage#getDictionaryType()
 * @model extendedMetaData="name='DictionaryType' kind='elementOnly'"
 * @generated
 */
public interface DictionaryType extends DefinitionType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getDictionaryType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:7'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Dictionary Entry Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains or refers to the definitions which are members of a dictionary. 
	 * The content model follows the standard GML property pattern, so a gml:dictionaryEntry may either contain or refer to a single gml:Definition. Since gml:Dictionary is substitutable for gml:Definition, the content of an entry may itself be a lower level dictionary. 
	 * Note that if the value is provided by reference, this definition does not carry a handle (gml:id) in this context, so does not allow external references to this specific definition in this context.  When used in this way the referenced definition will usually be in a dictionary in the same XML document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary Entry Group</em>' attribute list.
	 * @see net.opengis.gml32.GMLPackage#getDictionaryType_DictionaryEntryGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='dictionaryEntry:group' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	FeatureMap getDictionaryEntryGroup();

	/**
	 * Returns the value of the '<em><b>Dictionary Entry</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.DictionaryEntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property element contains or refers to the definitions which are members of a dictionary. 
	 * The content model follows the standard GML property pattern, so a gml:dictionaryEntry may either contain or refer to a single gml:Definition. Since gml:Dictionary is substitutable for gml:Definition, the content of an entry may itself be a lower level dictionary. 
	 * Note that if the value is provided by reference, this definition does not carry a handle (gml:id) in this context, so does not allow external references to this specific definition in this context.  When used in this way the referenced definition will usually be in a dictionary in the same XML document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dictionary Entry</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getDictionaryType_DictionaryEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dictionaryEntry' namespace='##targetNamespace' group='dictionaryEntry:group'"
	 * @generated
	 */
	EList<DictionaryEntryType> getDictionaryEntry();

	/**
	 * Returns the value of the '<em><b>Indirect Entry</b></em>' containment reference list.
	 * The list contents are of type {@link net.opengis.gml32.IndirectEntryType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indirect Entry</em>' containment reference list.
	 * @see net.opengis.gml32.GMLPackage#getDictionaryType_IndirectEntry()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='indirectEntry' namespace='##targetNamespace' group='#group:7'"
	 * @generated
	 */
	EList<IndirectEntryType> getIndirectEntry();

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
	 * @see net.opengis.gml32.GMLPackage#getDictionaryType_AggregationType()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='aggregationType'"
	 * @generated
	 */
	AggregationType getAggregationType();

	/**
	 * Sets the value of the '{@link net.opengis.gml32.DictionaryType#getAggregationType <em>Aggregation Type</em>}' attribute.
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
	 * Unsets the value of the '{@link net.opengis.gml32.DictionaryType#getAggregationType <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	void unsetAggregationType();

	/**
	 * Returns whether the value of the '{@link net.opengis.gml32.DictionaryType#getAggregationType <em>Aggregation Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Aggregation Type</em>' attribute is set.
	 * @see #unsetAggregationType()
	 * @see #getAggregationType()
	 * @see #setAggregationType(AggregationType)
	 * @generated
	 */
	boolean isSetAggregationType();

} // DictionaryType

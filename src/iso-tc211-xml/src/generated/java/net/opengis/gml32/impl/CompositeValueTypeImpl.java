/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AggregationType;
import net.opengis.gml32.CompositeValueType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.ValueArrayPropertyType;
import net.opengis.gml32.ValuePropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.CompositeValueTypeImpl#getValueComponent <em>Value Component</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CompositeValueTypeImpl#getValueComponents <em>Value Components</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CompositeValueTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeValueTypeImpl extends AbstractGMLTypeImpl implements CompositeValueType {
	/**
	 * The cached value of the '{@link #getValueComponent() <em>Value Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<ValuePropertyType> valueComponent;

	/**
	 * The cached value of the '{@link #getValueComponents() <em>Value Components</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueComponents()
	 * @generated
	 * @ordered
	 */
	protected ValueArrayPropertyType valueComponents;

	/**
	 * The default value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationType AGGREGATION_TYPE_EDEFAULT = AggregationType.SET;

	/**
	 * The cached value of the '{@link #getAggregationType() <em>Aggregation Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregationType()
	 * @generated
	 * @ordered
	 */
	protected AggregationType aggregationType = AGGREGATION_TYPE_EDEFAULT;

	/**
	 * This is true if the Aggregation Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aggregationTypeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCompositeValueType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ValuePropertyType> getValueComponent() {
		if (valueComponent == null) {
			valueComponent = new EObjectContainmentEList<ValuePropertyType>(ValuePropertyType.class, this, GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT);
		}
		return valueComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValueArrayPropertyType getValueComponents() {
		return valueComponents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueComponents(ValueArrayPropertyType newValueComponents, NotificationChain msgs) {
		ValueArrayPropertyType oldValueComponents = valueComponents;
		valueComponents = newValueComponents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS, oldValueComponents, newValueComponents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueComponents(ValueArrayPropertyType newValueComponents) {
		if (newValueComponents != valueComponents) {
			NotificationChain msgs = null;
			if (valueComponents != null)
				msgs = ((InternalEObject)valueComponents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS, null, msgs);
			if (newValueComponents != null)
				msgs = ((InternalEObject)newValueComponents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS, null, msgs);
			msgs = basicSetValueComponents(newValueComponents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS, newValueComponents, newValueComponents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AggregationType getAggregationType() {
		return aggregationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAggregationType(AggregationType newAggregationType) {
		AggregationType oldAggregationType = aggregationType;
		aggregationType = newAggregationType == null ? AGGREGATION_TYPE_EDEFAULT : newAggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetAggregationType() {
		AggregationType oldAggregationType = aggregationType;
		boolean oldAggregationTypeESet = aggregationTypeESet;
		aggregationType = AGGREGATION_TYPE_EDEFAULT;
		aggregationTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetAggregationType() {
		return aggregationTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT:
				return ((InternalEList<?>)getValueComponent()).basicRemove(otherEnd, msgs);
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS:
				return basicSetValueComponents(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT:
				return getValueComponent();
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS:
				return getValueComponents();
			case GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE:
				return getAggregationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT:
				getValueComponent().clear();
				getValueComponent().addAll((Collection<? extends ValuePropertyType>)newValue);
				return;
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)newValue);
				return;
			case GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE:
				setAggregationType((AggregationType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT:
				getValueComponent().clear();
				return;
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS:
				setValueComponents((ValueArrayPropertyType)null);
				return;
			case GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE:
				unsetAggregationType();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENT:
				return valueComponent != null && !valueComponent.isEmpty();
			case GMLPackage.COMPOSITE_VALUE_TYPE__VALUE_COMPONENTS:
				return valueComponents != null;
			case GMLPackage.COMPOSITE_VALUE_TYPE__AGGREGATION_TYPE:
				return isSetAggregationType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (aggregationType: ");
		if (aggregationTypeESet) result.append(aggregationType); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CompositeValueTypeImpl

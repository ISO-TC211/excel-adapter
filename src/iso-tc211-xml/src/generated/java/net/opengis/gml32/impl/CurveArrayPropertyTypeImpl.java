/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.AbstractCurveType;
import net.opengis.gml32.CurveArrayPropertyType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Array Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.CurveArrayPropertyTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CurveArrayPropertyTypeImpl#getAbstractCurveGroup <em>Abstract Curve Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CurveArrayPropertyTypeImpl#getAbstractCurve <em>Abstract Curve</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.CurveArrayPropertyTypeImpl#isOwns <em>Owns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveArrayPropertyTypeImpl extends MinimalEObjectImpl.Container implements CurveArrayPropertyType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OWNS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOwns() <em>Owns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwns()
	 * @generated
	 * @ordered
	 */
	protected boolean owns = OWNS_EDEFAULT;

	/**
	 * This is true if the Owns attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ownsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurveArrayPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getCurveArrayPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAbstractCurveGroup() {
		return (FeatureMap)getGroup().<FeatureMap.Entry>list(GMLPackage.eINSTANCE.getCurveArrayPropertyType_AbstractCurveGroup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AbstractCurveType> getAbstractCurve() {
		return getAbstractCurveGroup().list(GMLPackage.eINSTANCE.getCurveArrayPropertyType_AbstractCurve());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOwns() {
		return owns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwns(boolean newOwns) {
		boolean oldOwns = owns;
		owns = newOwns;
		boolean oldOwnsESet = ownsESet;
		ownsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS, oldOwns, owns, !oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetOwns() {
		boolean oldOwns = owns;
		boolean oldOwnsESet = ownsESet;
		owns = OWNS_EDEFAULT;
		ownsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS, oldOwns, OWNS_EDEFAULT, oldOwnsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetOwns() {
		return ownsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_GROUP:
				return ((InternalEList<?>)getAbstractCurveGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE:
				return ((InternalEList<?>)getAbstractCurve()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_GROUP:
				if (coreType) return getAbstractCurveGroup();
				return ((FeatureMap.Internal)getAbstractCurveGroup()).getWrapper();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE:
				return getAbstractCurve();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS:
				return isOwns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_GROUP:
				((FeatureMap.Internal)getAbstractCurveGroup()).set(newValue);
				return;
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS:
				setOwns((Boolean)newValue);
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP:
				getGroup().clear();
				return;
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_GROUP:
				getAbstractCurveGroup().clear();
				return;
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS:
				unsetOwns();
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
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE_GROUP:
				return !getAbstractCurveGroup().isEmpty();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__ABSTRACT_CURVE:
				return !getAbstractCurve().isEmpty();
			case GMLPackage.CURVE_ARRAY_PROPERTY_TYPE__OWNS:
				return isSetOwns();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", owns: ");
		if (ownsESet) result.append(owns); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //CurveArrayPropertyTypeImpl

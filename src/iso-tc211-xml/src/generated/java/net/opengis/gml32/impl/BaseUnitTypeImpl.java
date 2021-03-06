/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.BaseUnitType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.ReferenceType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Base Unit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.BaseUnitTypeImpl#getUnitsSystem <em>Units System</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseUnitTypeImpl extends UnitDefinitionTypeImpl implements BaseUnitType {
	/**
	 * The cached value of the '{@link #getUnitsSystem() <em>Units System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitsSystem()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType unitsSystem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseUnitTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getBaseUnitType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceType getUnitsSystem() {
		return unitsSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnitsSystem(ReferenceType newUnitsSystem, NotificationChain msgs) {
		ReferenceType oldUnitsSystem = unitsSystem;
		unitsSystem = newUnitsSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM, oldUnitsSystem, newUnitsSystem);
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
	public void setUnitsSystem(ReferenceType newUnitsSystem) {
		if (newUnitsSystem != unitsSystem) {
			NotificationChain msgs = null;
			if (unitsSystem != null)
				msgs = ((InternalEObject)unitsSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM, null, msgs);
			if (newUnitsSystem != null)
				msgs = ((InternalEObject)newUnitsSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM, null, msgs);
			msgs = basicSetUnitsSystem(newUnitsSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM, newUnitsSystem, newUnitsSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM:
				return basicSetUnitsSystem(null, msgs);
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
			case GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM:
				return getUnitsSystem();
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
			case GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM:
				setUnitsSystem((ReferenceType)newValue);
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
			case GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM:
				setUnitsSystem((ReferenceType)null);
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
			case GMLPackage.BASE_UNIT_TYPE__UNITS_SYSTEM:
				return unitsSystem != null;
		}
		return super.eIsSet(featureID);
	}

} //BaseUnitTypeImpl

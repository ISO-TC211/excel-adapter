/**
 */
package org.isotc211.iso19139.gmd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.isotc211.iso19139.gmd.GMDPackage;
import org.isotc211.iso19139.gmd.MDResolutionPropertyType;
import org.isotc211.iso19139.gmd.MDResolutionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MD Resolution Property Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDResolutionPropertyTypeImpl#getMDResolution <em>MD Resolution</em>}</li>
 *   <li>{@link org.isotc211.iso19139.gmd.impl.MDResolutionPropertyTypeImpl#getNilReason <em>Nil Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MDResolutionPropertyTypeImpl extends MinimalEObjectImpl.Container implements MDResolutionPropertyType {
	/**
	 * The cached value of the '{@link #getMDResolution() <em>MD Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDResolution()
	 * @generated
	 * @ordered
	 */
	protected MDResolutionType mDResolution;

	/**
	 * The default value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected static final Object NIL_REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNilReason() <em>Nil Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNilReason()
	 * @generated
	 * @ordered
	 */
	protected Object nilReason = NIL_REASON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MDResolutionPropertyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMDPackage.eINSTANCE.getMDResolutionPropertyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MDResolutionType getMDResolution() {
		return mDResolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMDResolution(MDResolutionType newMDResolution, NotificationChain msgs) {
		MDResolutionType oldMDResolution = mDResolution;
		mDResolution = newMDResolution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION, oldMDResolution, newMDResolution);
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
	public void setMDResolution(MDResolutionType newMDResolution) {
		if (newMDResolution != mDResolution) {
			NotificationChain msgs = null;
			if (mDResolution != null)
				msgs = ((InternalEObject)mDResolution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION, null, msgs);
			if (newMDResolution != null)
				msgs = ((InternalEObject)newMDResolution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION, null, msgs);
			msgs = basicSetMDResolution(newMDResolution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION, newMDResolution, newMDResolution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getNilReason() {
		return nilReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNilReason(Object newNilReason) {
		Object oldNilReason = nilReason;
		nilReason = newNilReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__NIL_REASON, oldNilReason, nilReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION:
				return basicSetMDResolution(null, msgs);
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
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION:
				return getMDResolution();
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__NIL_REASON:
				return getNilReason();
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
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION:
				setMDResolution((MDResolutionType)newValue);
				return;
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(newValue);
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
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION:
				setMDResolution((MDResolutionType)null);
				return;
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__NIL_REASON:
				setNilReason(NIL_REASON_EDEFAULT);
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
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__MD_RESOLUTION:
				return mDResolution != null;
			case GMDPackage.MD_RESOLUTION_PROPERTY_TYPE__NIL_REASON:
				return NIL_REASON_EDEFAULT == null ? nilReason != null : !NIL_REASON_EDEFAULT.equals(nilReason);
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
		result.append(" (nilReason: ");
		result.append(nilReason);
		result.append(')');
		return result.toString();
	}

} //MDResolutionPropertyTypeImpl

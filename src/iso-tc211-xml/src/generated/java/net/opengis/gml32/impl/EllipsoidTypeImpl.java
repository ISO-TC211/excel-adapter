/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.EllipsoidType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.MeasureType;
import net.opengis.gml32.SecondDefiningParameterType1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ellipsoid Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.EllipsoidTypeImpl#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.EllipsoidTypeImpl#getSecondDefiningParameter <em>Second Defining Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EllipsoidTypeImpl extends IdentifiedObjectTypeImpl implements EllipsoidType {
	/**
	 * The cached value of the '{@link #getSemiMajorAxis() <em>Semi Major Axis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemiMajorAxis()
	 * @generated
	 * @ordered
	 */
	protected MeasureType semiMajorAxis;

	/**
	 * The cached value of the '{@link #getSecondDefiningParameter() <em>Second Defining Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondDefiningParameter()
	 * @generated
	 * @ordered
	 */
	protected SecondDefiningParameterType1 secondDefiningParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EllipsoidTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getEllipsoidType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureType getSemiMajorAxis() {
		return semiMajorAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemiMajorAxis(MeasureType newSemiMajorAxis, NotificationChain msgs) {
		MeasureType oldSemiMajorAxis = semiMajorAxis;
		semiMajorAxis = newSemiMajorAxis;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS, oldSemiMajorAxis, newSemiMajorAxis);
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
	public void setSemiMajorAxis(MeasureType newSemiMajorAxis) {
		if (newSemiMajorAxis != semiMajorAxis) {
			NotificationChain msgs = null;
			if (semiMajorAxis != null)
				msgs = ((InternalEObject)semiMajorAxis).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS, null, msgs);
			if (newSemiMajorAxis != null)
				msgs = ((InternalEObject)newSemiMajorAxis).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS, null, msgs);
			msgs = basicSetSemiMajorAxis(newSemiMajorAxis, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS, newSemiMajorAxis, newSemiMajorAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecondDefiningParameterType1 getSecondDefiningParameter() {
		return secondDefiningParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecondDefiningParameter(SecondDefiningParameterType1 newSecondDefiningParameter, NotificationChain msgs) {
		SecondDefiningParameterType1 oldSecondDefiningParameter = secondDefiningParameter;
		secondDefiningParameter = newSecondDefiningParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER, oldSecondDefiningParameter, newSecondDefiningParameter);
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
	public void setSecondDefiningParameter(SecondDefiningParameterType1 newSecondDefiningParameter) {
		if (newSecondDefiningParameter != secondDefiningParameter) {
			NotificationChain msgs = null;
			if (secondDefiningParameter != null)
				msgs = ((InternalEObject)secondDefiningParameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER, null, msgs);
			if (newSecondDefiningParameter != null)
				msgs = ((InternalEObject)newSecondDefiningParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER, null, msgs);
			msgs = basicSetSecondDefiningParameter(newSecondDefiningParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER, newSecondDefiningParameter, newSecondDefiningParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
				return basicSetSemiMajorAxis(null, msgs);
			case GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
				return basicSetSecondDefiningParameter(null, msgs);
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
			case GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
				return getSemiMajorAxis();
			case GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
				return getSecondDefiningParameter();
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
			case GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)newValue);
				return;
			case GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType1)newValue);
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
			case GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
				setSemiMajorAxis((MeasureType)null);
				return;
			case GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
				setSecondDefiningParameter((SecondDefiningParameterType1)null);
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
			case GMLPackage.ELLIPSOID_TYPE__SEMI_MAJOR_AXIS:
				return semiMajorAxis != null;
			case GMLPackage.ELLIPSOID_TYPE__SECOND_DEFINING_PARAMETER:
				return secondDefiningParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //EllipsoidTypeImpl

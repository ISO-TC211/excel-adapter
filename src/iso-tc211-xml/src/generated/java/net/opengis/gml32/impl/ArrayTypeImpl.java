/**
 */
package net.opengis.gml32.impl;

import net.opengis.gml32.ArrayAssociationType;
import net.opengis.gml32.ArrayType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.ArrayTypeImpl#getMembers <em>Members</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayTypeImpl extends AbstractGMLTypeImpl implements ArrayType {
	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected ArrayAssociationType members;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getArrayType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ArrayAssociationType getMembers() {
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMembers(ArrayAssociationType newMembers, NotificationChain msgs) {
		ArrayAssociationType oldMembers = members;
		members = newMembers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ARRAY_TYPE__MEMBERS, oldMembers, newMembers);
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
	public void setMembers(ArrayAssociationType newMembers) {
		if (newMembers != members) {
			NotificationChain msgs = null;
			if (members != null)
				msgs = ((InternalEObject)members).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ARRAY_TYPE__MEMBERS, null, msgs);
			if (newMembers != null)
				msgs = ((InternalEObject)newMembers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ARRAY_TYPE__MEMBERS, null, msgs);
			msgs = basicSetMembers(newMembers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ARRAY_TYPE__MEMBERS, newMembers, newMembers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ARRAY_TYPE__MEMBERS:
				return basicSetMembers(null, msgs);
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
			case GMLPackage.ARRAY_TYPE__MEMBERS:
				return getMembers();
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
			case GMLPackage.ARRAY_TYPE__MEMBERS:
				setMembers((ArrayAssociationType)newValue);
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
			case GMLPackage.ARRAY_TYPE__MEMBERS:
				setMembers((ArrayAssociationType)null);
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
			case GMLPackage.ARRAY_TYPE__MEMBERS:
				return members != null;
		}
		return super.eIsSet(featureID);
	}

} //ArrayTypeImpl

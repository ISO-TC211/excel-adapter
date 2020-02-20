/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.CurveInterpolationType;
import net.opengis.gml32.DirectPositionListType;
import net.opengis.gml32.DirectPositionType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.GeodesicStringType;
import net.opengis.gml32.PointPropertyType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Geodesic String Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.GeodesicStringTypeImpl#getPosList <em>Pos List</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodesicStringTypeImpl#getGeometricPositionGroup <em>Geometric Position Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodesicStringTypeImpl#getPos <em>Pos</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodesicStringTypeImpl#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.GeodesicStringTypeImpl#getInterpolation <em>Interpolation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeodesicStringTypeImpl extends AbstractCurveSegmentTypeImpl implements GeodesicStringType {
	/**
	 * The cached value of the '{@link #getPosList() <em>Pos List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosList()
	 * @generated
	 * @ordered
	 */
	protected DirectPositionListType posList;

	/**
	 * The cached value of the '{@link #getGeometricPositionGroup() <em>Geometric Position Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeometricPositionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap geometricPositionGroup;

	/**
	 * The default value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected static final CurveInterpolationType INTERPOLATION_EDEFAULT = CurveInterpolationType.GEODESIC;

	/**
	 * The cached value of the '{@link #getInterpolation() <em>Interpolation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolation()
	 * @generated
	 * @ordered
	 */
	protected CurveInterpolationType interpolation = INTERPOLATION_EDEFAULT;

	/**
	 * This is true if the Interpolation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean interpolationESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeodesicStringTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getGeodesicStringType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DirectPositionListType getPosList() {
		return posList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPosList(DirectPositionListType newPosList, NotificationChain msgs) {
		DirectPositionListType oldPosList = posList;
		posList = newPosList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.GEODESIC_STRING_TYPE__POS_LIST, oldPosList, newPosList);
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
	public void setPosList(DirectPositionListType newPosList) {
		if (newPosList != posList) {
			NotificationChain msgs = null;
			if (posList != null)
				msgs = ((InternalEObject)posList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODESIC_STRING_TYPE__POS_LIST, null, msgs);
			if (newPosList != null)
				msgs = ((InternalEObject)newPosList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.GEODESIC_STRING_TYPE__POS_LIST, null, msgs);
			msgs = basicSetPosList(newPosList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEODESIC_STRING_TYPE__POS_LIST, newPosList, newPosList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getGeometricPositionGroup() {
		if (geometricPositionGroup == null) {
			geometricPositionGroup = new BasicFeatureMap(this, GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP);
		}
		return geometricPositionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectPositionType> getPos() {
		return getGeometricPositionGroup().list(GMLPackage.eINSTANCE.getGeodesicStringType_Pos());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PointPropertyType> getPointProperty() {
		return getGeometricPositionGroup().list(GMLPackage.eINSTANCE.getGeodesicStringType_PointProperty());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CurveInterpolationType getInterpolation() {
		return interpolation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolation(CurveInterpolationType newInterpolation) {
		CurveInterpolationType oldInterpolation = interpolation;
		interpolation = newInterpolation == null ? INTERPOLATION_EDEFAULT : newInterpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION, oldInterpolation, interpolation, !oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void unsetInterpolation() {
		CurveInterpolationType oldInterpolation = interpolation;
		boolean oldInterpolationESet = interpolationESet;
		interpolation = INTERPOLATION_EDEFAULT;
		interpolationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION, oldInterpolation, INTERPOLATION_EDEFAULT, oldInterpolationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSetInterpolation() {
		return interpolationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.GEODESIC_STRING_TYPE__POS_LIST:
				return basicSetPosList(null, msgs);
			case GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP:
				return ((InternalEList<?>)getGeometricPositionGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODESIC_STRING_TYPE__POS:
				return ((InternalEList<?>)getPos()).basicRemove(otherEnd, msgs);
			case GMLPackage.GEODESIC_STRING_TYPE__POINT_PROPERTY:
				return ((InternalEList<?>)getPointProperty()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.GEODESIC_STRING_TYPE__POS_LIST:
				return getPosList();
			case GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP:
				if (coreType) return getGeometricPositionGroup();
				return ((FeatureMap.Internal)getGeometricPositionGroup()).getWrapper();
			case GMLPackage.GEODESIC_STRING_TYPE__POS:
				return getPos();
			case GMLPackage.GEODESIC_STRING_TYPE__POINT_PROPERTY:
				return getPointProperty();
			case GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION:
				return getInterpolation();
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
			case GMLPackage.GEODESIC_STRING_TYPE__POS_LIST:
				setPosList((DirectPositionListType)newValue);
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP:
				((FeatureMap.Internal)getGeometricPositionGroup()).set(newValue);
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__POS:
				getPos().clear();
				getPos().addAll((Collection<? extends DirectPositionType>)newValue);
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__POINT_PROPERTY:
				getPointProperty().clear();
				getPointProperty().addAll((Collection<? extends PointPropertyType>)newValue);
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION:
				setInterpolation((CurveInterpolationType)newValue);
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
			case GMLPackage.GEODESIC_STRING_TYPE__POS_LIST:
				setPosList((DirectPositionListType)null);
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP:
				getGeometricPositionGroup().clear();
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__POS:
				getPos().clear();
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__POINT_PROPERTY:
				getPointProperty().clear();
				return;
			case GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION:
				unsetInterpolation();
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
			case GMLPackage.GEODESIC_STRING_TYPE__POS_LIST:
				return posList != null;
			case GMLPackage.GEODESIC_STRING_TYPE__GEOMETRIC_POSITION_GROUP:
				return geometricPositionGroup != null && !geometricPositionGroup.isEmpty();
			case GMLPackage.GEODESIC_STRING_TYPE__POS:
				return !getPos().isEmpty();
			case GMLPackage.GEODESIC_STRING_TYPE__POINT_PROPERTY:
				return !getPointProperty().isEmpty();
			case GMLPackage.GEODESIC_STRING_TYPE__INTERPOLATION:
				return isSetInterpolation();
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
		result.append(" (geometricPositionGroup: ");
		result.append(geometricPositionGroup);
		result.append(", interpolation: ");
		if (interpolationESet) result.append(interpolation); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GeodesicStringTypeImpl

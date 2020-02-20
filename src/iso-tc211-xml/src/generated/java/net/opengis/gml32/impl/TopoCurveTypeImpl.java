/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AggregationType;
import net.opengis.gml32.DirectedEdgePropertyType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.TopoCurveType;

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
 * An implementation of the model object '<em><b>Topo Curve Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.TopoCurveTypeImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.TopoCurveTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopoCurveTypeImpl extends AbstractTopologyTypeImpl implements TopoCurveType {
	/**
	 * The cached value of the '{@link #getDirectedEdge() <em>Directed Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirectedEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<DirectedEdgePropertyType> directedEdge;

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
	protected TopoCurveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getTopoCurveType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedEdgePropertyType> getDirectedEdge() {
		if (directedEdge == null) {
			directedEdge = new EObjectContainmentEList<DirectedEdgePropertyType>(DirectedEdgePropertyType.class, this, GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE);
		}
		return directedEdge;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
			case GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE:
				return ((InternalEList<?>)getDirectedEdge()).basicRemove(otherEnd, msgs);
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
			case GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE:
				return getDirectedEdge();
			case GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				getDirectedEdge().addAll((Collection<? extends DirectedEdgePropertyType>)newValue);
				return;
			case GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				return;
			case GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.TOPO_CURVE_TYPE__DIRECTED_EDGE:
				return directedEdge != null && !directedEdge.isEmpty();
			case GMLPackage.TOPO_CURVE_TYPE__AGGREGATION_TYPE:
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

} //TopoCurveTypeImpl

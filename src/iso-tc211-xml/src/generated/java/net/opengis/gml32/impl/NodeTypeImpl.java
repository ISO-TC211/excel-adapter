/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import net.opengis.gml32.AggregationType;
import net.opengis.gml32.DirectedEdgePropertyType;
import net.opengis.gml32.FaceOrTopoSolidPropertyType;
import net.opengis.gml32.GMLPackage;
import net.opengis.gml32.NodeType;
import net.opengis.gml32.PointPropertyType;

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
 * An implementation of the model object '<em><b>Node Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.NodeTypeImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.NodeTypeImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.NodeTypeImpl#getPointProperty <em>Point Property</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.NodeTypeImpl#getAggregationType <em>Aggregation Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeTypeImpl extends AbstractTopoPrimitiveTypeImpl implements NodeType {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected FaceOrTopoSolidPropertyType container;

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
	 * The cached value of the '{@link #getPointProperty() <em>Point Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointProperty()
	 * @generated
	 * @ordered
	 */
	protected PointPropertyType pointProperty;

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
	protected NodeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getNodeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FaceOrTopoSolidPropertyType getContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(FaceOrTopoSolidPropertyType newContainer, NotificationChain msgs) {
		FaceOrTopoSolidPropertyType oldContainer = container;
		container = newContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.NODE_TYPE__CONTAINER, oldContainer, newContainer);
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
	public void setContainer(FaceOrTopoSolidPropertyType newContainer) {
		if (newContainer != container) {
			NotificationChain msgs = null;
			if (container != null)
				msgs = ((InternalEObject)container).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.NODE_TYPE__CONTAINER, null, msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.NODE_TYPE__CONTAINER, null, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.NODE_TYPE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DirectedEdgePropertyType> getDirectedEdge() {
		if (directedEdge == null) {
			directedEdge = new EObjectContainmentEList<DirectedEdgePropertyType>(DirectedEdgePropertyType.class, this, GMLPackage.NODE_TYPE__DIRECTED_EDGE);
		}
		return directedEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointPropertyType getPointProperty() {
		return pointProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPointProperty(PointPropertyType newPointProperty, NotificationChain msgs) {
		PointPropertyType oldPointProperty = pointProperty;
		pointProperty = newPointProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.NODE_TYPE__POINT_PROPERTY, oldPointProperty, newPointProperty);
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
	public void setPointProperty(PointPropertyType newPointProperty) {
		if (newPointProperty != pointProperty) {
			NotificationChain msgs = null;
			if (pointProperty != null)
				msgs = ((InternalEObject)pointProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.NODE_TYPE__POINT_PROPERTY, null, msgs);
			if (newPointProperty != null)
				msgs = ((InternalEObject)newPointProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.NODE_TYPE__POINT_PROPERTY, null, msgs);
			msgs = basicSetPointProperty(newPointProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.NODE_TYPE__POINT_PROPERTY, newPointProperty, newPointProperty));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.NODE_TYPE__AGGREGATION_TYPE, oldAggregationType, aggregationType, !oldAggregationTypeESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, GMLPackage.NODE_TYPE__AGGREGATION_TYPE, oldAggregationType, AGGREGATION_TYPE_EDEFAULT, oldAggregationTypeESet));
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
			case GMLPackage.NODE_TYPE__CONTAINER:
				return basicSetContainer(null, msgs);
			case GMLPackage.NODE_TYPE__DIRECTED_EDGE:
				return ((InternalEList<?>)getDirectedEdge()).basicRemove(otherEnd, msgs);
			case GMLPackage.NODE_TYPE__POINT_PROPERTY:
				return basicSetPointProperty(null, msgs);
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
			case GMLPackage.NODE_TYPE__CONTAINER:
				return getContainer();
			case GMLPackage.NODE_TYPE__DIRECTED_EDGE:
				return getDirectedEdge();
			case GMLPackage.NODE_TYPE__POINT_PROPERTY:
				return getPointProperty();
			case GMLPackage.NODE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.NODE_TYPE__CONTAINER:
				setContainer((FaceOrTopoSolidPropertyType)newValue);
				return;
			case GMLPackage.NODE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				getDirectedEdge().addAll((Collection<? extends DirectedEdgePropertyType>)newValue);
				return;
			case GMLPackage.NODE_TYPE__POINT_PROPERTY:
				setPointProperty((PointPropertyType)newValue);
				return;
			case GMLPackage.NODE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.NODE_TYPE__CONTAINER:
				setContainer((FaceOrTopoSolidPropertyType)null);
				return;
			case GMLPackage.NODE_TYPE__DIRECTED_EDGE:
				getDirectedEdge().clear();
				return;
			case GMLPackage.NODE_TYPE__POINT_PROPERTY:
				setPointProperty((PointPropertyType)null);
				return;
			case GMLPackage.NODE_TYPE__AGGREGATION_TYPE:
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
			case GMLPackage.NODE_TYPE__CONTAINER:
				return container != null;
			case GMLPackage.NODE_TYPE__DIRECTED_EDGE:
				return directedEdge != null && !directedEdge.isEmpty();
			case GMLPackage.NODE_TYPE__POINT_PROPERTY:
				return pointProperty != null;
			case GMLPackage.NODE_TYPE__AGGREGATION_TYPE:
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

} //NodeTypeImpl

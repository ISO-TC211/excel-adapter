/**
 */
package net.opengis.gml32.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import net.opengis.gml32.AbstractDatumType;
import net.opengis.gml32.CodeType;
import net.opengis.gml32.DomainOfValidityType;
import net.opengis.gml32.GMLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Datum Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link net.opengis.gml32.impl.AbstractDatumTypeImpl#getDomainOfValidity <em>Domain Of Validity</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.AbstractDatumTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.AbstractDatumTypeImpl#getAnchorDefinitionGroup <em>Anchor Definition Group</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.AbstractDatumTypeImpl#getAnchorDefinition <em>Anchor Definition</em>}</li>
 *   <li>{@link net.opengis.gml32.impl.AbstractDatumTypeImpl#getRealizationEpoch <em>Realization Epoch</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDatumTypeImpl extends IdentifiedObjectTypeImpl implements AbstractDatumType {
	/**
	 * The cached value of the '{@link #getDomainOfValidity() <em>Domain Of Validity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainOfValidity()
	 * @generated
	 * @ordered
	 */
	protected DomainOfValidityType domainOfValidity;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected EList<String> scope;

	/**
	 * The cached value of the '{@link #getAnchorDefinitionGroup() <em>Anchor Definition Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnchorDefinitionGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anchorDefinitionGroup;

	/**
	 * The default value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar REALIZATION_EPOCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRealizationEpoch() <em>Realization Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRealizationEpoch()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar realizationEpoch = REALIZATION_EPOCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDatumTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMLPackage.eINSTANCE.getAbstractDatumType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainOfValidityType getDomainOfValidity() {
		return domainOfValidity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDomainOfValidity(DomainOfValidityType newDomainOfValidity, NotificationChain msgs) {
		DomainOfValidityType oldDomainOfValidity = domainOfValidity;
		domainOfValidity = newDomainOfValidity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, oldDomainOfValidity, newDomainOfValidity);
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
	public void setDomainOfValidity(DomainOfValidityType newDomainOfValidity) {
		if (newDomainOfValidity != domainOfValidity) {
			NotificationChain msgs = null;
			if (domainOfValidity != null)
				msgs = ((InternalEObject)domainOfValidity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			if (newDomainOfValidity != null)
				msgs = ((InternalEObject)newDomainOfValidity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, null, msgs);
			msgs = basicSetDomainOfValidity(newDomainOfValidity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY, newDomainOfValidity, newDomainOfValidity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getScope() {
		if (scope == null) {
			scope = new EDataTypeEList<String>(String.class, this, GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE);
		}
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMap getAnchorDefinitionGroup() {
		if (anchorDefinitionGroup == null) {
			anchorDefinitionGroup = new BasicFeatureMap(this, GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP);
		}
		return anchorDefinitionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CodeType getAnchorDefinition() {
		return (CodeType)getAnchorDefinitionGroup().get(GMLPackage.eINSTANCE.getAbstractDatumType_AnchorDefinition(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnchorDefinition(CodeType newAnchorDefinition, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAnchorDefinitionGroup()).basicAdd(GMLPackage.eINSTANCE.getAbstractDatumType_AnchorDefinition(), newAnchorDefinition, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnchorDefinition(CodeType newAnchorDefinition) {
		((FeatureMap.Internal)getAnchorDefinitionGroup()).set(GMLPackage.eINSTANCE.getAbstractDatumType_AnchorDefinition(), newAnchorDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getRealizationEpoch() {
		return realizationEpoch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRealizationEpoch(XMLGregorianCalendar newRealizationEpoch) {
		XMLGregorianCalendar oldRealizationEpoch = realizationEpoch;
		realizationEpoch = newRealizationEpoch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH, oldRealizationEpoch, realizationEpoch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return basicSetDomainOfValidity(null, msgs);
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP:
				return ((InternalEList<?>)getAnchorDefinitionGroup()).basicRemove(otherEnd, msgs);
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return basicSetAnchorDefinition(null, msgs);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return getDomainOfValidity();
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				return getScope();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP:
				if (coreType) return getAnchorDefinitionGroup();
				return ((FeatureMap.Internal)getAnchorDefinitionGroup()).getWrapper();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return getAnchorDefinition();
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				return getRealizationEpoch();
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				getScope().clear();
				getScope().addAll((Collection<? extends String>)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP:
				((FeatureMap.Internal)getAnchorDefinitionGroup()).set(newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)newValue);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				setRealizationEpoch((XMLGregorianCalendar)newValue);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				setDomainOfValidity((DomainOfValidityType)null);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				getScope().clear();
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP:
				getAnchorDefinitionGroup().clear();
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				setAnchorDefinition((CodeType)null);
				return;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				setRealizationEpoch(REALIZATION_EPOCH_EDEFAULT);
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
			case GMLPackage.ABSTRACT_DATUM_TYPE__DOMAIN_OF_VALIDITY:
				return domainOfValidity != null;
			case GMLPackage.ABSTRACT_DATUM_TYPE__SCOPE:
				return scope != null && !scope.isEmpty();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION_GROUP:
				return anchorDefinitionGroup != null && !anchorDefinitionGroup.isEmpty();
			case GMLPackage.ABSTRACT_DATUM_TYPE__ANCHOR_DEFINITION:
				return getAnchorDefinition() != null;
			case GMLPackage.ABSTRACT_DATUM_TYPE__REALIZATION_EPOCH:
				return REALIZATION_EPOCH_EDEFAULT == null ? realizationEpoch != null : !REALIZATION_EPOCH_EDEFAULT.equals(realizationEpoch);
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
		result.append(" (scope: ");
		result.append(scope);
		result.append(", anchorDefinitionGroup: ");
		result.append(anchorDefinitionGroup);
		result.append(", realizationEpoch: ");
		result.append(realizationEpoch);
		result.append(')');
		return result.toString();
	}

} //AbstractDatumTypeImpl

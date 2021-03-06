/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Body#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.ReportElements}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getBody_Elements()
   * @model containment="true"
   * @generated
   */
  EList<ReportElements> getElements();

} // Body

/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Aggregator Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAggregatorFunction()
 * @model
 * @generated
 */
public enum AggregatorFunction implements Enumerator
{
  /**
   * The '<em><b>Count</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COUNT_VALUE
   * @generated
   * @ordered
   */
  COUNT(0, "count", "count"),

  /**
   * The '<em><b>Sum</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUM_VALUE
   * @generated
   * @ordered
   */
  SUM(1, "sum", "sum"),

  /**
   * The '<em><b>Max</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAX_VALUE
   * @generated
   * @ordered
   */
  MAX(2, "max", "max"),

  /**
   * The '<em><b>Min</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MIN_VALUE
   * @generated
   * @ordered
   */
  MIN(3, "min", "min");

  /**
   * The '<em><b>Count</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COUNT
   * @model name="count"
   * @generated
   * @ordered
   */
  public static final int COUNT_VALUE = 0;

  /**
   * The '<em><b>Sum</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUM
   * @model name="sum"
   * @generated
   * @ordered
   */
  public static final int SUM_VALUE = 1;

  /**
   * The '<em><b>Max</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Max</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAX
   * @model name="max"
   * @generated
   * @ordered
   */
  public static final int MAX_VALUE = 2;

  /**
   * The '<em><b>Min</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Min</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MIN
   * @model name="min"
   * @generated
   * @ordered
   */
  public static final int MIN_VALUE = 3;

  /**
   * An array of all the '<em><b>Aggregator Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final AggregatorFunction[] VALUES_ARRAY =
    new AggregatorFunction[]
    {
      COUNT,
      SUM,
      MAX,
      MIN,
    };

  /**
   * A public read-only list of all the '<em><b>Aggregator Function</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<AggregatorFunction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Aggregator Function</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AggregatorFunction get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AggregatorFunction result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Aggregator Function</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AggregatorFunction getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      AggregatorFunction result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Aggregator Function</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AggregatorFunction get(int value)
  {
    switch (value)
    {
      case COUNT_VALUE: return COUNT;
      case SUM_VALUE: return SUM;
      case MAX_VALUE: return MAX;
      case MIN_VALUE: return MIN;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private AggregatorFunction(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //AggregatorFunction

/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Wed Nov 26 11:26:00 CET 2014
 */
package java.lang;

public abstract class Number extends java.lang.Object implements java.io.Serializable
{


   /*@ requires true; ensures true; assignable \everything; */
   public Number();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract int intValue();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract long longValue();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract float floatValue();

   /*@ requires true; ensures true; assignable \everything; */
   public abstract double doubleValue();

   /*@ requires true; ensures true; assignable \everything; */
   public byte byteValue();

   /*@ requires true; ensures true; assignable \everything; */
   public short shortValue();
}
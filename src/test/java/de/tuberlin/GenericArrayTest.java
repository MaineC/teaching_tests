package de.tuberlin;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

/** Unit test for Generic Array */
public class GenericArrayTest {
  public void testPutWithInteger() {
    // GenericArray<Integer> intArray = new GenericArray<Integer>()  <- wie man es eigentlich machen würde, Term zum Googlen: Generics
    GenericArray array = new GenericArray(1);
    array.put(0, new Integer(12));
    assertThat(array.get(0), is(12));
  }
  
  public void testPutWithString() {
    // GenericArray<String> stringArray = new GenericArray<String>()  <- wie man es eigentlich machen würde, Term zum Googlen: Generics
    GenericArray array = new GenericArray(21);
    array.put(20, "Niklas");
    assertThat(array.get(20), is("Niklas"));
  }
  
  @Test(expected=IndexOutOfBoundsException.class)
  public void testPutWithStringOutOfBounds() {
    // GenericArray<String> stringArray = new GenericArray<String>()  <- wie man es eigentlich machen würde, Term zum Googlen: Generics
    GenericArray array = new GenericArray(0);
    array.put(20, "Niklas");
  }
}

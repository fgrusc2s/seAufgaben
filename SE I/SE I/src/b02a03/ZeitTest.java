package b02a03;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ZeitTest {

  Zeit z01, z02;

  @Before
  public void setUp() throws Exception {
    z01 = new Zeit(0, 30);
    z02 = new Zeit(1, 32);
  }

  @Test
  public void testStunden() {
    assertEquals(0, z01.stunden());
    assertEquals(1, z02.stunden());
  }

  @Test
  public void testMinuten() {
    assertEquals(30, z01.minuten());
    assertEquals(32, z02.minuten());
  }

  @Test
  public void testAdd() {
    z01.add(z01); assertEquals(z01, z01);
  }

  @Test
  public void testToString() {
    assertEquals("01:32", z02.toString());
  }
  
  @Test
  public void testAdd2() {
	  z01.add(z02);
	  System.out.println(z01);
	  assertEquals(z01.stunden(), 2);
	  assertEquals(z01.minuten(), 2);
  }
  
}
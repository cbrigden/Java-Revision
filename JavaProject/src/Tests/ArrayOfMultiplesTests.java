package Tests;

import org.junit.Test;

import Programs.Challenge;

import static org.junit.Assert.assertArrayEquals;

public class ArrayOfMultiplesTests {
	  @Test
	  public void test1() {
			assertArrayEquals(new int[] { 7, 14, 21, 28, 35 }, Challenge.arrayOfMultiples(7, 5));
		}
		
		@Test
	  public void test2() {
			assertArrayEquals(new int[] { 12, 24, 36, 48, 60, 72, 84, 96, 108, 120 }, Challenge.arrayOfMultiples(12, 10));
		}
		
		@Test
	  public void test3() {	
			assertArrayEquals(new int[] { 17, 34, 51, 68, 85, 102, 119 }, Challenge.arrayOfMultiples(17, 7));
		}
		
		@Test
	  public void test4() {
		}
		
		@Test
	  public void test5() {
			assertArrayEquals(new int[] { 140, 280, 420 }, Challenge.arrayOfMultiples(140, 3));
		}
		
		@Test
	  public void test6() {
			assertArrayEquals(new int[] { 7, 14, 21, 28, 35, 42, 49, 56 }, Challenge.arrayOfMultiples(7, 8));
		}
		
		@Test
	  public void test7() {
			assertArrayEquals(new int[] { 11, 22, 33, 44, 55, 66, 77, 88, 99, 110, 121, 132, 143, 154, 165, 176, 187, 198, 209, 220, 231 }, Challenge.arrayOfMultiples(11, 21));
	  }
}

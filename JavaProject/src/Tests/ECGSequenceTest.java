package Tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Programs.Challenge;

public class ECGSequenceTest {
	@Test
	public void test1() {
		assertEquals(4, Challenge.ecgSequenceIndex(3));
	}

	@Test
	public void test2() {
		assertEquals(9, Challenge.ecgSequenceIndex(5));
	}

	@Test
	public void test3() {
		assertEquals(13, Challenge.ecgSequenceIndex(7));
	}

	@Test
	public void test4() {
		assertEquals(11, Challenge.ecgSequenceIndex(18));
	}

	@Test
	public void test5() {
		assertEquals(20, Challenge.ecgSequenceIndex(33));
	}

	@Test
	public void test6() {
		assertEquals(40, Challenge.ecgSequenceIndex(44));
	}

	@Test
	public void test7() {
		assertEquals(43, Challenge.ecgSequenceIndex(69));
	}

	@Test
	public void test8() {
		assertEquals(68, Challenge.ecgSequenceIndex(75));
	}

	@Test
	public void test9() {
		assertEquals(188, Challenge.ecgSequenceIndex(101));
	}

	@Test
	public void test10() {
		assertEquals(199, Challenge.ecgSequenceIndex(208));
	}

	@Test
	public void test11() {
		assertEquals(281, Challenge.ecgSequenceIndex(300));
	}

}

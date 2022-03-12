package start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyCalTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	MyCal a = new MyCal();
	@Test
	void testCong() {
		assertEquals(7, a.cong(4, 3));
	}

	@Test
	void testTru() {
		assertEquals(2, a.tru(6, 4));
	}

	@Test
	void testNhan() {
		assertEquals(4, a.nhan(2, 2));
	}

	@Test
	void testChia() {
		assertEquals(5, a.chia(35, 7));
	}

	@Test
	void testMin() {
		assertEquals(7, a.min(10, 7));
	}

	@Test
	void testMax() {
		assertEquals(2, a.max(0, 2));
	}

}

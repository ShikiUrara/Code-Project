package start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhuongTrinhBac1Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	PhuongTrinhBac1 a = new PhuongTrinhBac1();
	@Test
	void testGiaiPhuongTrinhBac1() {
		assertEquals("Phuong trinh co nghiem la: -2.0", a.giaiPhuongTrinhBac1(2, 4));
	}
}

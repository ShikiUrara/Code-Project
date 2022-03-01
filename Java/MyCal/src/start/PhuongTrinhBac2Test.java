package start;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhuongTrinhBac2Test {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	PhuongTrinhBac2 a = new PhuongTrinhBac2();
	@Test
	void testGiaiPhuongTrinhBac2() {
		assertEquals("Phuong trinh co nghiem la: -2.0", a.giaiPhuongTrinhBac2(0, 2, 4));
	}

}

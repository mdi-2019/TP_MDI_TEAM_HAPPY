package org.esir.mdi_tp1_GLTPQ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CaculatriceScientifiqueTests {

	@Test
	public void logarithmTest() {
		double a = Math.log(10);
		CalculatriceScientifique calcSi = new CalculatriceScientifique();
		double b = calcSi.logarithme(10, Math.E);
		
		assertTrue(a==b, "a != b");
	}

	@Test
	public void powTest() {
		double a = Math.pow(2,10);
		CalculatriceScientifique calcSi = new CalculatriceScientifique();
		double b = calcSi.puissance10(2);
		
		assertTrue(a==b, "a != b");
	}
}

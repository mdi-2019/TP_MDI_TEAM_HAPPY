package org.esir.mdi_tp1_GLTPQ;

public class CalculatriceScientifique {

	double m_last_result;
	
	public double puissance(double nombre, double puissance) {
		
		m_last_result = Math.pow(nombre, puissance);
		
		return m_last_result;
		
	}
	
	public double getLastResult() {
		return m_last_result;
	}
	
}

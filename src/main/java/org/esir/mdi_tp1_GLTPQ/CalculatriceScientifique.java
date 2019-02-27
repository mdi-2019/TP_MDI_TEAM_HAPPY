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
	
	public double logarithme(double nombre, double base) {
		m_last_result = Math.log(nombre)/Math.log(base);
		return m_last_result;
	}
	
	public double puissance10(double nombre) {
		m_last_result = Math.pow(nombre, 10.0);
		return m_last_result;
	}

}

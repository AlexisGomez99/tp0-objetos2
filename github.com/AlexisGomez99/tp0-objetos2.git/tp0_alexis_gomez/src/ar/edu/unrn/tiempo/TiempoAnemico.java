package ar.edu.unrn.tiempo;

import java.time.LocalDate;

public class TiempoAnemico {
	
	private LocalDate dia;
	
	

	public TiempoAnemico(LocalDate dia) {
		super();
		this.dia = dia;
	}

	public LocalDate getDia() {
		return dia;
	}

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	
}

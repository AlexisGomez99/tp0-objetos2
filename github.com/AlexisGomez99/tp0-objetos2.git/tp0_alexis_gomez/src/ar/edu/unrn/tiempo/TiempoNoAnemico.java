package ar.edu.unrn.tiempo;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class TiempoNoAnemico {
	private LocalDate dia;

	public TiempoNoAnemico(LocalDate date) {
		this.dia=date;
	}
	
	public void imprimirDiaLargo() {
	    System.out.println(""+dia.getDayOfWeek()+" "+ dia.getDayOfMonth()+ " of "+ dia.getMonth()+ ", "+ dia.getYear());
	    //Lunes 3 de Abril de 2020”
	}
	public void imprimirDiaCorto() {
	    System.out.println("\n" +dia.format(DateTimeFormatter.ISO_DATE));
	}
	 
	
}

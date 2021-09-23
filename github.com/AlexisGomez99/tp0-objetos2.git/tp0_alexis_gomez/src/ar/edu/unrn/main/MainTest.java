package ar.edu.unrn.main;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import ar.edu.unrn.tiempo.TiempoAnemico;
import ar.edu.unrn.tiempo.TiempoNoAnemico;

public class MainTest {

	public static void main(String[] args) throws ParseException {

		LocalDate diaN= LocalDate.now();
	
		TiempoNoAnemico dia= new TiempoNoAnemico(diaN);
		dia.imprimirDiaLargo();
		System.out.println("------------");
		dia.imprimirDiaCorto();
		System.out.println("------------");
		System.out.println("cambioo");
		TiempoAnemico diaAnemico= new TiempoAnemico(diaN);
		
		LocalDate diaanemico= diaAnemico.getDia();
		System.out.println("DIA CORTO.");
		System.out.println("\n" +diaanemico.format(DateTimeFormatter.ISO_DATE));
		System.out.println("DIA LARGO");
		System.out.println(""+diaanemico.getDayOfWeek()+" "+ diaanemico.getDayOfMonth()+ " of "+ diaanemico.getMonth()+ ", "+ diaanemico.getYear());
		
		
		
	}

}

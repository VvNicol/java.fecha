/**
 * 
 */
package Controlador;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Instanciamos el objeto Calendar
		// en fecha obtenemos la fecha y hora del sistema
		Calendar fecha = new GregorianCalendar();

		// Obtenemos el valor del año, mes, día,
		// hora, minuto y segundo del sistema
		// usando el método get y el parámetro correspondiente
		int anio = fecha.get(Calendar.YEAR);
		int mes = fecha.get(Calendar.MONTH);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		int hora = fecha.get(Calendar.HOUR_OF_DAY);
		int minuto = fecha.get(Calendar.MINUTE);
		int segundo = fecha.get(Calendar.SECOND);
		int semana = fecha.get(Calendar.DAY_OF_WEEK);
		int diaAnio = fecha.get(Calendar.DAY_OF_YEAR);

		System.out.println("año = " + anio);
		System.out.println("mes = " + (mes+1));
		System.out.println("dia = " + dia);
		System.out.println("hora = " + hora);
		System.out.println("minuto = " + minuto);
		System.out.println("segundo = " + segundo);
		System.out.println("semana en el mes = " + semana);
		System.out.println("dia del año = " + diaAnio);
       
	}
			
}

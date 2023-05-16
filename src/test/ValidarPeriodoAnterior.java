package test;

import java.time.LocalDate;

public class ValidarPeriodoAnterior {
	public static void main(String[] args) {
//		LocalDate fecha = LocalDate.of(2023, 4, 6);
		LocalDate fecha = LocalDate.now();
		int daysPlus=7;
		System.err.println("Fecha: "+fecha);
		boolean periodoAnterior = UtilitarioFechas.isNowDateOnMonthInitialBusinessDays(fecha,daysPlus);
		System.err.println("periodoAnterior "+periodoAnterior);
	}
}
package test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.temporal.ChronoField;
import java.util.EnumSet;
import java.util.Set;

public class UtilitarioFechas {

	private static final int NUMBER_ONE = 1;
	private static final int NUMBER_TWO = 2;

	private UtilitarioFechas(){
		throw new IllegalStateException("Utility class");
	}

	public static boolean isNowDateOnMonthInitialBusinessDays(LocalDate now, int daysPlus){
		boolean isNowDateOnMonthInitial = false;

		for(int i=0; i < daysPlus; i++) {
			LocalDate date = validateBusinessDayOfMonth(YearMonth.now(), i);
			isNowDateOnMonthInitial = now.equals(date);
			if(isNowDateOnMonthInitial) {
				break;
			}
		}

		return isNowDateOnMonthInitial;
		
	}

	public static LocalDateTime getLastWorkingDayOfMonth(LocalDateTime date) {
		LocalDateTime lastWorkingDayOfMonth = date.withDayOfMonth(NUMBER_ONE).plusMonths(NUMBER_ONE);
		do {
			lastWorkingDayOfMonth = lastWorkingDayOfMonth.minusDays(1);
		} while (lastWorkingDayOfMonth.getDayOfWeek() == DayOfWeek.SATURDAY ||
				lastWorkingDayOfMonth.getDayOfWeek() == DayOfWeek.SUNDAY);
		return lastWorkingDayOfMonth;
	}

	public static LocalDateTime getLastWorkingDayOfPreviousMonth(LocalDateTime date) {
		var previousMonth = date.minusMonths(NUMBER_ONE);
		LocalDate lastDayOfPreviousMonth =
				YearMonth.of(previousMonth.getYear(), previousMonth.getMonth()).atEndOfMonth();
		var lastDayOfPreviousMonthTime = LocalDateTime.of(lastDayOfPreviousMonth, LocalTime.now());
		return getLastWorkingDayByMonth(lastDayOfPreviousMonthTime);
	}
	public static LocalDateTime getLastWorkingDayByMonth(LocalDateTime lastDayOfMonth) {
		return switch (DayOfWeek.of(lastDayOfMonth.get(ChronoField.DAY_OF_WEEK))) {
		case SATURDAY -> lastDayOfMonth.minusDays(NUMBER_ONE);
		case SUNDAY -> lastDayOfMonth.minusDays(NUMBER_TWO);
		default -> lastDayOfMonth;
		};
	}

	public static LocalDate firstBusinessDayOfMonth(YearMonth month) {
		final Set<DayOfWeek> businessDays = EnumSet.of(
				DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY
				);
		return month.atDay(NUMBER_ONE).datesUntil(month.plusMonths(NUMBER_ONE).atDay(NUMBER_ONE))
				.filter(date -> businessDays.contains(date.getDayOfWeek()))
				.findFirst()
				.orElse(null);
	}

	public static LocalDate secondBusinessDayOfMonth(YearMonth month) {
		final Set<DayOfWeek> businessDays = EnumSet.of(
				DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY
				);
		return month.atDay(NUMBER_ONE).datesUntil(month.plusMonths(NUMBER_ONE).atDay(NUMBER_ONE))
				.filter(date -> businessDays.contains(date.getDayOfWeek()))
				.skip(NUMBER_ONE)
				.findFirst()
				.orElse(null);
	}

	public static LocalDate validateBusinessDayOfMonth(YearMonth month, int day) {
		final Set<DayOfWeek> businessDays = EnumSet.of(
				DayOfWeek.MONDAY, DayOfWeek.TUESDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY
				);
		return month.atDay(NUMBER_ONE).datesUntil(month.plusMonths(NUMBER_ONE).atDay(NUMBER_ONE))
				.filter(date -> businessDays.contains(date.getDayOfWeek()))
				.skip(day)
				.findFirst()
				.orElse(null);
	}


}

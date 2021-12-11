package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.GregorianCalendar;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {2028, 2024, 2012, 2004, 1996})
	public void Should_return_true(int year) {
		assertTrue(new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2029, 2023, 2010, 2001, 1993})
	public void Should_return_false(int year) {
		assertTrue(!(new Calendar(year).isLeapYear()));
	}

	@ParameterizedTest
	@ValueSource(ints = {2, 1036, 1492, 1516, 1789})
	public void Should_return_if_year_is_leap(int year) {
		assertEquals(new GregorianCalendar().isLeapYear(year), new Calendar(year).isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {-5, 2147483647, -2147483648})
	public void Should_return(int year) {
		assertTrue(!(new Calendar(year).isLeapYear()));
	}
}

package org.example.services;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalendarServiceTest {
    CalendarService service = new CalendarService();

    @Test
    public void testActualCalendar() {
        String result = service.getCalendar();
        assertTrue(result.contains("Calendário de maio de 2025"));
    }

    @Test
    public void testCalendar2023() {
        String result = service.getCalendar("2023");
        assertTrue(result.contains("Calendário de janeiro de 2023"));
        assertTrue(result.contains("Calendário de dezembro de 2023"));
    }

    @Test
    public void testCalendarMonthAndYear() {
        String result = service.getCalendar("2", "2020");
        assertEquals("Calendário de fevereiro de 2020", result);
    }
}

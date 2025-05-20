package org.example.services;

import java.time.YearMonth;
import java.time.format.TextStyle;
import java.util.Locale;

public class CalendarService {
    public String getCalendar() {
        YearMonth actualYear = YearMonth.now();
        return formatCalendar(actualYear.getMonthValue(), actualYear.getYear());
    }

    public String getCalendar(String year) {
        int intYear = Integer.parseInt(year);
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= 12; i++) {
            sb.append(formatCalendar(i, intYear)).append("\n");
        }
        return sb.toString();
    }

    public String getCalendar(String month, String year) {
        return formatCalendar(Integer.parseInt(month), Integer.parseInt(year));
    }

    public String formatCalendar(int month, int year) {
        YearMonth ym = YearMonth.of(year, month);
        String nameMonth = ym.getMonth().getDisplayName(TextStyle.FULL, new Locale("pt", "BR"));
        return String.format("Calendário de %s de %d", nameMonth, year);
    }

}

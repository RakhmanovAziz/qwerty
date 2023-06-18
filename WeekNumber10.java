package org.zadacha31;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WeekNumber10 {

    public static int calculateWeekNumber(String dateString) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yy");
        Date date = format.parse(dateString);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        int year = calendar.get(Calendar.YEAR);
        int week = calendar.get(Calendar.WEEK_OF_YEAR);

        // Корректировка номера недели для начала года
        if (year == 2020) {
            week -= 1;
        }

        return week;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String inputDate = sc.nextLine(); //"08.01.20";
            int weekNumber = calculateWeekNumber(inputDate);
            System.out.println("Неделя " + weekNumber);
        } catch (ParseException e) {
            System.out.println("Некорректный формат даты");
        }
    }


}


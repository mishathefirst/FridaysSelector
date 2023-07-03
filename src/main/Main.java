package main;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        for (int i = 0; i < LocalDate.now().lengthOfYear(); i++) {
            if (date.plusDays(i).getDayOfWeek().equals(DayOfWeek.FRIDAY) && date.plusDays(i).getDayOfMonth() == 13) {
                System.out.println(date.plusDays(i));
            }
        }

    }

}

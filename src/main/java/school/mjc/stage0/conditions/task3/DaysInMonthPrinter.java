package school.mjc.stage0.conditions.task3;

import java.time.Month;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        switch (month){
            case 1: System.out.println(Month.JANUARY.length(false));
                break;
            case 2: System.out.println(Month.FEBRUARY.length(false));
                break;
            case 3: System.out.println(Month.MARCH.length(false));
                break;
            case 4: System.out.println(Month.APRIL.length(false));
                break;
            case 5: System.out.println(Month.MAY.length(false));
                break;
            case 6: System.out.println(Month.JUNE.length(false));
                break;
            case 7: System.out.println(Month.JULY.length(false));
                break;
            case 8: System.out.println(Month.AUGUST.length(false));
                break;
            case 9: System.out.println(Month.SEPTEMBER.length(false));
                break;
            case 10: System.out.println(Month.OCTOBER.length(false));
                break;
            case 11: System.out.println(Month.NOVEMBER.length(false));
                break;
            case 12: System.out.println(Month.DECEMBER.length(false));
                break;
            default:
                System.out.println("wrong number!");
                break;
        }
    }
}

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class DeliveryDate {
    public LocalDate getDeliveryDate(){
        LocalDate localDate = getNow();
        int day = localDate.getDayOfMonth();
        Month month = localDate.getMonth();
        int year = localDate.getYear();

        if(day < 10){
            return LocalDate.of(localDate.getYear(), localDate.getMonth(), 15);
        }

        if (month.equals(Month.DECEMBER) && day >= 20) {
            return LocalDate.of(localDate.getYear() + 1, localDate.getMonth().plus(1L), 15);
        } else if(day >= 25){
            return LocalDate.of(localDate.getYear(), localDate.getMonth().plus(1L), 15);
        }

        return LocalDate.of(year, month, getLastDay(year, month));
    }

    protected int getLastDay(int year, Month month) {
        int lastDay;
        if (Arrays.asList(Month.APRIL, Month.JUNE, Month.SEPTEMBER, Month.NOVEMBER).contains(month) ) {
            lastDay = 30;
        } else if (month.equals(Month.FEBRUARY)) {
            if (year % 400 == 0) {
                lastDay = 29;
            } else if (year % 100 == 0) {
                lastDay = 28;
            } else if (year % 4 == 0) {
                lastDay = 29;
            } else {
                lastDay = 28;
            }
        } else {
            lastDay = 31;
        }
        return lastDay;
    }

    protected LocalDate getNow() {
        return LocalDate.now();
    }
}

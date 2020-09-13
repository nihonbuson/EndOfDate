import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDateTest {

//    @Test
//    void _小の月の月末になる場合のテスト() {
//        LocalDate actualDate = new DeliveryDate().getDeliveryDate();
//        assertEquals(LocalDate.of(2020,9,30),actualDate);
//    }
//
//    @Test
//    void _大の月の月末になる場合のテスト() {
//        LocalDate actualDate = new DeliveryDate().getDeliveryDate();
//        assertEquals(LocalDate.of(2020,10,31),actualDate);
//    }


    @Test
    void _小の月の月末の日付のテスト() {
        int lastDay = new DeliveryDate().getLastDay(2020, Month.SEPTEMBER);
        assertEquals(30,lastDay);
    }

    @Test
    void _大の月の月末の日付のテスト() {
        int lastDay = new DeliveryDate().getLastDay(2020, Month.OCTOBER);
        assertEquals(31,lastDay);
    }
}
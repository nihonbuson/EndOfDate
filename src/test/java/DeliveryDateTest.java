import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDateTest {

    @Test
    void _小の月の月末になる場合のテスト() {
        DeliveryDate deliveryDate = new FakeDeliveryDate();
        LocalDate actualDate = deliveryDate.getDeliveryDate();
        assertEquals(LocalDate.of(2020,9,30),actualDate);
    }

    private class FakeDeliveryDate extends DeliveryDate {
        @Override
        protected LocalDate getNow() {
            return LocalDate.of(2020,9,13);
        }
    }

//    @Test
//    void _大の月の月末になる場合のテスト() {
//        LocalDate actualDate = new DeliveryDate().getDeliveryDate();
//        assertEquals(LocalDate.of(2020,10,31),actualDate);
//    }

}
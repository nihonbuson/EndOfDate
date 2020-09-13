import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDateTest {


    @Nested
    class _小の月の月末 {
        @Test
        void _4月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,4,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,4,30),actualDate);
        }

        @Test
        void _6月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,6,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,6,30),actualDate);
        }

        @Test
        void _9月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,9,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,9,30),actualDate);
        }

        @Test
        void _11月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,11,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,11,30),actualDate);
        }
    }

    @Nested
    class _2月の月末 {
        @Test
        void _4で割り切れない年の2月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2019,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2019,2,28),actualDate);
        }

        @Test
        void _4で割り切れる年の2月の月末になる場合のテスト() {
            FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
            deliveryDate.setDate(LocalDate.of(2020,2,13));
            LocalDate actualDate = deliveryDate.getDeliveryDate();
            assertEquals(LocalDate.of(2020,2,29),actualDate);
        }
    }

    @Test
    void _大の月の月末になる場合のテスト() {
        FakeDeliveryDate deliveryDate = new FakeDeliveryDate();
        deliveryDate.setDate(LocalDate.of(2020,10,13));
        LocalDate actualDate = deliveryDate.getDeliveryDate();
        assertEquals(LocalDate.of(2020,10,31),actualDate);
    }

    private class FakeDeliveryDate extends DeliveryDate {
        private LocalDate date;

        @Override
        protected LocalDate getNow() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }
    }


}
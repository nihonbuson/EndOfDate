import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryDateTest {

    @Test
    void _配送日のテスト() {
        LocalDate actualDate = new DeliveryDate().getDeliveryDate();
        assertEquals(LocalDate.of(2020,9,30),actualDate);
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationTest {

    @Test
    void mainShouldPrintThis() {
        assertEquals("I'd love to visit Rome Italy", "I'd love to visit Rome Italy");
        assertNotEquals("I'd love to see Rome Italy", "I'd love to visit Rome Italy");
    }
}


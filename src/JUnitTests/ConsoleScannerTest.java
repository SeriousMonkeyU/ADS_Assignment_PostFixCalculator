package JUnitTests;

import API.ConsoleScanner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleScannerTest {

    @Test
    void constructor_o() {
        assertDoesNotThrow(() -> new ConsoleScanner());
    }
}
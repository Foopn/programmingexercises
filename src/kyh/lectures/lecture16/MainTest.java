package kyh.lectures.lecture16;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest {

    @Test
    void ensureValueIsDoubled() {
        Main main = new Main();
        assertEquals(4, main.doubleValue(2));
    }

    @Test
    void ensureLineIsPrintedToSystemOut() {
        Main main = new Main();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        main.printToTerminal("s");
        assertEquals("s", outContent.toString().trim());
    }

    @Test
    void ensureIOExceptionIsThrown() {
        Main main = new Main();
        assertThrows(IOException.class, () -> {
            main.canSometimesGoWrong();
        });
    }
}

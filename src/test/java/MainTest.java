import org.junit.jupiter.api.Test;
import org.testify.Main;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.TreeMap;

public class MainTest {
    @Test
    public void testMain() {
        // Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("4".getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
        String expected = "Goodbye!";
        // Act
        Main.main(new String[0]);
        String actual = out.toString();
        // Assert
        assert actual.contains(expected);
    }
}

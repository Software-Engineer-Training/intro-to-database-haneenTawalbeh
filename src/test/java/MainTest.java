import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testAddNumber() {
        // arrange
        int x = 5;
        int y = 3;

        // act
        int result = Main.addNumber(x, y);

        // assert
        assertEquals(7, result, "5 + 3 should equal 8");
    }
}

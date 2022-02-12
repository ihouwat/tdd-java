import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private final FizzBuzz target = new FizzBuzz();

    @Test
    void fizzBuzzMethodRuns() {
        assertEquals("FizzBuzz says hello!", target.sayHello());
    }
}
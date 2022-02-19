import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

class FizzBuzzTest {

    @Mock
    private final FizzBuzz mock = mock(FizzBuzz.class);
    private final FizzBuzz testClass = new FizzBuzz();

    @Test
    void test_saysHello_MethodReturnsCorrectString() {
        assertEquals("FizzBuzz says hello!", testClass.sayHello());
    }

    @Test
    void test_saysHelloMethodInvokedOnce() {
        mock.sayHello();
        verify(mock, times(1)).sayHello();
    }

    @Test
    void test_saysHello_MethodInvokedMultipleTimes() {
        mock.sayHello();
        mock.sayHello();
        verify(mock, times(2)).sayHello();
    }

    @Test
    void test_saysHello_MethodDoesNotInvoked() {
        verify(mock, never()).sayHello();
    }

    @Test
    void fizzBuzzMethodInvokedOnce() {
        mock.fizzBuzz(anyInt());
        verify(mock).fizzBuzz(anyInt());
    }

    @Test
    void fizzBuzzReturnsAListOfIntegersOnly() {
        List<String> result = testClass.fizzBuzz(2);
        String[] testResult = {"1", "2"};
        assertArrayEquals(testResult, result.toArray());
    }

    @Test
    void fizzBuzzReturnsOneInstanceOfFizz() {
        List<String> result = testClass.fizzBuzz(3);
        String[] testResult = {"1", "2", "Fizz"};
        assertArrayEquals(testResult, result.toArray());
    }

    @Test
    void fizzBuzzReturnsOneInstanceOfBuzz() {
        List<String> result = testClass.fizzBuzz(5);
        String[] testResult = {"1", "2", "Fizz", "4", "Buzz"};
        assertArrayEquals(testResult, result.toArray());
    }

    @Test
    void testResultExpectedNumberFiveButMethodReturnedBuzz() {
        List<String> result = testClass.fizzBuzz(5);
        String[] testResult = {"1", "2", "Fizz", "4", "5"};
        assertFalse(Arrays.equals(testResult, result.toArray()));
    }

    @Test
    void fizzBuzzReturnsOneInstanceOfFizzBuzz() {
        List<String> result = testClass.fizzBuzz(15);
        String[] testResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};
        assertArrayEquals(testResult, result.toArray());
    }

}
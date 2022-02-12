import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TestPracticeTest {
    private final TestPractice target = new TestPractice();
    TestPractice mockTarget = Mockito.mock(TestPractice.class);

    // Testing method
    @Test
    void addTwoNumbers() {
        assertEquals(3, target.add(1,2));
    }

    @Test
    void subtractTwoNumbers() {
        assertEquals(1, target.subtract(3, 2));
    }

    //  Using Mocks
    @Test
    void additionMethodRunsOnce() {
        mockTarget.add(0,1);
        Mockito.verify(mockTarget, Mockito.times(1)).add(0,1);
    }

    @Test
    void additionMethodRunsMultipleTimes() {
        mockTarget.add(0,1);
        mockTarget.add(0,1);
        Mockito.verify(mockTarget, Mockito.times(2)).add(0,1);
    }

}
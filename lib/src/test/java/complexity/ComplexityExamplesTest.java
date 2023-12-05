package complexity;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ComplexityExamplesTest {

    @Test
    public void shouldReturnTheSumOfTheTwoFirstPrimes() {
        ComplexityExamples complexityExamples = new ComplexityExamples();
        int sum = complexityExamples.sumOfPrimes(2);
        assertEquals(sum, 3);
    }

    @Test
    public void shouldReturnACoupleForTwoWords() {
        ComplexityExamples complexityExamples = new ComplexityExamples();
        String words = complexityExamples.getWords(2);
        assertEquals(words, "a couple");
    }
}
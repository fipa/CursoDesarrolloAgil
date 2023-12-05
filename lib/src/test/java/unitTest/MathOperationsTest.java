package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MathOperationsTest {

	@Test
    public void sumShouldSumAnArrayOfNumbers() {

        // Arrange
        Integer[] numbers = {1,2,3};

        // Act
        Integer result = MathOperations.sum(numbers);

        // Assert
        assertEquals(new Integer(6), result);

    }

    @Test
    public void sumShouldSumZeroForAnEmptyArray() {

        // Arrange

        // Act

        // Assert
    }
    
    @Test
    public void maxShouldReturnTwoBetweenOneAndTwo() {
    	Integer[] numbers = {1,2};
    	
    	Integer result = MathOperations.max(numbers);
    	
    	assertEquals(new Integer(2), result);
    }
}

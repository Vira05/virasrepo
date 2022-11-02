import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    //1. Positive Happy path
    // if (start <= end)
    // return array

    //start < end
    @Test
    public void testStartLessThenEnd_HappyPath() {
      //AAA
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz",
                "13", "14", "FizzBuzz", "16", "17", "Fizz",
                "19", "Buzz"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assertions.assertArrayEquals(actualResult, expectedResult);

    }
// start == end
@Test
public void testStartEqualsThenEnd_HappyPath() {
    //AAA
    int start = 1;
    int end = 1;
    String[] expectedResult = {"1"};

    String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

    Assertions.assertArrayEquals(actualResult, expectedResult);
}
    @Test
    public void testStartLessThenEndNegativeNumber_HappyPath() {
        //AAA
        int start = -20;
        int end = -1;
        String[] expectedResult = {"Buzz", "-19", "Fizz", "-17",
                "-16", "FizzBuzz", "-14", "-13", "Fizz", "-11",
                "Buzz", "Fizz", "-8", "-7", "Fizz", "Buzz", "-4",
                "Fizz", "-2", "-1"};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assertions.assertArrayEquals(actualResult, expectedResult);

    }

    //1. Negative Happy path
    // if (start >= end)
    // return newString[0];
    @Test
    public void testStartGreaterThenEnd_NegativePath() {
        //AAA
        int start = 20;
        int end = 1;
        String[] expectedResult = {};

        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        Assertions.assertArrayEquals(actualResult, expectedResult);
    }

}

package craft.deepmanapps.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTest{



    @Test
    void shouldReturnOneWhenInputOne(){

        //Arrange
        int input=1;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //Act

        String result=fizzBuzz.fizzBuzz(input);

        //Assert
        assertEquals("1",result);

    }


    @Test
    void shouldReturnFizzWhenInputIsThree(){

        //Arrange
        int input=3;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //Act

        String result=fizzBuzz.fizzBuzz(input);

        //Assert
        assertEquals("Fizz",result);


    }

    @Test
    void shouldReturnFizzWhenInputIsFive(){

        //Arrange
        int input=5;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //Act

        String result=fizzBuzz.fizzBuzz(input);

        //Assert
        assertEquals("Buzz",result);


    }

    @Test
    void shouldReturnFizzBuzzWhenInputIsFifteen(){

        //Arrange
        int input=15;
        FizzBuzz fizzBuzz=new FizzBuzz();
        //Act

        String result=fizzBuzz.fizzBuzz(input);

        //Assert
        assertEquals("FizzBuzz",result);


    }

}
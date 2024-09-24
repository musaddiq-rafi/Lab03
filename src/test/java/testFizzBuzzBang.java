package test;

import org.example.FizzBuzzBang;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testFizzBuzzBang {

    @Test
    public void testFizz() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("Fizz", fb.fizzBuzzBangMethod(3, false));
    }

    @Test
    public void testBuzz() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("Buzz", fb.fizzBuzzBangMethod(5, false));
    }

    @Test
    public void testBang() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("Bang", fb.fizzBuzzBangMethod(7, false));
    }

    @Test
    public void testFizzBuzz() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("FizzBuzz", fb.fizzBuzzBangMethod(15, false));
    }

    @Test
    public void testFizzBuzzBang() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("FizzBuzzBang", fb.fizzBuzzBangMethod(105, false));
    }

    @Test
    public void testBoom() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("Boom", fb.fizzBuzzBangMethod(8, false));
    }

    @Test
    public void testUppercaseFizzBuzz() {
        FizzBuzzBang fb = new FizzBuzzBang();
        assertEquals("FIZZBUZZ", fb.fizzBuzzBangMethod(15, true));
    }
}

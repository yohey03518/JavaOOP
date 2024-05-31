import org.junit.jupiter.api.Test;
import polymorphism.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void initial(){
        Calculator calculator = new Calculator();

        double actual = calculator.GetResult();

        assertEquals(0, actual);
    }

    @Test
    public void add_int() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3);
        double actual = calculator.GetResult();

        assertEquals(5, actual);
    }

    @Test
    public void multiply_add_int() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Multiply(3);
        double actual = calculator.GetResult();

        assertEquals(6, actual);
    }

    @Test
    public void clean() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3);
        calculator.Clean();
        double actual = calculator.GetResult();

        assertEquals(0, actual);
    }

    @Test
    public void add_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5f);
        calculator.Add(3.5f);
        double actual = calculator.GetResult();

        assertEquals(6, actual);
    }

    @Test
    public void multiply_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5f);
        calculator.Multiply(3.5f);
        double actual = calculator.GetResult();

        assertEquals(8.75, actual);
    }

    @Test
    public void add_double() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5);
        calculator.Add(3.5);
        double actual = calculator.GetResult();

        assertEquals(6, actual);
    }

    @Test
    public void add_multiply_double() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5);
        calculator.Multiply(3.5);
        double actual = calculator.GetResult();

        assertEquals(8.75, actual);
    }

    @Test
    public void add_int_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3.5f);
        double actual = calculator.GetResult();

        assertEquals(5.5, actual);
    }

    @Test
    public void add_int_double() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3.5);
        double actual = calculator.GetResult();

        assertEquals(5.5, actual);
    }

    @Test
    public void add_int_multiply_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Multiply(3.5f);
        double actual = calculator.GetResult();

        assertEquals(7, actual);
    }
}

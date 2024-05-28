import org.junit.jupiter.api.Test;
import polymorphism.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {
    @Test
    public void initial(){
        Calculator calculator = new Calculator();

        assertEquals(0, calculator.GetResult());
    }

    @Test
    public void add_int() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3);

        assertEquals(5, calculator.GetResult());
    }

    @Test
    public void multiply_add_int() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Multiply(3);

        assertEquals(6, calculator.GetResult());
    }

    @Test
    public void clean() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3);
        calculator.Clean();

        assertEquals(0, calculator.GetResult());
    }

    @Test
    public void add_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5f);
        calculator.Add(3.5f);

        assertEquals(6, calculator.GetResult());
    }

    @Test
    public void multiply_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5f);
        calculator.Multiply(3.5f);

        assertEquals(8.75, calculator.GetResult());
    }

    @Test
    public void add_double() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5);
        calculator.Add(3.5);

        assertEquals(6, calculator.GetResult());
    }

    @Test
    public void add_multiply_double() {
        Calculator calculator = new Calculator();

        calculator.Add(2.5);
        calculator.Multiply(3.5);

        assertEquals(8.75, calculator.GetResult());
    }

    @Test
    public void add_int_float() {
        Calculator calculator = new Calculator();

        calculator.Add(2);
        calculator.Add(3.5f);

        assertEquals(5.5, calculator.GetResult());
    }

    @Test
    public void add_int_double() {
        Calculator calculator = new Calculator();
        calculator.Add(2);
        calculator.Add(3.5);
        assertEquals(5.5, calculator.GetResult());
    }

    @Test
    public void add_int_multiply_float() {
        Calculator calculator = new Calculator();
        calculator.Add(2);
        calculator.Multiply(3.5f);
        assertEquals(7, calculator.GetResult());
    }
}

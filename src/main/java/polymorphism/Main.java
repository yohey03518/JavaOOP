package polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.Add(1);
        calculator.Add(1.5d);
        System.out.println(calculator.GetResult());

        calculator.Multiply(3.14f);
        System.out.println(calculator.GetResult());

        calculator.Clean();
        System.out.println(calculator.GetResult());
        calculator.Add(3);
        System.out.println(calculator.GetResult());
    }
}

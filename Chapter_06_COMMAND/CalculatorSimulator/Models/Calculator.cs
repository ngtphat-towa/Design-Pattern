namespace CalculatorSimulator.Models;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void Add(int operand) {
        this.value += operand;
        Console.WriteLine("Value: " + this.value);
    }

    public void Subtract(int operand) {
        this.value -= operand;
        Console.WriteLine("Value: " + this.value);
    }

    public void Multiply(int operand) {
        this.value *= operand;
        Console.WriteLine("Value: " + this.value);
    }

    public void Divide(int operand) {
        if (operand == 0) {
            Console.WriteLine("Error: Cannot divide by zero");
            return;
        }
        this.value /= operand;
        Console.WriteLine("Value: " + this.value);
    }
}
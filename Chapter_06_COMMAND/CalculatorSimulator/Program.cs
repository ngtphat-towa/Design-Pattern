using CalculatorSimulator.CalculatorControls;
using CalculatorSimulator.Commands;
using CalculatorSimulator.Models;

namespace CalculatorSimulator;
class Program
{
    private static void ConcretedClass_Example()
    {
        ConcretedClassCalculatorControl control = new ConcretedClassCalculatorControl();
        Calculator calculator = new Calculator();

        control.ExecuteCommand(new AddCommand(calculator, 10));
        control.ExecuteCommand(new SubtractCommand(calculator, 5));

        control.Undo();
        control.Undo();

        control.Redo();
        control.Redo();

        control.Undo();
    }

    private static void Lamda_Example()
    {
        LamdaCalculatorControl control = new LamdaCalculatorControl();
        Calculator calculator = new Calculator();

        control.ExecuteCommand(new Command(() => calculator.Add(10), () => calculator.Subtract(10)));
        control.ExecuteCommand(new Command(() => calculator.Subtract(5), () => calculator.Add(5)));
        control.ExecuteCommand(new Command(() => calculator.Multiply(2), () => calculator.Divide(2)));
        control.ExecuteCommand(new Command(() => calculator.Divide(3), () => calculator.Multiply(3)));

        control.Undo();
        control.Undo();

        control.Redo();
        control.Redo();

        control.Undo();
    
    }
   public static void Main(string[] args)
   {
       // ConcretedClass_Example();
       Lamda_Example();
   }
}

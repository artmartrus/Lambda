package Lambda.Calculator;
import java.lang.ArithmeticException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {

            Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.divided.apply(2, 1); // В реализации были представлены буквы, BinaryOperator у нас представлен для целых чисел
            int d = calc.abs.apply(1);           // и операция деления может выполняться только над числами, так же на ноль нельзя делить, для
            calc.println.accept(d);                 // для избежания ошибки был реализован блок с try - catch
        }catch (ArithmeticException exception){
            System.out.println("В операции 'divided' попытка деления на ноль, укажите второе число отличное от нуля");
        }


    }
}

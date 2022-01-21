package lambda.сalculator;
import java.lang.ArithmeticException;

public class Main {

    public static void main(String[] args) {
        try {

            Calculator calc = Calculator.instance.get();

            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(2, 1); // В предложенном варианте реализации кода переменная b равнялась нулю
            int c = calc.divided.apply(a, b);    // поменял значения для метода minus, ввел блок try - cath для вывода ошибки
            int d = calc.abs.apply(1);
            calc.println.accept(c);
        }catch (ArithmeticException exception){
            System.out.println("В операции 'divided' попытка деления на ноль, укажите второе число отличное от нуля");
        }


    }
}

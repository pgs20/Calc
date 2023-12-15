import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calc = Calculator.istance.get();
        // Ошибка возникает из-за операции devide(деления) на ноль
        // Вылетает исключение ArithmeticException
        // Необходимо реализовать обработчик, где будет ловиться и обрабатываться данное исключение
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.devide.apply(a, b);

            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка в вычислениях! Делить на 0 нельзя.");
            e.printStackTrace();
        }
    }
}

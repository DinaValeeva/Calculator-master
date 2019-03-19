import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private Scanner scanner = new Scanner(System.in);
    private double a;
    private double b;
    private String c;

    public void readA(){
        System.out.println("Введите 'a'");
        try {
            a = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new NotNumberException("Нельзя вводить не число");
        }
    }

    public void readB(){
        System.out.println("Введите 'b'");
        try {
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new NotNumberException("Нельзя вводить не число");
        }
    }

    public void readOperations(){
        System.out.println("Введите операцию");
        try {
            c = scanner.next();
        } catch (InputMismatchException e) {
            throw new NotNumberException("Нельзя вводить не операцию");
        }
    }


    public void process(){
        switch (c) {
            case "+" : plus(); break;
            case "-" : minus(); break;
            case "/" : div(); break;
            case "*" : umnozh(); break;

            default:
                throw new RuntimeException("Неизвестный оператор");

        }
    }

    public void div(){
        System.out.println(a/b);
    }
    public void plus(){
        System.out.println(a+b);
    }
    public void minus(){
        System.out.println(a-b);
    }
    public void umnozh(){
        System.out.println(a*b);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.readA();
        calculator.readB();
        calculator.readOperations();
        calculator.process();

    }
}

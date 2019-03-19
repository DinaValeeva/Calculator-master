import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SmartCalculator {

    private String row;
    private Scanner scanner = new Scanner(System.in);

    public void readRow() {
        System.out.println("Введите выражение");
        row = scanner.next();
    }

    public void process() {
        Queue<Operations> operations = new LinkedList<>();
        for (int i = 0; i < row.length(); i++) {
            switch (row.charAt(i)) {
                case '+':
                case '-':
                case '*':
                case '/':
                    operations.add(new Operations(i, row.charAt(i)));

            }
            System.out.print(row.charAt(i)); // все выражение

        }
        while (!operations.isEmpty()) {

            Operations operation = null;

            String leftNumber = "";

            String rightNumber = "";

            String result = "";

            row = row.replaceAll(leftNumber + operation.getValue() + rightNumber, result);
            process();
        }
        System.out.println(row);
    }
    public static void main(String[] args) {
        SmartCalculator smartCalculator = new SmartCalculator();
        smartCalculator.readRow();
        smartCalculator.process();
    }
}
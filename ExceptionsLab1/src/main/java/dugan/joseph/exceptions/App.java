package dugan.joseph.exceptions;

/**
 * Created by joseph on 2/20/16.
 */
public class App {

    public static void main(String[] args) {
        // divide
        System.out.println("divide regular: " + Calculator.divide(4, 2));

        try {
            System.out.println("divide by zero: " + Calculator.divide(2, 0));
        }
        catch (ArithmeticException e) {
            System.out.println("Division by zero attempted (still highly contentious)");
        }

        // add
        System.out.println("First addition problem: " + Calculator.add(1, 2));
        System.out.println("Second addition problem: " + Calculator.add(40, 3));

        // subtract
        System.out.println("First subtraction problem: " + Calculator.subtract(10, 2));
        System.out.println("Second subtraction problem: " + Calculator.subtract(20, 3));

        // multiply
        System.out.println("First multiplication problem: " + Calculator.multiply(2, 1));
        System.out.println("Second multiplication problem: " + Calculator.multiply(49, 2));
    }
}

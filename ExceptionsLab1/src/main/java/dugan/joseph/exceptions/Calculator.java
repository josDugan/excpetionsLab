package dugan.joseph.exceptions;

/**
 * Created by joseph on 2/20/16.
 */
public class Calculator {

    static int add(int augend, int addend) {
        return augend + addend;
    }

    static int subtract(int minuend, int subtrahend) {
        return minuend - subtrahend;
    }

    static int multiply(int multiplicand, int multiplier) {
        return multiplicand * multiplier;
    }

    static int divide(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0) {throw new DivisionByZeroException();}
        return dividend / divisor;
    }
}

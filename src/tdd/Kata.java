package tdd;

public class Kata {
    public int add(int firstNumber, int secondNumber) {

        int sum = firstNumber + secondNumber;

        return sum;

    }

    public int subtract(int firstNumber, int secondNumber) {
        if (secondNumber > firstNumber) return secondNumber - firstNumber;
        return firstNumber - secondNumber;
    }
/*
        if (secondNumber > firstNumber) return secondNumber - firstNumber; //one liner doesn't require curly braces
        int odogwu = firstNumber - secondNumber;
        return odogwu;
    }
*/


    public int quotient(int firstNumber, int secondNumber) {
        if (secondNumber == 0) return 0;
        int divide = firstNumber / secondNumber;
        return divide;
    }

    public int product(int firstNumber, int secondNumber ) {
        int multiply = firstNumber * secondNumber;
        return multiply;
    }
}

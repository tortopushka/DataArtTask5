package ru.dataart.academy.java;
import java.io.IOException;

public class ReverseInteger {
    /**
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */
    private static void test() throws IOException{
        throw new IOException("Number is too big!");
    }
    public int reverse(int inputNumber)  throws IOException {
        int number = 0;
        try {
            if (-2147483648 < inputNumber && inputNumber < 2147483647) {
                while (inputNumber != 0) {
                    number = inputNumber % 10 + number * 10;
                    inputNumber /= 10;
                }
            } else {
                test();
            }
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
        return number;
    }
}
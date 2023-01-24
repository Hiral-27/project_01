import java.util.Scanner;

public class Task_07_PrimeNumber {
    public static void main(String[] args) {
        /*
        Task 7-
        Write a java program to check whether a given number is prime or not?
         */

        int number= 57;
        boolean primeNum= true;

        for(int i=2; i<=number; i++) {
            if (number % i == 0) {
                primeNum = false;
                System.out.println(number + " is a Not  Prime Number---> " + primeNum);
                break;
            }
            System.out.println(number + " is a Prime Number--> "+primeNum);
            break;
        }

    }
}

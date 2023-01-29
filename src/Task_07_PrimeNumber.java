import java.util.Scanner;

public class Task_07_PrimeNumber {
    public static void main(String[] args) {

        //****** INTERVIEW QUESTION ******//

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

        //-------------------------------------------------------------------

        // Method 2:
        int given =7;
        boolean isPrime= true;
        if(given>1){
            for (int i = 2; i <given ; i++) {
                if(given%i==0){
                    isPrime=false;
                    break;
                }
            }
        }else{
            isPrime= false;
        }
        System.out.println("Given number "+given+" is Prime? "+isPrime);

        //-----------------------------------------------------------------------------

        // Method 3:
        Scanner scanner= new Scanner(System.in);
        System.out.println("Without Boolean");
        System.out.println("please enter number to check if it is prime or not");
        int number1=scanner.nextInt();
        int count=0;
        for (int i = 1; i <=number1; i++) {
            if (number1%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("prime");
        }else {
            System.out.println("not prime");
        }


    }
}

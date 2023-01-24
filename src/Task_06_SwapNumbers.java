public class Task_06_SwapNumbers {
    public static void main(String[] args) {
        /*
        Task 6-
        Write a program to swap 2 numbers without a temporary variable?
         */


        int number1= 20;
        int number2= 30;

        number1= number1+number2;
        number2= number1-number2;
        number1= number1-number2;

        System.out.println("Number 1 (New Value): "+number1);  // 30
        System.out.println("Number 2 (New Value): "+number2); // 20


    }
}


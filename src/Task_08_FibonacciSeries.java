public class Task_08_FibonacciSeries {
    public static void main(String[] args) {
        /*
        Task 8:
        Write a Java Program to print the first 10 numbers of Fibonacci series.
         */

        // 1 1 2 3 5 8 13 21 34 55

        int num=0;
        int num1=1;
        int num2;

        for(int i= 2; i<=12; i++){
            num2= num+ num1;
            num= num1;
            num1= num2;
            System.out.print(num2+" ");
        }

    }
}

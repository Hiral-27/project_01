import java.util.Arrays;
import java.util.Scanner;

public class Task_01_Sum {
    public static void main(String[] args) {
        /*
        Task 1:
        Using Scanner create an array of integer values. After the array is created,
         calculate the sum of all stored elements in that array.
         */

        Scanner input= new Scanner(System.in);
        int [] number= new int[5];
        int sum=0;
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter a number: ");
            number[i]= input.nextInt();
            sum= sum+number[i];
            System.out.println(number[i]);
        }
         System.out.println("The sum of the array= "+sum);



    }
}

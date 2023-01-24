import java.util.Scanner;

public class Task_11_DuplicateNumber {
    public static void main(String[] args) {
        /*
        Task 11:
         Write a program to print out duplicate elements from an Array of Strings?
         */

        String [] arr= {"Apples","Mangoes","Oranges","Strawberry","Apples","Kiwi","Oranges","Bananas","Kiwi"};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <i ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println("The duplicate elements are: "+arr[i]);
                }
            }
        }


    }

}

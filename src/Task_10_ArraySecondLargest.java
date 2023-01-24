public class Task_10_ArraySecondLargest {
    public static void main(String[] args) {
        /*
        Task 10-
        Write a java program to find the second largest number in the array?
         */
        int[] number = {10, 70, 20, 56, 78, 72, 67};

        int secondLargest = 0;
        int largest = 0;

        for (int i=0; i< number.length; i++) {
            if (number[i] > largest) {
                secondLargest = largest;
                largest = number[i];

            } else if (number[i] > secondLargest) {
                secondLargest = number[i];
            }
        }
        System.out.println("The second largest number is = "+secondLargest);


    }
}

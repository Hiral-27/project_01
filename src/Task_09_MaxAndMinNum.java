public class Task_09_MaxAndMinNum {
    public static void main(String[] args) {

        //****** INTERVIEW QUESTION ******//

        /*
        Task 9-
        Maximum and minimum number in the array?
         */
        int number[] = {60, 78, 50, 10, 50};

        int max = number[0];
        int min = number[0];

        for (int i = 1; i < number.length; i++) {
            if (number[i] > max){
                max = number[i];
            }else if( number[i]< min){
               min= number[i];
            }
        }
        System.out.println("Maximum Number- "+max);
        System.out.println("Minimum Number- "+min);

    }
}
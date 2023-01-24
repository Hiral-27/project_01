public class Task_03_D2Arrays_Sum {
    public static void main(String[] args) {
        /*
        Task 3-
         Create a 2D array of integer values. Print the sum of all numbers.
         */

        int[][] number={{10,20,30},
                        {40,50,60}};

        int sum1= 0;
        for (int i = 0; i < number.length; i++) {
            for(int j=0; j< number[i].length; j++){
             sum1+= number[i][j];
            }
        }
        System.out.println(sum1);
    }
}

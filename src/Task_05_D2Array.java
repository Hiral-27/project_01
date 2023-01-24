public class Task_05_D2Array {
    public static void main(String[] args) {
        /*
        Task 5-
       Create a 2D array of integers. Develop a program which will calculate the sum of
       even and odd numbers for that array.
         */
        int[][] numbers= {{1,2,3,4},
                          {5,6,7,8}
        };
        int sumEven=0;
        int sumOdd=0;


        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2!=0){
                    sumOdd+= numbers[i][j];
                }else {
                    sumEven+= numbers[i][j];
                }
            }
        }
        System.out.println("Sum of Odd Numbers: "+sumOdd);
        System.out.println("Sun of Even Numbers: "+sumEven);

    }
}

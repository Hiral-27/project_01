import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_02_CountryAndCapital {
    public static void main(String[] args) {
        /*
        Task 2-
        Using Scanner create an array of countries. When an array is created, retrieve all values
        from it and while retrieving those values print capital for each country. (use 2 different loops).
         */
        Scanner input = new Scanner(System.in);
        String[] countries = new String[5];
        String[] capitals = new String[5];

        for (int i = 0; i < countries.length; i++) {   // Input
            System.out.print("Enter Name of the Country: ");
            countries[i] = input.nextLine();
            System.out.print("Enter it's Capital: ");
            capitals[i] = input.nextLine();
        }

        for (int j = 0; j < countries.length; j++) {  // output
            System.out.println(capitals[j] + " is the capital of " + countries[j]);
        }


//------------ WHILE LOOP ----  Question 2      ------------------------------------------------------------------------
        System.out.println("**** WHILE LOOP ****");
        int i = 0;
        int j=0;
        while (i < countries.length) {
            System.out.print("Enter Name of the Country: ");
            countries[i] = input.nextLine();
            System.out.print("Enter it's Capital: ");
            capitals[i] = input.nextLine();
            i++;
        }
        while(j < capitals.length){
            System.out.println(capitals[j]+ " is the capital of " + countries[j]);
            j++;
        }







        /*
        int i=0;
        int j=i;
        for (String country: countries) {
            System.out.print("Enter Name of the Country: ");
            countries[i]= input.nextLine();
            System.out.print("Enter it's Capital: ");
            capitals[i]= input.nextLine();
            i++;
        }
        for (String capital: capitals) {
        }
       // System.out.println(capitals[i]+" is the capital of "+countries[i]);
        System.out.println(Arrays.toString(countries)+" "+Arrays.toString(capitals));
*/

    }

}
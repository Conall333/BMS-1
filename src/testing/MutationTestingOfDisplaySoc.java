package testing;

import com.company.GUI;
import org.junit.jupiter.api.Test;

public class MutationTestingOfDisplaySoc {

    @Test
    public void Dfg2_Test1() {
        double soc = 60.0;
        int dm = 1;

        System.out.println("\nTEST 1 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);


        //displaySocMutation1(soc,dm);
        //displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test2() {
        double soc = 3.45;
        int dm = 10;

        System.out.println("\nTEST 2 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        //displaySocMutation1(soc,dm);
        // displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);


        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test3() {
        double soc = 3.0;
        int dm = 9;

        System.out.println("\nTEST 3 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        //displaySocMutation1(soc,dm);
        // displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test4() {
        double soc = 3.0;
        int dm = 11;

        System.out.println("\nTEST 4 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        //displaySocMutation1(soc,dm);
         // displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test5() {
        double soc = 70;
        int dm = 7;

        System.out.println("\nTEST 5 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        // displaySocMutation1(soc,dm);
        //displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test6() {
        double soc = 100;
        int dm = 0;

        System.out.println("\nTEST 6 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        // displaySocMutation1(soc,dm);
        //displaySocMutation2(soc,dm);
        displaySocMutation3(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }




    public void displaySocMutation1(double soc,int dm) {
        // constant mutation changed from 100 to 800
        int displayedSoc = (int) Math.round((soc - 5)/95 *800);
        if (soc < 5 && dm == 10 || dm == 11) {
            System.out.println("The Battery charge remaining is" + soc + "%");
        }
        else if (soc < 5 && dm == 9) {
            System.out.println("The Battery charge remaining is 0 %");
        }
        else {
            System.out.println("The Battery charge remaining is: " + displayedSoc  + "%");
        }
    }


    public void displaySocMutation2(double soc,int dm) {
        int displayedSoc = (int) Math.round((soc - 5)/95 *100);
        //operator mutation changed from < to >
        if (soc > 5 && dm == 10 || dm == 11) {
            System.out.println("The Battery charge remaining is" + soc + "%");
        }
        else if (soc < 5 && dm == 9) {
            System.out.println("The Battery charge remaining is 0 %");
        }
        else {
            System.out.println("The Battery charge remaining is: " + displayedSoc  + "%");
        }
    }


    public void displaySocMutation3(double soc,int dm) {
        int displayedSoc = (int) Math.round((soc - 5)/95 *100);
        // operator mutation changed == to <
        if (soc < 5 && dm == 10 || dm < 11) {
            System.out.println("The Battery charge remaining is" + soc + "%");
        }
        else if (soc < 5 && dm == 9) {
            System.out.println("The Battery charge remaining is 0 %");
        }
        else {
            System.out.println("The Battery charge remaining is: " + displayedSoc  + "%");
        }
    }



}

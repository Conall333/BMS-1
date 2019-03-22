package testing;

import com.company.GUI;
import org.junit.jupiter.api.Test;

public class DFG2_displaySoc_All_Use_Testing {


    @Test
    public void Dfg2_Test1() {
        double soc = 60.0;
        int dm = 1;

        System.out.println("\nTEST 1 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test2() {
        double soc = 3.45;
        int dm = 10;

        System.out.println("\nTEST 2 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test3() {
        double soc = 3.0;
        int dm = 9;

        System.out.println("\nTEST 3 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test4() {
        double soc = 3.0;
        int dm = 11;

        System.out.println("\nTEST 4 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test5() {
        double soc = 70;
        int dm = 7;

        System.out.println("\nTEST 5 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }

    @Test
    public void Dfg2_Test6() {
        double soc = 100;
        int dm = 0;

        System.out.println("\nTEST 6 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm);
        System.out.println(" State of Charge: " + soc);

        GUI gui = new GUI();
        gui.displaySoc(soc,dm);

        System.out.println("\n******* End of Test Case ******");
    }
}

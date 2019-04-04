package testing;

import com.company.BMSController;
import org.junit.jupiter.api.Test;

public class PairWiseTesting {

    @Test
    public void testBMS1() {
        double batteryPercentage = 90;
        boolean mode = true;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTEST 1 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS2() {
        double batteryPercentage = 40;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = false;


        System.out.println("\nTEST 2 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS3() {
        double batteryPercentage = 15;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = false;


        System.out.println("\nTEST 3 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS4() {
        double batteryPercentage = 10;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTEST 4 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS5() {
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 5 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS6() {
        double batteryPercentage = 44;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 6 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS7() {
        double batteryPercentage = 30;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTEST 7 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS8() {
        double batteryPercentage = 10;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 8 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS9() {
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 9 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }


}

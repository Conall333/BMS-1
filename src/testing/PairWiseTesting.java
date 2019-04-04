package testing;

import com.company.BMSController;
import org.junit.jupiter.api.Test;

public class PairWiseTesting {

    @Test
    public void testBMS1() {
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


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
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


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
        double batteryPercentage = 90;
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
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = true;
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
        boolean mode = true;
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
        double batteryPercentage = 90;
        boolean mode = true;
        boolean route = true;
        boolean reservePower = true;


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
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


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
        double batteryPercentage = 90;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


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
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = false;


        System.out.println("\nTEST 9 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS10() {
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTEST 10 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS11() {
        double batteryPercentage = 44;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 11 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS12() {
        double batteryPercentage = 44;
        boolean mode = true;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTEST 12 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS13() {
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 13 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS14() {
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTEST 14 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS15() {
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = false;


        System.out.println("\nTEST 15 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS16() {
        double batteryPercentage = 44;
        boolean mode = false;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTEST 16 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS17() {
        double batteryPercentage = 18;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTEST 17 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void testBMS18() {
        double batteryPercentage = 18;
        boolean mode = true;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTEST 18 \n\n Input Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();

        System.out.println("\n******* End of Test Case ******");

    }


}

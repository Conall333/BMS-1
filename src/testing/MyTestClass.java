package testing;

import com.company.BMSController;
import com.company.Database;
import com.company.GPS;
import com.company.GUI;
import org.junit.jupiter.api.Test;
import java.lang.Math.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTestClass {


    @Test
    public void testBMS1() {
        double batteryPercentage = 100;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }
    @Test
    public void testBMS2() {
        double batteryPercentage = 100;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }
    @Test
    public void testBMS3() {
        double batteryPercentage = 49;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");


        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }
    @Test
    public void testBMS4() {
        double batteryPercentage = 49;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS5() {
        double batteryPercentage = 25;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS6() {
        double batteryPercentage = 24.99;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS7() {
        double batteryPercentage = 15;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS8() {
        double batteryPercentage = 14.99;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS9() {
        double batteryPercentage = 50.01;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS10() {
        double batteryPercentage = 25.01;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS11() {
        double batteryPercentage = 15.01;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }



    @Test
    public void testBMS12() {
        double batteryPercentage = 10.01;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS13() {
        double batteryPercentage = 9;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS14() {
        double batteryPercentage = 6;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS15() {
        double batteryPercentage = 4;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS16() {
        double batteryPercentage = 4;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS17() {
        double batteryPercentage = 7;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS18() {
        double batteryPercentage = 7;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS19() {
        double batteryPercentage = 5;
        boolean mode = true;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }


    @Test
    public void testBMS20() {
        double batteryPercentage = 0;
        boolean mode = true;
        boolean route = true;
        boolean reservePower = true;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS21() {
        double batteryPercentage = 4.99;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS22() {
        double batteryPercentage = 5.01;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS23() {
        double batteryPercentage = 9.99;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = true;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }

    @Test
    public void testBMS24() {
        double batteryPercentage = 10;
        boolean mode = false;
        boolean route = false;
        boolean reservePower = false;


        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + batteryPercentage);
        System.out.println(" Car mode: " + mode);
        System.out.println(" Route asked for?: " + route);
        System.out.println(" Reserve Power Enabled: " + reservePower + "\n\nOutputs >>>> \n");

        BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower).run();


    }











}
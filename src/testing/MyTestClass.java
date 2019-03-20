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
        double batteryPercentage = 39;
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
}
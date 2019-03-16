package testing;

import com.company.BMSController;
import com.company.Database;
import com.company.GPS;
import com.company.GUI;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTestClass {

   // BMSController bms = new BMSController();

        @Test
        public void testBMS() {
            double batteryPercentage = 100;
            boolean mode = false;
            boolean route = true;
            boolean reservePower = false;

            
            System.out.println("\nTest Parameters --> ");
            System.out.println("\n BatteryPercentage: " + batteryPercentage);
            System.out.println("\n Car mode: " + mode);
            System.out.println("\n Route asked for?: " + route);
            System.out.println("\n Reserve Power Enabled: " + reservePower);


            BMSController bms = new BMSController(batteryPercentage, mode, route, reservePower);
            bms.run();




        }

    }


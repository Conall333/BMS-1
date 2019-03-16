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
            double soc = 100;
            boolean mode = false;
            boolean route = true;
            boolean reserverPower = false;

            for (int i= 0; i < 20;i++) {

                System.out.println("\nTest: " + i);

                BMSController bms = new BMSController(soc, mode, route, reserverPower);
                bms.run();

                soc -= 5;

            }

        }

    }


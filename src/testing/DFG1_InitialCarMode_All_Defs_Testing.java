package testing;
import org.junit.jupiter.api.Test;
import com.company.BMSController;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DFG1_InitialCarMode_All_Defs_Testing {
    BMSController bms = new BMSController(100, false, false, false);

    // only require the first 2 tests to cover all defs
    @Test
    public void Dfg1_Test1() {

        boolean mode = true;
        double soc = 49;
        boolean noCmdLineInput = false;
        String userInput = "y";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg1_Test2() {

        boolean mode = true;
        double soc = 49;
        boolean noCmdLineInput = false;
        String userInput = "n";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(!returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg1_Test3() {

        boolean mode = true;
        double soc = 51;
        boolean noCmdLineInput = false;
        String userInput = "n";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg1_Test4() {

        boolean mode = true;
        double soc = 30;
        boolean noCmdLineInput = true;
        String userInput = "y";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg1_Test5() {

        boolean mode = false;
        double soc = 30;
        boolean noCmdLineInput = false;
        String userInput = "n";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(!returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg1_Test6() {

        boolean mode = true;
        double soc = 10;
        boolean noCmdLineInput = false;
        String userInput = "y";

        System.out.println("\nTest Parameters --> ");
        System.out.println(" BatteryPercentage: " + soc);
        System.out.println(" Car mode: " + mode);
        System.out.println(" No inputs from command line: " + noCmdLineInput);
        System.out.println(" User input(if required): " + userInput + "\n");


        bms.setNoCmdLineInput(noCmdLineInput);
        bms.setMode(mode);

        // presets the user input when required
        ByteArrayInputStream in = new ByteArrayInputStream(userInput.getBytes());
        System.setIn(in);

        boolean returnedMode = bms.initialCarMode(soc);
        System.out.println("The returned variable mode is: " + returnedMode);
        assertTrue(returnedMode);
        System.out.println("\n******* End of Test Case ******");

    }









}

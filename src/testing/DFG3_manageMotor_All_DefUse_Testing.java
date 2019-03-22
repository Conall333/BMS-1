package testing;

import CarModel.Motor;
import com.company.PowerManagement;
import org.junit.jupiter.api.Test;

public class DFG3_manageMotor_All_DefUse_Testing {

    @Test
    public void Dfg3_Test1() {
        int dm =1;

        System.out.println("\nTEST 1 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");

    }

    @Test
    public void Dfg3_Test2() {
        int dm =2;

        System.out.println("\nTEST 2 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void  Dfg3_Test3() {
        int dm =3;

        System.out.println("\nTEST 3 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void Dfg3_Test4() {
        int dm =4;

        System.out.println("\nTEST 4 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void  Dfg3_Test5() {
        int dm =5;

        System.out.println("\nTEST 5 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void  Dfg3_Test6() {
        int dm =6;

        System.out.println("\nTEST 6 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void  Dfg3_Test7() {
        int dm =7;

        System.out.println("\nTEST 7 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }

    @Test
    public void  Dfg3_Test8() {
        int dm =8;

        System.out.println("\nTEST 8 \n\n Input Parameters --> ");
        System.out.println(" Driver Mode: " + dm+"\n");

        Motor motor = new Motor(0.0, 200, 0);
        PowerManagement pm = new PowerManagement();
        pm.manageMotor(dm,motor);

        System.out.println("\n******* End of Test Case ******");


    }
}

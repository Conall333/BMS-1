package com.company;

public class PowerManagement {

    public void passDriverMode(Integer dm){


        System.out.println("\nPower Management in this mode >>> \n");
        hvac(dm);
        communications(dm);
        motor(dm);
        gui_display(dm);
        audio_system(dm);

    }


    public void hvac (Integer dm){

        switch (dm) {
            case 1:
                System.out.println("Fan Speed is 5");
                break;
            case 2:
                System.out.println("Fan Speed is 4");
                break;
            case 3:
                System.out.println("Fan Speed is 3");
                break;
            case 4:
                System.out.println("Fan Speed is 3");
                break;
            case 5:
                System.out.println("Fan Speed is  2");
                System.out.println("Max hvac temp is 18 C");
                break;
            case 6:
                System.out.println("Fan Speed is  2");
                System.out.println("Max hvac temp is 18 C");
                break;
            case 7:
                System.out.println("Fan Speed is 1");
                break;
            case 8:
                System.out.println("Fan Speed is 1");
                break;

            default:


        }


    }


        public void communications (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 2:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 3:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 4:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 5:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 6:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 7:
                System.out.println("Cellular is Disabled");
                System.out.println("Bluetooth is Enabled");
                break;
            case 8:
                System.out.println("bluetooth is now Disabled");
                break;


            default:


        }


    }


        public void motor (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("Top Speed is 140 km/h");
                break;
            case 2:
                System.out.println("Top Speed is 140 km/h");
                break;
            case 3:
                System.out.println("Top Speed is 120 km/h");
                break;
            case 4:
                System.out.println("Top Speed is 120 km/h");
                break;
            case 5:
                System.out.println("Top Speed is 120 km/h");
                break;
            case 6:
                System.out.println("Top Speed is 100 km/h");
                break;
            case 7:
                System.out.println("Top Speed is 80 km/h");
                break;
            case 8:
                System.out.println("Top Speed is 80 km/h");
                break;


            default:


        }

    }


        public void gui_display (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("GUI adaptive brightness disabled");
                break;
            case 2:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 3:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 4:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 5:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 6:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 7:
                System.out.println("Limited gui adaptive brightness enabled");
                break;
            case 8:
                System.out.println("Limited gui adaptive brightness enabled");
                break;



            default:


        }

    }


        public void audio_system (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("Max volume is 90%");
                break;
            case 2:
                System.out.println("Max volume is 80%");
                break;
            case 3:
                System.out.println("Max volume is 80%");
                break;
            case 4:
                System.out.println("Max volume is 80%");
                break;
            case 5:
                System.out.println("Max volume is 60%");
                break;
            case 6:
                System.out.println("Max volume is 60%");
                break;
            case 7:
                System.out.println("Max volume is 50%");
                break;
            case 8:
                System.out.println("Max volume is 50%");
                break;



            default:


        }

    }




}


package com.company;

public class PowerManagement {

    public void passDriverMode(Integer dm){


        System.out.println("\n");
        hvac(dm);
        communications(dm);
        motor(dm);
        gui_display(dm);
        audio_system(dm);

    }


    public void hvac (Integer dm){

        switch (dm) {
            case 1:
                System.out.println("Fan Speed is now 5");
                break;
            case 2:
                System.out.println("Fan Speed is now 4");
                break;
            case 3:
                System.out.println("Fan Speed is now 3");
                break;
            case 5:
                System.out.println("Fan Speed is now 2");
                System.out.println("Max temp  is now 18");
                break;
            case 7:
                System.out.println("Fan Speed is now 1");
                break;

            default:


        }


    }


        public void communications (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("Cellular is now Disabled");
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
                System.out.println("Top Speed is now 100 km/h");
                break;
            case 3:
                System.out.println("Top Speed is now 120 km/h");
                break;
            case 6:
                System.out.println("Top Speed is now 100 km/h");
                break;
            case 7:
                System.out.println("Top Speed is now 80 km/h");
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


            default:


        }

    }


        public void audio_system (Integer dm){

        switch (dm) {

            case 1:
                System.out.println("Max volume now 90%");
                break;

            case 2:
                System.out.println("Max volume now 80%");
                break;
            case 5:
                System.out.println("Max volume now 60%");
                break;
            case 7:
                System.out.println("Max volume now 50%");
                break;


            default:


        }

    }




}


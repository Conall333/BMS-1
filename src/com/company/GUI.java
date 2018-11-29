package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {


    int dm;


    public void GUI(int dm, Float soc, String bInfo, ArrayList<Float> nav) {

        // AutoswitchMode(dm,soc);
        alertInfo(dm);
        displaySoc(soc);
        batteryDetails(bInfo);
       // displayRoute(nav);



    }

    private void alertInfo(int dm) {

        switch(dm) {

            case 1:
                break;

            case 3:
                System.out.println("Searching for charging station");
                break;

            case 7:
                System.out.println("Battery remaining 5% until power down");
                System.out.println("Bluetooth will soon be disabled");
                break;

            case 8:
                System.out.println("Bluetooth Disabled");
                System.out.println("Battery Critically low");
                System.out.println("Park the car, battery critically low");
                break;

            case 10:
                System.out.println("BMS overidden : Motor re-engaged ");

                break;

            case 9:
                System.out.println("Battery Exhausted");
                System.out.println("Warning :: Override for Reserve battery :: Safety compromised");
                break;

        }
    }

    private boolean AutoswitchMode(int dm,Float soc) {

        Boolean MtA = false;


        if (dm == 0 && soc == 50 || soc == 25 || soc == 10) {

            System.out.println("Would you like to enter Automatic mode? y/n: ");

            Scanner sc = new Scanner((System.in));
            String x = sc.nextLine();


            if (x .equalsIgnoreCase("y")) {


                System.out.println("Automatic mode enabled");


                MtA = true;
                return  MtA;

            } else {


                return  MtA;

            }

        }
        return  MtA;
    }

    private void displaySoc(Float soc) {

        int x = Math.round((soc - 5)/95 *100);


        if (soc < 5) {

            System.out.println("The Battery charge remaining is" + soc + "%");

        }
        else {


            System.out.println("The Battery charge remaining is: " + x + "%");
        }

    }

    private void batteryDetails(String  binfo) {


        System.out.println("Battery Power : 35V \n Current : 3amp ");

    }

    private void displayRoute(ArrayList<Float> nav) {


        System.out.println("Please follow provided route to the nearest charging station");

    }

}

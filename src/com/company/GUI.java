package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {


    int dm;


    public void GUI(int dm, Float soc, String bInfo, ArrayList<Float> nav) {

        // AutoswitchMode(dm,soc);

        System.out.println("\nGUI Information >>>\n");
        displaySoc(soc,dm);
        batteryDetails(bInfo);

        alertInfo(dm);

       // displayRoute(nav);



    }

    private void alertInfo(int dm) {

        switch(dm) {

            case 1:
                break;

            case 3:
               // System.out.println("Searching for charging station");
                break;

            case 7:
                System.out.println("Battery power low");
                System.out.println("Bluetooth will soon be disabled");
                break;

            case 8:
                System.out.println("Battery Critically low");
                System.out.println("Park the car, battery critically low");
                break;

            case 10:
                System.out.println("BMS overidden : Motor re-engaged ");

                break;

            case 9:
                System.out.println("Battery Exhausted");
                System.out.println("Warning :: Override for Reserve battery can be enabled");
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

    private void displaySoc(Float soc,int dm) {

        int displayedSoc = Math.round((soc - 5)/95 *100);


        if (soc < 5 && dm == 10 || dm == 11) {

            System.out.println("The Battery charge remaining is" + soc + "%");

        }

        else if (soc < 5 && dm == 9) {

            System.out.println("The Battery charge remaining is 0 %");

        }
        else {


            System.out.println("The Battery charge remaining is: " + displayedSoc + "%");
        }

    }

    private void batteryDetails(String  binfo) {


        System.out.println("Battery Power : 35V \nCurrent : 3amp ");
        System.out.println("Battery Health is ok");

    }

    private void displayRoute(ArrayList<Float> nav) {


        System.out.println("Please follow provided route to the nearest charging station");

    }

    // user manual asks for a route
    public boolean SearchForRoute(boolean gpsA){

        boolean searchForRoute;

        if (gpsA) {

            searchForRoute = true;

        } else {
            searchForRoute = false;

        }

        return  searchForRoute;
    }

}

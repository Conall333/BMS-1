package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GUI {

    boolean noCmdLineInput = true;



    public void GUI(int dm, Double soc, String bInfo, ArrayList<Float> nav) {


        System.out.println("\nGUI Information >>>\n");
        displaySoc(soc ,dm);
        displayBinfo(bInfo);
        alertInfo(dm);
        displayRoute(nav);

    }

    public GUI(){}

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

    public void displaySoc(double soc,int dm) {

        int displayedSoc = (int) Math.round((soc - 5)/95 *100);


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

    private void  displayBinfo(String  binfo) {


        System.out.println("Battery Power : 35V \nCurrent : 3amp ");
        System.out.println("Battery Health is ok");

    }

    private void displayRoute(ArrayList<Float> nav) {

        try {

            Float x = nav.get(0);

            System.out.println("Please follow provided route to the nearest charging station");

        } catch (Exception e){}

    }

    // user manual asks for a route
    public boolean searchForRoute(boolean route){

        boolean searchForRoute;

        if (noCmdLineInput) {
            return route;

        }

        System.out.println("Has the user Asked for a route? y/n");
        Scanner sc = new Scanner((System.in));
        String x = sc.nextLine();


        if (x .equalsIgnoreCase("y")) {

            searchForRoute = true;

        } else {
            searchForRoute = false;

        }

        return  searchForRoute;
    }

}

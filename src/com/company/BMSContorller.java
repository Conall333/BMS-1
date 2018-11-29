package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class BMSContorller{

    // Input Variables...
    // SOH - float
    // V - float
    // I - float
    // C - float
    // T - float
    // MtA - bool
    // reservePwr - bool
    // attemptSearch
    // dm

    // Functions
    // SOC = output to DM
    // DM - Switch 0 - 11 modes (0 = manual.. see automata)
    // GUI Output - manual/auto = input to DM
    // reservePower

    float soc = 10;
    float Soh;
    float V;
    float I;
    float C;
    float T;
    boolean MtA;
    boolean reservePwr;
    boolean attemptSearch;
    int dm;
    ArrayList<Float> loc;


    public static void main(String[] args) {

        PowerManagement powerManagement = new PowerManagement();
        BMSContorller bms = new BMSContorller();
        GUI gui = new GUI();

        Float myFloat;
        myFloat = -1.1f;

        Float stateOfCharge = bms.Soc(myFloat,myFloat,myFloat,myFloat,myFloat);

        boolean MtA = bms.initialMtA(stateOfCharge);

        int dm = bms.driverMode(stateOfCharge,MtA,false,false);

        String bInfo =bms.bInfo();
        ArrayList<Float> nav = new ArrayList<Float>();
        nav.add(myFloat);



        gui.GUI(dm,stateOfCharge,bInfo,nav);


        powerManagement.passDriverMode(dm);


    }





    public float Soc(float V, float I, float C, float T, float Soh){

        System.out.println("Enter battery percentage: ");

        Scanner sc = new Scanner((System.in));
        Float x =  sc.nextFloat();


        return x;
    }


    public boolean initialMtA(Float soc) {

        boolean MtA = false;


        if (soc <= 5) {
            //


        }

        else if (soc <= 50){


            System.out.println("Is The car in Automatic mode? y/n: ");

            Scanner sc = new Scanner((System.in));
            String x = sc.nextLine();


            if (x .equalsIgnoreCase("y")) {


                System.out.println("Automatic mode enabled");


                MtA = true;
                return  MtA;

            } else {
                 MtA = false;
                return  MtA;

            }



        }
        return MtA;


    }

    public int driverMode(float soc, boolean MtA, boolean attemptSearch, boolean reservePwr){

            if (MtA) {    // Auto mode
                if (soc > 50) {
                    dm = 0;
                } else if (soc >= 40 && soc < 50) {
                    dm = 1;
                } else if (soc >= 25 && soc < 40) {
                    dm = 2;
                } else if (soc >= 20 && soc < 25) {
                    if (attemptSearch) {
                        dm = 4;
                    } else {
                        dm = 3;
                    }
                } else if (soc >= 15 && soc < 20) {
                    dm = 5;
                } else if (soc >= 10 && soc < 15) {
                    dm = 6;
                } else if (soc >= 7 && soc < 10) {
                    dm = 7;
                } else if (soc >= 5 && soc < 7) {
                    dm = 8;
                } else if (soc >= 0 && soc < 5 && reservePwr == false) {
                    dm = 9;
                } else if (soc >= 1 && soc < 5 && reservePwr == true) {
                    dm = 10;
                } else if (soc >= 0 && soc < 1 && reservePwr == true) {
                    dm = 11;
                }

                return dm;
            }

            else {
                dm = 0;

                return dm;
            }



    }

    public ArrayList<Float> nav(ArrayList<Float> loc, int dm){
        System.out.println("NAV: Nearest charging point located.");
        return loc;//Co-ordinates
    }

    public String bInfo() {
        if (this.V < 10 || this.I < 10 || this.C < 10 || this.T < 10){
            // System.out.println("Error Message: Battery requires maintainance.");
        }
        return "Voltage: " + this.V + ", Current: " + this.I + ", Capacity: " + this.C + ", Temperature: " + this.T + ".";
    }

}
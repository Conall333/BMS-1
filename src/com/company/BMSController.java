package com.company;


import CarModel.Battery;
import CarModel.Car;
import CarModel.CarSystems;
import CarModel.Motor;

import java.util.ArrayList;
import java.util.Scanner;

public class BMSController {

    boolean noCmdLineInput = true;

    public double soc;
    float SoH;
    float V;
    float I;
    float C;
    float T;
    public boolean mode;
    public boolean reservePwr;
    public boolean route;
    int dm;
    ArrayList<Float> loc;


    public BMSController (double soc, boolean mode, boolean route, boolean reservePwr) {
        this.soc = soc;
        this.mode = mode;
        this.reservePwr = reservePwr;
        this.route = route;
    }


    public static void main(String[] args) {

        BMSController bms = new BMSController(40,true,false,false);
        bms.run();

    }


    public BMSController run(){

        PowerManagement powerManagement;
        BMSController bms = new BMSController(soc,mode,route,reservePwr);
        if (!bms.checkInputs()) {

            GUI gui = new GUI();
            GPS gps = new GPS();
            Database db = new Database();

            Float dummyFloat;
            dummyFloat = 1.0f;

            // gets Soc logs from database
            Object logs = db.passSoc_Logs();

            // calculates state of health using logs
            SoH = bms.SoH(logs);

            //calculates state of charge, for demoing purpose we take the battery % as a user input
            double stateOfCharge = bms.Soc(dummyFloat, dummyFloat, dummyFloat, dummyFloat, SoH);

            // passes the state of charge to the database,
            db.HandleSoc_Logs(stateOfCharge);

            // for demoing purposes we need to know what the cars current state is
            boolean MtA = bms.initialMtA(stateOfCharge);
            boolean reservePwr = bms.initialReservePwr(stateOfCharge);

            // calculates the driver mode
            int dm = bms.driverMode(stateOfCharge, MtA, false, reservePwr);

            //  gets information about the battery
            String bInfo = bms.bInfo();

            // users asks for a route to charging station
            boolean gpsA = gui.searchForRoute(bms.route);


            // gps calculates location
            ArrayList<Float> loc;
            loc = gps.location();

            // location used by the nav to create a route to nearest charging station
            ArrayList<Float> nav = bms.nav(loc, dm, gpsA);

            // car model classes
            CarSystems carSys = new CarSystems(false, true, true, true, false, true, 20, 50, 24, 5);
            Motor motor = new Motor(0.0, 200, 0);
            // Battery battery = new Battery(120.0, 30.0, 1000.0, 14.0);


            // gui uses driver mode to display alerts, gui use state of charge to display state of charge
            // uses bInfo to display info about the battery, uses nav to display the route
            gui.GUI(dm, stateOfCharge, bInfo, nav);


            // power management is only active when the car is in automatic mode
            if (MtA) {
                powerManagement = new PowerManagement(dm,carSys,motor);
            }


            // Ecall system sends an Ecall when the battery is < 1%
            ECall eCall = new ECall(loc, dm);
            eCall.send_Ecall(dm);

            return bms;

        }

    return bms;

    }


    public boolean checkInputs() {
        if (soc > 100 || soc < 0) {
            System.out.println("invalid soc");
            return true;

        }
        else {
            return false;
        }

    }


    public double Soc(float V, float I, float C, float T, float SoH){

        if (noCmdLineInput){
            return soc;
        }

        System.out.println("Enter battery percentage: ");
        Scanner sc = new Scanner((System.in));
        Float x =  sc.nextFloat();

        return x;
    }



    public float SoH(Object SoH_Logs){

        Float dummyValue  = 1.1f;
        return dummyValue;
    }



    public int driverMode(double soc, boolean MtA, boolean attemptSearch, boolean reservePwr) {

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
        } else {
            dm = 0;

            if (soc >= 7 && soc < 10) {
                dm = 7;
            } else if (soc >= 5 && soc < 7) {
                dm = 8;
            } else if (soc >= 0 && soc < 5 && reservePwr == false) {
                dm = 9;
            } else if (soc >= 1 && soc < 5 && reservePwr == true) {
                dm = 10;
            } else if (soc < 1 && reservePwr == true) {

                dm = 11;
            }

            return dm;
        }
    }



    public ArrayList<Float> nav(ArrayList<Float> loc, int dm, boolean GpsA){


       // System.out.println("NAV: Nearest charging point located.");
        ArrayList<Float> nav = new ArrayList<Float>();

        Float myFloat;
        myFloat = 1.0f;

        if (GpsA) {
            nav.add(myFloat);
        }
        return nav;//Co-ordinates
    }

    public String bInfo() {
        if (this.V < 10 || this.I < 10 || this.C < 10 || this.T < 10){
            // System.out.println("Error Message: Battery requires maintainance.");
        }
        return "Voltage: " + this.V + ", Current: " + this.I + ", Capacity: " + this.C + ", Temperature: " + this.T + ".";
    }






    public boolean initialMtA(Double soc) {

        boolean MtA = false;

        if (soc <= 5) {

        }

        if (soc <= 50){

            if (noCmdLineInput){

                if(mode) {
                    System.out.println("Automatic mode is enabled");
                }

                return mode;
            }


            System.out.println("Is The car in Automatic mode? y/n: ");

            Scanner sc = new Scanner((System.in));
            String x = sc.nextLine();


            if (x .equalsIgnoreCase("y")) {


                System.out.println("Automatic mode is enabled");


                MtA = true;
                return  MtA;

            } else {
                MtA = false;
                return  MtA;

            }



        }
        return MtA;


    }


    public boolean initialReservePwr(Double soc) {

        if (soc <= 5) {

            reservePwr = false;

            if (noCmdLineInput){

                if(reservePwr) {
                    System.out.println("Reserve power enabled");
                }

                return reservePwr;
            }

            System.out.println("Is reserve power enabled? y/n: ");

            Scanner sc = new Scanner((System.in));
            String y = sc.nextLine();


            if (y.equalsIgnoreCase("y")) {

                System.out.println("Reserve power enabled");

                reservePwr = true;
                return reservePwr;

            }
        }
        return reservePwr;


    }

}
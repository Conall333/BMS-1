package com.company;

import CarModel.CarSystems;
import CarModel.Motor;

public class PowerManagement {


   PowerManagement(Integer dm, CarSystems carSys, Motor motor){

        System.out.println("\nPower Management in this mode >>> \n");
        hvac(dm, carSys);
        communications(dm, carSys);
        manageMotor(dm, motor);
        gui_display(dm, carSys);
        audio_system(dm, carSys);



    }


    public void hvac (Integer dm, CarSystems carSys){
        if (dm < 9 && dm > 0) {

            switch (dm) {
                case 1:
                    carSys.setFanSpeed(5);
                    break;
                case 2:
                    carSys.setFanSpeed(4);
                    break;
                case 3:
                    carSys.setFanSpeed(3);
                    break;
                case 4:
                    carSys.setFanSpeed(3);
                    break;
                case 5:
                    carSys.setFanSpeed(2);
                    carSys.setMaxTemp(18);
                    break;
                case 6:
                    carSys.setFanSpeed(2);
                    carSys.setMaxTemp(18);
                    break;
                case 7:
                    carSys.setFanSpeed(1);
                    break;
                case 8:
                    carSys.setFanSpeed(1);
                    break;

                default:


            }
            System.out.println("Max Fan Speed is " + carSys.getFanSpeed());
            System.out.println("Max hvac temp is " + carSys.getMaxTemp());
        }
    }


        public void communications (Integer dm, CarSystems carSys){

             if (dm < 9 && dm > 0) {
                switch (dm) {

                case 1:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 2:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 3:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 4:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 5:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 6:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 7:
                    carSys.setCellular(false);
                    carSys.setBluetooth(true);
                    break;
                case 8:
                    carSys.setCellular(false);
                    carSys.setBluetooth(false);
                    break;

                default:


            }

            if (!carSys.getCellular()) {
                System.out.println("Cellular is Disabled");
            }
            if (carSys.getCellular()) {
                System.out.println("Cellular is Enabled");
            }

            if (!carSys.getBluetooth()) {
                System.out.println("Bluetooth is Disabled");
            }
            if (carSys.getBluetooth()) {
                System.out.println("Bluetooth is Enabled");
            }
        }
    }


        public void manageMotor(Integer dm, Motor motor) {
            if (dm < 9 && dm > 0) {
                if (dm == 1) {
                    motor.setTopSpeed(140);
                }
                if (dm == 2) {
                    motor.setTopSpeed(140);
                } else if (dm == 3) {
                    motor.setTopSpeed(120);
                } else if (dm == 4) {
                    motor.setTopSpeed(120);
                } else if (dm == 5) {
                    motor.setTopSpeed(120);
                } else if (dm == 6) {
                    motor.setTopSpeed(100);
                } else if (dm == 7) {
                    motor.setTopSpeed(80);
                } else if (dm == 8) {
                    motor.setTopSpeed(80);
                }

                System.out.println("Top Speed is " + motor.getTopSpeed() + " km/h");
            }
        }




        public void gui_display (Integer dm, CarSystems carSys) {
            if (dm < 9 && dm > 0) {
                switch (dm) {

                    case 1:
                        carSys.setDisplayBrightness(false);
                        break;
                    case 2:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 3:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 4:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 5:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 6:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 7:
                        carSys.setDisplayBrightness(true);
                        break;
                    case 8:
                        carSys.setDisplayBrightness(true);
                        break;

                    default:

                }


                if (!carSys.getDisplayBrightness()) {
                    System.out.println("GUI adaptive brightness disabled");
                }
                if (carSys.getDisplayBrightness()) {
                    System.out.println("Limited gui adaptive brightness enabled");

                }
            }
        }


        public void audio_system (Integer dm, CarSystems carSys){
            if (dm < 9 && dm > 0) {
                switch (dm) {

                    case 1:
                        carSys.setMaxVolume(90);
                        break;
                    case 2:
                        carSys.setMaxVolume(80);
                        break;
                    case 3:
                        carSys.setMaxVolume(80);
                        break;
                    case 4:
                        carSys.setMaxVolume(80);
                        break;
                    case 5:
                        carSys.setMaxVolume(60);
                        break;
                    case 6:
                        carSys.setMaxVolume(60);
                        break;
                    case 7:
                        carSys.setMaxVolume(50);
                        break;
                    case 8:
                        carSys.setMaxVolume(50);
                        break;
                    default:

                }
                System.out.println("Max volume is " + carSys.getMaxVolume() + "%");
            }
    }




}


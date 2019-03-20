package CarModel;

public class Car {



    public static void main(String[] args) {
        Car myCar = new Car();
        Car.CarSystems carSystems = myCar.new CarSystems(false,true,true,
                true,100,true,20,50,24,0);
        Car.Motor motor = myCar.new Motor(0.0,200,0);

        Car.Battery battery = myCar.new Battery(120.0,30.0,1000.0, 14.0);



    }

    private class Battery {

        Double Voltage;
        Double Current;
        Double Capacity;
        Double temperture;

        public Battery(Double voltage, Double current, Double capacity, Double temperture) {
            Voltage = voltage;
            Current = current;
            Capacity = capacity;
            this.temperture = temperture;
        }


        public Double getVoltage() {
            return Voltage;
        }

        public void setVoltage(Double voltage) {
            Voltage = voltage;
        }

        public Double getCurrent() {
            return Current;
        }

        public void setCurrent(Double current) {
            Current = current;
        }

        public Double getCapacity() {
            return Capacity;
        }

        public void setCapacity(Double capacity) {
            Capacity = capacity;
        }

        public Double getTemperture() {
            return temperture;
        }

        public void setTemperture(Double temperture) {
            this.temperture = temperture;
        }
    }

    private class CarSystems {

        // true == on, false == off

        Boolean headlights;
        Boolean cellular;
        Boolean bluetooth;
        Boolean display;
        int displayBrightness;
        Boolean audioSystem;
        int currentVolume;
        int maxVolume;
        int maxTemp;
        int fanSpeed;


        public CarSystems(Boolean headlights, Boolean cellular, Boolean bluetooth, Boolean display,
                          int displayBrightness, Boolean audioSystem, int currentVolume,
                          int maxVolume, int maxTemp, int fanSpeed) {
            this.headlights = headlights;
            this.cellular = cellular;
            this.bluetooth = bluetooth;
            this.display = display;
            this.displayBrightness = displayBrightness;
            this.audioSystem = audioSystem;
            this.currentVolume = currentVolume;
            this.maxVolume = maxVolume;
            this.maxTemp = maxTemp;
            this.fanSpeed = fanSpeed;
        }

        public Boolean getHeadlights() {
            return headlights;
        }

        public void setHeadlights(Boolean headlights) {
            this.headlights = headlights;
        }

        public Boolean getCellular() {
            return cellular;
        }

        public void setCellular(Boolean cellular) {
            this.cellular = cellular;
        }

        public Boolean getBluetooth() {
            return bluetooth;
        }

        public void setBluetooth(Boolean bluetooth) {
            this.bluetooth = bluetooth;
        }

        public Boolean getDisplay() {
            return display;
        }

        public void setDisplay(Boolean display) {
            this.display = display;
        }

        public int getDisplayBrightness() {
            return displayBrightness;
        }

        public void setDisplayBrightness(int displayBrightness) {
            this.displayBrightness = displayBrightness;
        }

        public Boolean getAudioSystem() {
            return audioSystem;
        }

        public void setAudioSystem(Boolean audioSystem) {
            this.audioSystem = audioSystem;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentVolume(int currentVolume) {
            this.currentVolume = currentVolume;
        }

        public int getMaxVolume() {
            return maxVolume;
        }

        public void setMaxVolume(int maxVolume) {
            this.maxVolume = maxVolume;
        }

        public int getMaxTemp() {
            return maxTemp;
        }

        public void setMaxTemp(int maxTemp) {
            this.maxTemp = maxTemp;
        }

        public int getFanSpeed() {
            return fanSpeed;
        }

        public void setFanSpeed(int fanSpeed) {
            this.fanSpeed = fanSpeed;
        }
    }


    private class Motor {

        Double currentSpeed;
        int topSpeed;
        int gear;

        Motor(Double currentSpeed, int topSpeed,  int gear) {
            this.currentSpeed = currentSpeed;
            this.topSpeed = topSpeed;
            this.gear = gear;

        }

        public void accelerate(){
            this.currentSpeed += 1;
        }

        public void coast(){
            this.currentSpeed -= 1;
        }
        public void brake() {
            if (this.currentSpeed < 0) {
                this.currentSpeed += 5;
            }
            else {
                this.currentSpeed -= 5;
            }

        }
        public void gearUp() {
            this.gear += 1;
        }

        public void gearDown() {
            this.gear -= 1;
        }

        public Double getCurrentSpeed(){
            return this.currentSpeed;
        }

        public int getTopSpeed() {
            return topSpeed;
        }

        public int getGear() {
            return gear;
        }


        public void setCurrentSpeed(Double currentSpeed) {
            this.currentSpeed = currentSpeed;
        }

        public void setTopSpeed(int topSpeed) {
            this.topSpeed = topSpeed;
        }

        public void setGear(int gear) {
            this.gear = gear;
        }
    }



}

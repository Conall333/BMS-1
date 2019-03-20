package CarModel;


public class Motor {

    Double currentSpeed;
    int topSpeed;
    int gear;

    public Motor(Double currentSpeed, int topSpeed,  int gear) {
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
package CarModel;

public class Battery {

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

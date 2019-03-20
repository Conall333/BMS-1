package CarModel;

public class CarSystems {

    // true == on, false == off

    Boolean headlights;
    Boolean cellular;
    Boolean bluetooth;
    Boolean display;
    boolean displayBrightness;
    Boolean audioSystem;
    int currentVolume;
    int maxVolume;
    int maxTemp;
    int fanSpeed;


    public CarSystems(Boolean headlights, Boolean cellular, Boolean bluetooth, Boolean display,
                      boolean displayBrightness, Boolean audioSystem, int currentVolume,
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

    public boolean getDisplayBrightness() {
        return displayBrightness;
    }

    public void setDisplayBrightness(boolean displayBrightness) {
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

package technology;

public class Computer extends Abstract {
    private String operatingSystem;
    private int ramAmount;
    private double screenSize;

    public Computer(String operatingSystem, int ramAmount, double screenSize) {
        this.operatingSystem = operatingSystem;
        this.ramAmount = ramAmount;
        this.screenSize = screenSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRamAmount() {
        return ramAmount;
    }

    public void setRamAmount(int ramAmount) {
        this.ramAmount = ramAmount;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public void powerOn() {
        System.out.println("Powering on...");
    }

    public void powerOff() {
        System.out.println("Powering down...");
    }
}

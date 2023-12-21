package technology;

public class SmartPhone extends Computer {
    private String brand;

    public SmartPhone(String operatingSystem, int ramAmount, double screenSize, String brand) {
        super(operatingSystem, ramAmount, screenSize);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void callContact(String contactName) {
        System.out.println("Calling " + contactName);
    }
}

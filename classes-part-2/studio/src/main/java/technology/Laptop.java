package technology;

public class Laptop extends Computer {
    private Boolean isTouchScreen;


    public Laptop(String operatingSystem, int ramAmount, double screenSize, Boolean touchScreen) {
        super(operatingSystem, ramAmount, screenSize);
        this.isTouchScreen = touchScreen;
    }

    public Boolean getTouchScreen() {
        return isTouchScreen;
    }

    public void setTouchScreen(Boolean touchScreen) {
        this.isTouchScreen = touchScreen;
    }

    public void touchScreenInquiry() {
        if(isTouchScreen) {
            System.out.println("Touch screen is available on this unit");
        } else {
            System.out.println("This unit is not equipped with a touch screen");
        }
    }
}

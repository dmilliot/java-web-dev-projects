package technology;

public class Program {
    public static void main(String[] args) {
        Computer myPC = new Computer ("Windows 11", 32, 27);
        myPC.powerOn();
        myPC.powerOff();

        Laptop myLenovo = new Laptop ("Windows 11", 16, 17, true);
        myLenovo.powerOn();
        myLenovo.touchScreenInquiry();
        myLenovo.powerOff();

        SmartPhone myAndroid = new SmartPhone("Android", 4, 4, "Samsung");
        myAndroid.powerOn();
        myAndroid.callContact("Angie");
        myAndroid.powerOff();

        System.out.println("ID check ******" +
                "\nMyPC: " + myPC.getId() +
                "\nMyLenovo: " + myLenovo.getId() +
                "\nMyAndroid: " + myAndroid.getId());
    }
}

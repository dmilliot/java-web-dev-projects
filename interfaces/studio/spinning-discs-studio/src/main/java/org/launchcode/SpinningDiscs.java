package org.launchcode;

public abstract class SpinningDiscs {

    private static int nextId = 1;

    private final int id;
    private String name;
    private int spinSpeed;
    private int storageCapacity;


    public SpinningDiscs(String name, int spinSpeed, int storageCapacity) {
        this.id = nextId;
        this.name = name;
        this.spinSpeed = spinSpeed;
        this.storageCapacity = storageCapacity;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpinSpeed() {
        return spinSpeed;
    }

    public void setSpinSpeed(int spinSpeed) {
        this.spinSpeed = spinSpeed;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        String asterisks = "*******";
        return newline + asterisks + " " + name + " " + asterisks + newline
                + "ID: " + id + newline + "Spin speed: " + spinSpeed + " RPM" + newline
                + "Storage Capacity: " + storageCapacity + " GB" + newline;
    }

    void spinDisc() {
        String newline = System.lineSeparator();
        System.out.println(newline + name + " spins at " + spinSpeed + " RPM. BRRRT");
    }
}

package org.launchcode;

public class DVD extends SpinningDiscs implements OpticalDisc{
    public DVD(String name, int spinSpeed, int storageCapacity) {
        super(name, spinSpeed, storageCapacity);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void play() {
        System.out.println("Disc starting, Enjoy!");
    }

    @Override
    public void pause() {
        System.out.println("Stopping disc");
    }

    @Override
    public void rewind() {
        System.out.println("Rewinding");
    }

    @Override
    public void slowMo() {
        System.out.println("P  L  A  Y  I  N  G     I  N     S  L  O  W  M  O");
    }


// TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}

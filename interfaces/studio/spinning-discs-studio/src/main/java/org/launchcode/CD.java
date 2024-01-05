package org.launchcode;

public class CD extends SpinningDiscs implements OpticalDisc {

    private boolean isMusicCD;

    public CD(String name, int spinSpeed, int storageCapacity, boolean isMusicCD) {
        super(name, spinSpeed, storageCapacity);
        this.isMusicCD = isMusicCD;
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    @Override
    public String toString() {
        String newline = System.lineSeparator();
        return super.toString() +
                "Music disc? " + isMusicCD + newline;
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

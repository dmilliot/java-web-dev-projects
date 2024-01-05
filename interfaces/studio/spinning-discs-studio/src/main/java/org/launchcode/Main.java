package org.launchcode;

public class Main {
    public static void main(String[] args) {
        CD myCD = new CD("Car Tunes", 300, 1, true);
        System.out.println(myCD);

        myCD.play();
        myCD.slowMo();
        myCD.pause();
        myCD.rewind();

        DVD myDVD = new DVD("Star Wars", 450, 0);
        System.out.println(myDVD);
        myDVD.play();
        myDVD.slowMo();
        myDVD.pause();
        myDVD.rewind();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.
    }
}
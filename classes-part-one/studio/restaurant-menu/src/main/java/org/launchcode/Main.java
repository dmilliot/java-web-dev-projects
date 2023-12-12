package org.launchcode;

import java.awt.*;
import java.sql.Array;

public class Main {

    public static void main(String[] args) {
	// write your code here
       MenuItems Eggs = new MenuItems("From a chicken", 2.50, "Breakfast");
       MenuItems Bacon = new MenuItems("Delicious pork bacon", 2.00, "Breakfast");
       MenuItems OrangeJuice = new MenuItems("Citrus drink you drink with breakfast", 1.50, "Drinks");
       MenuItems Burger = new MenuItems ("Cheesy beef burger of yummness", 5.00, "notBreakfast");
       MenuItems Fries = new MenuItems ("Fried potatos", 1.00, "NotBreakfast");
       MenuItems Pepsi = new MenuItems ("Refreshing Pepsi", 1.00, "Drinks");

        Object[] items = {Eggs, Bacon, OrangeJuice, Burger, Fries, Pepsi};
    }
}

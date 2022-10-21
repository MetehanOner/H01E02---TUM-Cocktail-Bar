package de.tum.in.ase;

import java.util.Scanner;

public class Bar {

    public Bar(){}

    public static void printCatalog() {
        //TODO 1: Make sure that we are printing the right description for each cocktail
        System.out.println("Martini: a cocktail made with gin or vodka and dry vermouth, usually served with a green olive or a twist of lemon peel.");
        System.out.println("Mimosa: a mixed drink consisting of champagne and orange juice.");
    }

    public static void robotWaiter() {
        //TODO 2: Implement the Robot Waiter
        Scanner in = new Scanner(System.in);
        System.out.println("What would you like to order?");
        String order = in.nextLine();
        System.out.println("Thank you! You ordered: " + order +".");


    }

    public static void translatedMessage() {
        //TODO 3: Print out the former developer's message translated in to the correct letters
        String original = "\u0045\u0058\u005A\u0045\u004C\u004C\u0045\u004E\u0054";
        System.out.println(original);

    }

    public static void main(String[] args) {
        // You can use this space to run the methods and test your code
        printCatalog();
        robotWaiter();
        translatedMessage();
    }
}

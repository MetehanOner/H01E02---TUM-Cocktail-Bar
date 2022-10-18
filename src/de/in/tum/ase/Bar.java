package de.in.tum.ase;

public class Bar {

    public Bar(){}

    public static void printCatalog() {
        //TODO 1: Make sure that we are printing the right description for each cocktail
        System.out.println("Martini: a mixed drink consisting of champagne and orange juice.");
        System.out.println("Mimosa: a cocktail made with gin or vodka and dry vermouth, usually served with a green olive or a twist of lemon peel.");
    }

    public static void robotWaiter() {
        //TODO 2: Implement the Robot Waiter
    }

    public static void translatedMessage() {
        //TODO 3: Print out the former developer's message translated into the correct letters
    }

    public static void main(String[] args) {
        // You can use this space to run the methods and test your code
        printCatalog();
        robotWaiter();
        translatedMessage();
    }
}

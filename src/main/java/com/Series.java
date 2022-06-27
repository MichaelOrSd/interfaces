package com;

public interface Series {
    
    int Max = 10;
    String Error = "Error; cannot go above " + Max;

    int getNext();

    default void printStuff() {
        System.out.println("Live from NY. It's Saturday Night!");
        printMoreStuff();
    }

    default void printMoreStuff() {
        System.out.println("More stuff");
    }

}

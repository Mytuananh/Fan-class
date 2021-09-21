package com.codegym;

public class Main {

    private static final int MEDIUM = 2;
    private static final int FAST = 3;

    public static void main(String[] args) {

	Fan fan1 = new Fan();
    fan1.setSpeed(FAST);
    fan1.setRadius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    Fan fan2 = new Fan();
    fan2.setSpeed(MEDIUM);
    fan1.toString();


    }


}

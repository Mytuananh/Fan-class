package com.codegym;

public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private static boolean on = false;
    int speed  = SLOW;
    double radius = 5;
    String color = "blue";

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        Fan.on = on;
        this.radius = radius;
        this.color = color;
    }
    public int getSpeed() {
        return this.speed;
    }
    public double getRadius() {
        return this.radius;
    }
    public String getColor() {
        return this.color;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static boolean isOn() {
        return on;
    }

    public void setOn(boolean onoff) {
        on = onoff;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}


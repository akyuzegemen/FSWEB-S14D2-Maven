package org.example.model;

import org.example.model.enums.LampType;

public class Lamp {
    private LampType style;
    private boolean battery;
    private int globRating;

    public LampType getStyle() {
        return style;
    }

    public void setStyle(LampType style) {
        this.style = style;
    }

    public boolean isBattery() {
        return battery;
    }

    public void setBattery(boolean battery) {
        this.battery = battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    public void setGlobRating(int globRating) {
        this.globRating = globRating;
    }

    public Lamp(LampType style, boolean battery, int globRating) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public void turnOn()
    {
        System.out.println("Lamp is being turned on.");
    }



}

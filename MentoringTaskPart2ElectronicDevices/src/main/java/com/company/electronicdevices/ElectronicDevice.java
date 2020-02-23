package com.company.electronicdevices;

/**
 * Created by sonasargsyan on 2/17/20.
 */
public class ElectronicDevice implements Comparable<ElectronicDevice> {
    private boolean isPowerOn;
    private int power;

    public ElectronicDevice(){

    }

    public ElectronicDevice(int power) {
        this.power = power;
        this.setIsPowerOn(false);
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void switchPowerOn() {
        this.setIsPowerOn(true);
    }

    public void switchPowerOff() {
        this.setIsPowerOn(false);
    }

    @Override
    public int compareTo(ElectronicDevice device) {
        return this.getPower() - device.getPower();
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setIsPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
}

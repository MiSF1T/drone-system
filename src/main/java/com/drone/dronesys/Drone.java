package com.drone.dronesys;

public class Drone {

    private String serialNo;
    private double weightLimit;
    private int battery;
    private String status;
    //class for 3d co-ord setter nd getter fr a drone
    //...
    public Drone(String serialNo, double weightLimit, int battery, String status) {
        super();
        this.serialNo = serialNo;
        this.weightLimit = weightLimit;
        this.battery = battery;
        this.status = status;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public String getStatus() {
        return status;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
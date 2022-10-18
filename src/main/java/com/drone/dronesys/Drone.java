package com.drone.dronesys;

public class Drone {

    private String serialNo;            // Drone serial no.
    private double weightLimit;         // Drone max. load capacity
    private int battery;                // Drone battery level
    private String status;              // Drone status: Idle / Fetching / Delivering
    private Position pos;               // Drone 2D position

    private Integer itemID;             //Loaded item ID
    public Drone(String serialNo, double weightLimit, int battery, String status) {
        super();
        this.serialNo = serialNo;
        this.weightLimit = weightLimit;
        this.battery = battery;
        this.status = status;
        pos = new Position(0,0);
        itemID = -1;
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
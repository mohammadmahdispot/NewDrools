package com.example.NewDrools;

public class VehicleCategory {
    private String usage;
    private String subusage;
    private String vehicleClass;
    private int fuelId;
    private int category;

    public VehicleCategory() {}

    public VehicleCategory(String usage, String subusage, String vehicleClass, int fuelId, int category) {
        this.usage = usage;
        this.subusage = subusage;
        this.vehicleClass = vehicleClass;
        this.fuelId = fuelId;
        this.category = category;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getSubusage() {
        return subusage;
    }

    public void setSubusage(String subusage) {
        this.subusage = subusage;
    }

    public String getVehicleClass() {
        return vehicleClass;
    }

    public void setVehicleClass(String vehicleClass) {
        this.vehicleClass = vehicleClass;
    }

    public int getFuelId() {
        return fuelId;
    }

    public void setFuelId(int fuelId) {
        this.fuelId = fuelId;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "VehicleCategory{" +
                "usage='" + usage + '\'' +
                ", subusage='" + subusage + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", fuelId=" + fuelId +
                ", category=" + category +
                '}';
    }
}

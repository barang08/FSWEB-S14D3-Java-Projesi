package com.wit.arge;

public class HybridCar extends  CarSkeleton{

    private double avgKmPerLitre;
    private int batterySize;
private int cylinders;



    public HybridCar(String name, String description, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre=avgKmPerLitre;
        this.batterySize =batterySize;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}

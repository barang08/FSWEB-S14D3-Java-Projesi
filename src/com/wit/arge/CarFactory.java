package com.wit.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton carSkeleton = new ElectricCar("Tesla", "Electirical car", 250,100);

        System.out.println(carSkeleton.drive());


        CarSkeleton carSkeleton2 = new GasPoweredCar("Toyota", "Power with gas",2,165);

        CarSkeleton carSkeleton3 = new HybridCar("Renault", "Hybrid car",100,185);
    }



}

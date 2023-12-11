package com.wit.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    public String startEngine(){
        System.out.println("Class: " + getClass().getSimpleName());
        return getName() + "start engine";
    }
   public String drive(){
        runEngine(this);
        return getName() +" " + "driving";
   }

   protected void runEngine(CarSkeleton carSkeleton){
       System.out.println(carSkeleton.getClass().getSimpleName());
       if(carSkeleton instanceof ElectricCar){
           double kmCharge = ((ElectricCar)carSkeleton).getAvgKmPerCharge();
           double batterySize = ((ElectricCar)carSkeleton).getBatterySize();
           System.out.println("The kmCharge of electrical car is: " + " "+ kmCharge + " " + "and the battery size of " +
                           "the electrical car is: " + batterySize
                    );
       }

   }

}

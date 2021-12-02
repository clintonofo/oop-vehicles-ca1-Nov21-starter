package org.example;



// Van class to represent Vans and Trucks
//
public class Car extends Vehicle {
    private int passengers;   // measured in litres.  For Vans and Trucks

    public Car(String type, String make, String model, double milesPerKwH,
               String registration, double costPerMile,
               int year, int month, int day,
               int mileage, double latitude, double longitude,
               int passengers) {
        // call superclass constructor to initialize the fields defined in Vehicle
        super(type, make, model, milesPerKwH,
                registration, costPerMile,
                year, month, day,
                mileage, latitude, longitude);

        this.passengers = passengers;
    }

    // Constructor version to be used to recreate a Van that was read from file.
    // It will have already been allocated an id.
    //
    public Car(int id, String type, String make, String model, double milesPerKwH,
               String registration, double costPerMile,
               int year, int month, int day,
               int mileage, double latitude, double longitude, int passengers) {
        // call superclass constructor to initialize the fields defined in Vehicle
        super(id, type, make, model, milesPerKwH,
                registration, costPerMile,
                year, month, day,
                mileage, latitude, longitude);

        this.passengers = passengers;
    }

    public double getPassengers() {
        return passengers;
    }

    public void setPassengers(int Passengers) {
        this.passengers = Passengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "Passengers=" + passengers +
                "} " + super.toString();
    }
}


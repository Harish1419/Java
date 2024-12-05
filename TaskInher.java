package Allprogram;

class Vehicle {
    String make;
    String model;
    int year;

    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Car extends Vehicle {
    int trunkSize; 

    Car(String make, String model, int year, int trunkSize) {
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize + " cubic feet");
    }
}

class Truck extends Vehicle {
    int payloadCapacity; 

    Truck(String make, String model, int year, int payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity + " pounds");
    }
}

public class TaskInher {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", "Camry", 2020, 15);
        System.out.println("Car Details:");
        car.displayDetails();
        System.out.println();

        
        Truck truck = new Truck("Ford", "endeavor", 2022, 3000);
        System.out.println("Truck Details:");
        truck.displayDetails();
    }
}
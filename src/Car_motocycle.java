// Abstract class representing a means of transportation
abstract class Vehicle {
    // Abstract method start() that must be implemented in the child classes
    public abstract void start();
}

// Class representing a Car, inheriting from the abstract class Vehicle
class Car extends Vehicle {
    // Implementation of the start() method for a car
    @Override
    public void start() {
        System.out.println("Car started");
    }

    // Additional methods specific to a Car can be added here
}

// Class representing a Motorcycle, inheriting from the abstract class Vehicle
class Motorcycle extends Vehicle {
    // Implementation of the start() method for a motorcycle
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    // Additional methods specific to a Motorcycle can be added here
}
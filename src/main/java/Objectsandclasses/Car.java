package Objectsandclasses;

public class Car {
    private String make;
    private String model;
    private int year;
    private boolean isrunning;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void startcar() {
        if (!isrunning) {
            isrunning = true;
            System.out.println(make + "" + model + " started");
        } else {
            System.out.println("The car is already running");
        }
    }

    public static void main(String[] args) {
        Car[] cars = new Car[4];

        cars[0] = new Car("Toyota", " Camry", 2014);
        cars[1] = new Car("Nissan", " Sentra", 2014);
        cars[2] = new Car("Toyota", " 4Runner", 2014);
        cars[3] = new Car("Tesla", " Roadster", 2014);

        for (Car car : cars) {
            car.startcar();
            car.startcar();
        }

    }

}

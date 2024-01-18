class Vehicle {
    String make;
    String model;
    int year;
    
    public Vehicle(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println(); 
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lamborghini", "Diablo", 1991, 2);
        Car car2 = new Car("Mazda", "RX7", 1996, 2);
        Car car3 = new Car("Mazda", "Miata MX5", 1991, 2);
        Car car4 = new Car("Porsche", "GT3 RS", 2021, 2);

        car1.displayDetails();
        car2.displayDetails();
        car3.displayDetails();
        car4.displayDetails();
    }
}
package HW3course2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMS", 4);
        Car car2 = new Car("KIA", 4);
        Truck truck1 = new Truck("Volvo", 6);
        Truck truck2 = new Truck("Man", 8);
        Bicycle bicycle1 = new Bicycle("GIANT", 2);
        Bicycle bicycle2 = new Bicycle("CUBE", 2);

        bicycle1.check();
        car2.check();
        truck2.check();
        Service car3 = new Car("Rover", 4);
        car3.check();
    }
}


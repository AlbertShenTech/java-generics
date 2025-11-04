package org.albertshen;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /**
         * Entry point of the program.
         * Uncomment any method call below to run each individual demo.
         * Each demo explains a different generic concept in Java.
         */
        // 1. Demonstrates printing without using generics.
        withoutGenericDemo();

        // 2. Demonstrates basic generic classes.
        genericDemo();

        // 3. Demonstrates bounded type parameters.
        boundedTypeDemo();

        // 4. Demonstrates using wildcard (?) in lists.
        wildcardDemo();

        // 5. Demonstrates ? extends (upper-bounded wildcards).
        upperBoundedWildcardDemo();

        // 6. Demonstrates ? super (lower-bounded wildcards).
        lowerBoundedWildcardDemo();

        // 7. Demonstrates a generic method with multiple bounds.
        genericMethodDemo();
    }

    /**
     * Demonstrates printing without using generics.
     * Each type requires its own dedicated class (IntegerPrinter, StringPrinter, etc.).
     * Shows the limitation of non-generic approach: need separate classes for each type.
     */
    private static void withoutGenericDemo() {
        IntegerPrinter integerPrinter = new IntegerPrinter(123);
        integerPrinter.print();

        StringPrinter stringPrinter = new StringPrinter("Hello world!");
        stringPrinter.print();
    }

    /**
     * Demonstrates the use of a generic Printer class.
     * The same Printer class can handle multiple types without creating separate classes.
     * Shows the benefit of generics in type safety and code reuse.
     */
    private static void genericDemo() {
        Printer<Integer> printer = new Printer<>(123);
        printer.print();

        // Demonstrates a generic class with two type parameters
        CompositePrinter<Integer, String> compositePrinter = new CompositePrinter<>(123, "Hi there!");
        compositePrinter.print();
    }

    /**
     * Demonstrates the use of bounded type parameters in generics.
     * - VehiclePrinter only accepts objects that extend Vehicle.
     * - VehicleThingPrinter only accepts objects that are a subtype of Vehicle AND implement the Thing interface.
     * Shows how generics can enforce type constraints at compile-time.
     */
    private static void boundedTypeDemo() {
        // Only accepts objects that extend Vehicle.
        System.out.println("------Extend Vehicle Class.------");
        VehiclePrinter<Car> vehiclePrinter = new VehiclePrinter<>(new Car("Benz", "White"));
        vehiclePrinter.print();

        // Only accepts objects that are a subtype of Vehicle AND implement the Thing interface.
        System.out.println("------Extend Vehicle Class AND implement the Thing interface.------");
        VehicleThingPrinter<Bus> vehicleThingPrinter = new VehicleThingPrinter<>(new Bus("Benz", "Blue", "City Bus"));
        vehicleThingPrinter.print();
    }

    /**
     * Demonstrates a generic method with bounded type parameters.
     * The method accepts any T that extends Vehicle and implements Thing.
     * This enforces both class inheritance and interface implementation at the method level.
     */
    private static void genericMethodDemo() {
        printVehicle(new Bus("Benz", "Blue", "City Bus"));
    }

    /**
     * Demonstrates using wildcard (?) in generics.
     * A List<?> can hold any type, but elements cannot be added (except null),
     * because the compiler does not know the exact type.
     * This is useful for read-only operations.
     */
    private static void wildcardDemo() {
        List<Object> list = new ArrayList<>();
        list.add(123);
        list.add("Hi there!");
        list.add(new Car("Benz", "White"));
        list.add(new Bus("Benz", "Blue", "City Bus"));
        wildcardListPrinter(list);
    }

    /**
     * Demonstrates upper-bounded wildcards (? extends Vehicle).
     * The list can contain Vehicle or any subclass of Vehicle (Car, Bus, etc.)
     * Useful when you only need to read data from the list, not add new items.
     */
    private static void upperBoundedWildcardDemo() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Porsche", "Black"));
        carList.add(new Car("Benz", "White"));
        upperBoundedWildcardListPrinter(carList);

        List<Bus> busList = new ArrayList<>();
        busList.add(new Bus("Benz", "Blue", "City Bus"));
        busList.add(new Bus("Volvo", "Yellow", "School Bus"));
        upperBoundedWildcardListPrinter(busList);

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Benz", "Blue"));
        vehicleList.add(new Vehicle("Porsche", "Black"));
        upperBoundedWildcardListPrinter(vehicleList);
    }

    /**
     * Demonstrates lower-bounded wildcards (? super Car).
     * The list can contain Car or any of its superclasses (Vehicle, Object, etc.)
     * Useful when you want to safely add Car or its subclasses into the list.
     */
    private static void lowerBoundedWildcardDemo() {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Benz", "Blue"));
        vehicleList.add(new Vehicle("Porsche", "Black"));
        lowerBoundedWildcardListPrinter(vehicleList);

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Porsche", "Black"));
        carList.add(new Car("Benz", "White"));
        lowerBoundedWildcardListPrinter(carList);
    }

    /**
     * Generic method with multiple bounds.
     * T must be a subclass of Vehicle AND implement Thing interface.
     * Demonstrates constraints at the method level instead of class level.
     */
    private static <T extends Vehicle & Thing> void printVehicle(T vehicle) {
        System.out.println("Vehicle Name: " + vehicle.getName());
        System.out.println("Vehicle Brand: " + vehicle.getBrand());
        System.out.println("Vehicle Color: " + vehicle.getColor());
    }

    /**
     * Prints any list using wildcard (?).
     * Read-only access — items can be printed, but not added.
     */
    private static void wildcardListPrinter(List<?> list) {
        System.out.println(list);
    }

    /**
     * Accepts List of Vehicle or any subclass of Vehicle (? extends Vehicle).
     * Demonstrates upper-bounded wildcard usage.
     */
    private static void upperBoundedWildcardListPrinter(List<? extends Vehicle> list) {
        System.out.println(list);
    }

    /**
     * Accepts List of Car or any superclass of Car (? super Car).
     * Demonstrates lower-bounded wildcard usage.
     */
    private static void lowerBoundedWildcardListPrinter(List<? super Car> list) {
        System.out.println(list);
    }
}
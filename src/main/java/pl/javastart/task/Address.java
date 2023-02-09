package pl.javastart.task;

import java.util.Scanner;

public class Address {

    private Scanner scanner = new Scanner(System.in);
    private String city;
    private String street;
    private int buildingNumber;

    Address() {
    }

    void typeAddress() {
        System.out.println("Miejscowość wydarzenia: ");
        city = scanner.nextLine();
        System.out.println("Ulica: ");
        street = scanner.nextLine();
        System.out.println("Numer budynku: ");
        buildingNumber = scanner.nextInt();
        scanner.nextLine();
    }

    Address(String city, String street, int buildingNumber) {
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    String getCity() {
        return city;
    }

    String getStreet() {
        return street;
    }

    int getBuildingNumber() {
        return buildingNumber;
    }

}

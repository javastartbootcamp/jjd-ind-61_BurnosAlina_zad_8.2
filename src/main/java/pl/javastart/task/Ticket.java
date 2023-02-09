package pl.javastart.task;

import java.util.Scanner;

public class Ticket {

    private Scanner scanner = new Scanner(System.in);
    private String eventName;
    private Address address;
    private double basicPrice;
    private double discount;
    private static int uniqueNumber;
    private double finalPrice;

    Ticket() {
    }

    Ticket(String eventName, Address address, double basicPrice, double discount) {
        this.eventName = eventName;
        this.address = address;
        this.basicPrice = basicPrice;
        this.discount = discount;
        uniqueNumber++;
    }

    Ticket createTicket() {
        Address address1 = new Address();
        address = address1;
        System.out.println("Nazwa wydarzenia:");
        eventName = scanner.nextLine();
        address1.typeAddress();
        System.out.println("Podstawowa cena biletu: ");
        basicPrice = scanner.nextDouble();
        scanner.nextLine();
        typeDiscount();
        return new Ticket(eventName, address1, basicPrice, discount);
    }

    private void typeDiscount() {
        do {
            System.out.println("Zniżka (0-1): ");
            discount = scanner.nextDouble();
        } while (discount < 0 || discount > 1);
    }

    double finalPrice() {
        return finalPrice = basicPrice - basicPrice * discount;
    }

    void printInfo() {
        System.out.println(eventName + "\n" + address.getCity() + ", " + address.getStreet() + ", " +
                address.getBuildingNumber() + "\nCena podstawowa: " + basicPrice + "zł\nZniżka: " +
                discount + "\nCena ostateczna: " + finalPrice + "zł\nNumer biletu: " + uniqueNumber);
    }

    double getFinalPrice() {
        return finalPrice;
    }

    double setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
        return finalPrice;
    }
}

package pl.javastart.task;

public class StandardTicket extends Ticket {

    private final static String TYPE = "Bilet standardowy";

    StandardTicket() {
    }

    StandardTicket(String eventName, Address address, double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    public static Ticket create() {
        StandardTicket standardTicket = new StandardTicket();
        standardTicket.createTicket();
        return standardTicket;
    }

    @Override
    double calculateFinalPrice() {
        return super.calculateFinalPrice() + 5;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

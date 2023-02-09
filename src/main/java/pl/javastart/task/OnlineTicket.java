package pl.javastart.task;

public class OnlineTicket extends Ticket {

    private final static String TYPE = "Bilet internetowy";

    OnlineTicket(String eventName, Address address, double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    @Override
    Ticket createTicket() {
        return super.createTicket();
    }

    @Override
    double finalPrice() {
        return super.finalPrice();
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

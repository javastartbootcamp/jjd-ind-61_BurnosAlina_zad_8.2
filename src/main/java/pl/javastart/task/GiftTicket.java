package pl.javastart.task;

public class GiftTicket extends Ticket {

    private final static String TYPE = "Bilet prezentowy";

    GiftTicket() {
    }

    GiftTicket(String eventName, Address address, double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    public static Ticket create() {
        GiftTicket giftTicket = new GiftTicket();
        giftTicket.createTicket();
        return giftTicket;
    }

    @Override
    double calculateFinalPrice() {
        return super.calculateFinalPrice() + 5 + (super.calculateFinalPrice() * 0.05);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

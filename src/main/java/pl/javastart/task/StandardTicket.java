package pl.javastart.task;

public class StandardTicket extends Ticket {

    private final static String TYPE = "Bilet standardowy";

    StandardTicket() {
    }

    StandardTicket(String eventName, Address address, double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    @Override
    Ticket createTicket() {
        return super.createTicket();
    }

    @Override
    double finalPrice() {
        super.finalPrice();
        return addExtraCostsToFinalPrice();
    }

    private double addExtraCostsToFinalPrice() {
        return setFinalPrice(getFinalPrice() + 5);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

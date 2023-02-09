package pl.javastart.task;

public class GiftTicket extends Ticket {

    private final static String TYPE = "Bilet prezentowy";

    GiftTicket(String eventName, Address address,  double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    @Override
    Ticket createTicket() {
        return super.createTicket();
    }

    @Override
    double finalPrice() {
        super.finalPrice();
        return addExtraCostsToPrice();
    }

    private double addExtraCostsToPrice() {
        double additional5percent = 0.05 * getFinalPrice();
        double firstCost = setFinalPrice(getFinalPrice() + 5);
        return setFinalPrice(firstCost + additional5percent);
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

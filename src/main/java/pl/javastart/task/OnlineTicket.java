package pl.javastart.task;

public class OnlineTicket extends Ticket {

    private final static String TYPE = "Bilet internetowy";

    OnlineTicket() {
    }

    OnlineTicket(String eventName, Address address, double basicPrice, double discount) {
        super(eventName, address, basicPrice, discount);
    }

    public static Ticket create() {
        OnlineTicket onlineTicket = new OnlineTicket();
        onlineTicket.createTicket();
        return onlineTicket;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println(TYPE);
    }
}

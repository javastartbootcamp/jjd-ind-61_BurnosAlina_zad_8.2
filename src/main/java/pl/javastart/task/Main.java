package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket ticket = OnlineTicket.create();
        ticket.printInfo();
        Ticket ticket1 = StandardTicket.create();
        ticket1.printInfo();
        Ticket ticket2 = GiftTicket.create();
        ticket2.printInfo();
    }
}

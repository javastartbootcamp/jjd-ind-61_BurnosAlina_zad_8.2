package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Address concertAddress = new Address("Poznań", "Stołowa", 15);
        Address stadiumAddress = new Address("Katowice", "Chorzowska", 154);
        OnlineTicket ticket = new OnlineTicket("Koncert: Lana del Rey", concertAddress, 360,
                0.2);
        ticket.finalPrice();
        ticket.printInfo();
        StandardTicket ticket1 = new StandardTicket("Piłka nożna: BVB Borussia Dortmund & GKS Katowice",
                stadiumAddress, 150, 0.3);
        ticket1.finalPrice();
        ticket1.printInfo();
        GiftTicket ticket2 = new GiftTicket("Koncert: Lana del rey", concertAddress, 360,
                0.2);
        ticket2.finalPrice();
        ticket2.printInfo();
        StandardTicket ticket3 = new StandardTicket();
        ticket3.createTicket();
        ticket3.finalPrice();
        ticket3.printInfo();
    }
}

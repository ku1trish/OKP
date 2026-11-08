package org.example;

public class App {
    public static void main(String[] args) {
        Building bld = new Building("Налибокская 21", 10, 6000);
        bld.averageAreaPerFloor();
        Ship[] ship = new Ship[5];
        ship[0] = new Ship("Альбинос", 260.55, 25.55);
        ship[1] = new Ship("Аврора", 3550.34, 355.56);
        ship[2] = new Ship("Каенге", 4000.50, 655.65);
        ship[3] = new Ship("Яна вайпер", 540.67, 45.78);
        ship[4] = new Ship("Джиння", 566.3, 37.5);

        Ship length = ship[0];
        Ship tonnage = ship[0];
        for (int i = 0; i < ship.length; i++) {
            if (ship[i].getLength() > length.getLength()) {
                length = ship[i];
            }
            if (ship[i].getTonnage() > tonnage.getTonnage()) {
                tonnage = ship[i];
            }
        }
        String l = length.toString();
        System.out.println(length);
        String t = tonnage.toString();
        System.out.println(tonnage);

        Ticket[] tickets =
                {
                        new Ticket(Ticket.TicketType.BUSINESS, "23HY3466P"),
                        new Ticket(Ticket.TicketType.FIRST_CLASS, "455HI248D"),
                        new Ticket(Ticket.TicketType.FIRST_CLASS, "45JU900L"),
                        new Ticket(Ticket.TicketType.ECONOMY, "5556QQ11Q"),
                        new Ticket(Ticket.TicketType.BUSINESS, "577HH12Q"),
                        new Ticket(Ticket.TicketType.ECONOMY, "4483YY881")
                };
        for (int i = 0; i < tickets.length; i++){
            if (tickets[i].getType()==Ticket.TicketType.BUSINESS){
                System.out.println(tickets[i]);
            }
        }
    }
}



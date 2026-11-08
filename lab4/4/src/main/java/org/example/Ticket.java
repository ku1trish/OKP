package org.example;

public class Ticket {
    public enum TicketType {
        ECONOMY, BUSINESS, FIRST_CLASS
    }

    private TicketType type;
    private String flightNumber;

    public Ticket(TicketType type, String flightNumber) {
        this.type = type;
        this.flightNumber = flightNumber;
    }

    public TicketType getType() {
        return type;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public String toString(){return "Номер полета: "+flightNumber+". Тип билета: "+type;}
}

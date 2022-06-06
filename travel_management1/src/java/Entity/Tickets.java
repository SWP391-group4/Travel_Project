/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Tickets {
    private String TicketId;
    private String SeatClass;
    private int SeatNumber;
    private double Tax;
    private double Price;
    private int Status;
    private String FlightId;

    public Tickets() {
    }

    public Tickets(String TicketId, String SeatClass, int SeatNumber, double Tax, double Price, int Status, String FlightId) {
        this.TicketId = TicketId;
        this.SeatClass = SeatClass;
        this.SeatNumber = SeatNumber;
        this.Tax = Tax;
        this.Price = Price;
        this.Status = Status;
        this.FlightId = FlightId;
    }

    public Tickets(String SeatClass, int SeatNumber, double Tax, double Price, int Status, String FlightId) {
        this.SeatClass = SeatClass;
        this.SeatNumber = SeatNumber;
        this.Tax = Tax;
        this.Price = Price;
        this.Status = Status;
        this.FlightId = FlightId;
    }

    public String getTicketId() {
        return TicketId;
    }

    public void setTicketId(String TicketId) {
        this.TicketId = TicketId;
    }

    public String getSeatClass() {
        return SeatClass;
    }

    public void setSeatClass(String SeatClass) {
        this.SeatClass = SeatClass;
    }

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    public double getTax() {
        return Tax;
    }

    public void setTax(double Tax) {
        this.Tax = Tax;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getFlightId() {
        return FlightId;
    }

    public void setFlightId(String FlightId) {
        this.FlightId = FlightId;
    }

    @Override
    public String toString() {
        return "Tickets{" + "TicketId=" + TicketId + ", SeatClass=" + SeatClass + ", SeatNumber=" + SeatNumber + ", Tax=" + Tax + ", Price=" + Price + ", Status=" + Status + ", FlightId=" + FlightId + '}';
    }
    
}

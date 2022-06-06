/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class FlightBooking {
    private String TicketId;
    private String CustomerId;
    private int FlightOrderNumber;
    private String FirstName;
    private String LastName;
    private String Phone;
    private double Price;

    public FlightBooking() {
    }

    public FlightBooking(String TicketId, String CustomerId, int FlightOrderNumber, String FirstName, String LastName, String Phone, double Price) {
        this.TicketId = TicketId;
        this.CustomerId = CustomerId;
        this.FlightOrderNumber = FlightOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Price = Price;
    }

    public FlightBooking(String CustomerId, int FlightOrderNumber, String FirstName, String LastName, String Phone, double Price) {
        this.CustomerId = CustomerId;
        this.FlightOrderNumber = FlightOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.Price = Price;
    }

    public String getTicketId() {
        return TicketId;
    }

    public void setTicketId(String TicketId) {
        this.TicketId = TicketId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getFlightOrderNumber() {
        return FlightOrderNumber;
    }

    public void setFlightOrderNumber(int FlightOrderNumber) {
        this.FlightOrderNumber = FlightOrderNumber;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "FlightBooking{" + "TicketId=" + TicketId + ", CustomerId=" + CustomerId + ", FlightOrderNumber=" + FlightOrderNumber + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", Price=" + Price + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class FlightHistory {
    private String TicketId;
    private String CustomerId;
    private int FlightOrderNumber;
    private String firstName;
    private String LastName;
    private String phone;
    private double price;
    private String feedback;
    private int star;

    public FlightHistory() {
    }

    public FlightHistory(String TicketId, String CustomerId, int FlightOrderNumber, String firstName, String LastName, String phone, double price, String feedback, int star) {
        this.TicketId = TicketId;
        this.CustomerId = CustomerId;
        this.FlightOrderNumber = FlightOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.price = price;
        this.feedback = feedback;
        this.star = star;
    }

    public FlightHistory(String CustomerId, int FlightOrderNumber, String firstName, String LastName, String phone, double price, String feedback, int star) {
        this.CustomerId = CustomerId;
        this.FlightOrderNumber = FlightOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.price = price;
        this.feedback = feedback;
        this.star = star;
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

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public String getfeedback() {
        return feedback;
    }

    public void setfeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getstar() {
        return star;
    }

    public void setstar(int star) {
        this.star = star;
    }

    @Override
    public String toString() {
        return "FlightHistory{" + "TicketId=" + TicketId + ", CustomerId=" + CustomerId + ", FlightOrderNumber=" + FlightOrderNumber + ", firstName=" + firstName + ", LastName=" + LastName + ", phone=" + phone + ", price=" + price + ", feedback=" + feedback + ", star=" + star + '}';
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Rooms {
    private String RoomId;
    private int RoomNumber;
    private String HotelId;
    private double Price;
    private String Status;
    private String Feedback;

    public Rooms(String RoomId, int RoomNumber, String HotelId, double Price, String Status, String Feedback) {
        this.RoomId = RoomId;
        this.RoomNumber = RoomNumber;
        this.HotelId = HotelId;
        this.Price = Price;
        this.Status = Status;
        this.Feedback = Feedback;
    }

    public Rooms(int RoomNumber, String HotelId, double Price, String Status, String Feedback) {
        this.RoomNumber = RoomNumber;
        this.HotelId = HotelId;
        this.Price = Price;
        this.Status = Status;
        this.Feedback = Feedback;
    }

    public Rooms() {
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(int RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String HotelId) {
        this.HotelId = HotelId;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getFeedback() {
        return Feedback;
    }

    public void setFeedback(String Feedback) {
        this.Feedback = Feedback;
    }

    @Override
    public String toString() {
        return "Rooms{" + "RoomId=" + RoomId + ", RoomNumber=" + RoomNumber + ", HotelId=" + HotelId + ", Price=" + Price + ", Status=" + Status + ", Feedback=" + Feedback + '}';
    }
    
}

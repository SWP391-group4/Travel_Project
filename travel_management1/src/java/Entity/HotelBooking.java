/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class HotelBooking {
    private String RoomId;
    private String CustomerId;
    private int RoomOrderNumber;
    private String FirstName;
    private String LastName;
    private String Phone;
    private String OrderTime;
    private String UsedTime;

    public HotelBooking(String RoomId, String CustomerId, int RoomOrderNumber, String FirstName, String LastName, String Phone, String OrderTime, String UsedTime) {
        this.RoomId = RoomId;
        this.CustomerId = CustomerId;
        this.RoomOrderNumber = RoomOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.OrderTime = OrderTime;
        this.UsedTime = UsedTime;
    }

    public HotelBooking(String CustomerId, int RoomOrderNumber, String FirstName, String LastName, String Phone, String OrderTime, String UsedTime) {
        this.CustomerId = CustomerId;
        this.RoomOrderNumber = RoomOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.OrderTime = OrderTime;
        this.UsedTime = UsedTime;
    }

    public HotelBooking() {
    }

    public String getRoomId() {
        return RoomId;
    }

    public void setRoomId(String RoomId) {
        this.RoomId = RoomId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getRoomOrderNumber() {
        return RoomOrderNumber;
    }

    public void setRoomOrderNumber(int RoomOrderNumber) {
        this.RoomOrderNumber = RoomOrderNumber;
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

    public String getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    public String getUsedTime() {
        return UsedTime;
    }

    public void setUsedTime(String UsedTime) {
        this.UsedTime = UsedTime;
    }

    @Override
    public String toString() {
        return "HotelBooking{" + "RoomId=" + RoomId + ", CustomerId=" + CustomerId + ", RoomOrderNumber=" + RoomOrderNumber + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", OrderTime=" + OrderTime + ", UsedTime=" + UsedTime + '}';
    }
    
}

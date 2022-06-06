/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class HotelHistory {
    private String RoomId;
    private String CustomerId;
    private int RoomOrderNumber;
    private String firstName;
    private String LastName;
    private String phone;
    private String orderTime;
    private String usedTime;
    private String feedback;
    private int star;

    public HotelHistory(String RoomId, String CustomerId, int RoomOrderNumber, String firstName, String LastName, String phone, String orderTime, String usedTime, String feedback, int star) {
        this.RoomId = RoomId;
        this.CustomerId = CustomerId;
        this.RoomOrderNumber = RoomOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.orderTime = orderTime;
        this.usedTime = usedTime;
        this.feedback = feedback;
        this.star = star;
    }

    public HotelHistory(String CustomerId, int RoomOrderNumber, String firstName, String LastName, String phone, String orderTime, String usedTime, String feedback, int star) {
        this.CustomerId = CustomerId;
        this.RoomOrderNumber = RoomOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.orderTime = orderTime;
        this.usedTime = usedTime;
        this.feedback = feedback;
        this.star = star;
    }

    public HotelHistory() {
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

    public String getorderTime() {
        return orderTime;
    }

    public void setorderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getusedTime() {
        return usedTime;
    }

    public void setusedTime(String usedTime) {
        this.usedTime = usedTime;
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
        return "HotelHistory{" + "RoomId=" + RoomId + ", CustomerId=" + CustomerId + ", RoomOrderNumber=" + RoomOrderNumber + ", firstName=" + firstName + ", LastName=" + LastName + ", phone=" + phone + ", orderTime=" + orderTime + ", usedTime=" + usedTime + ", feedback=" + feedback + ", star=" + star + '}';
    }
    
}

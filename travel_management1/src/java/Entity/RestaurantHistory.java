/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class RestaurantHistory {

    private String TableId;
    private String CustomerId;
    private int RestaurantOrderNumber;
    private String firstName;
    private String LastName;
    private String phone;
    private double orderTime;
    private String feedback;
    private int star;

    public RestaurantHistory() {
    }

    public RestaurantHistory(String TableId, String CustomerId, int RestaurantOrderNumber, String firstName, String LastName, String phone, double orderTime, String feedback, int star) {
        this.TableId = TableId;
        this.CustomerId = CustomerId;
        this.RestaurantOrderNumber = RestaurantOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.orderTime = orderTime;
        this.feedback = feedback;
        this.star = star;
    }

    public RestaurantHistory(String CustomerId, int RestaurantOrderNumber, String firstName, String LastName, String phone, double orderTime, String feedback, int star) {
        this.CustomerId = CustomerId;
        this.RestaurantOrderNumber = RestaurantOrderNumber;
        this.firstName = firstName;
        this.LastName = LastName;
        this.phone = phone;
        this.orderTime = orderTime;
        this.feedback = feedback;
        this.star = star;
    }

    public String getTableId() {
        return TableId;
    }

    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public int getRestaurantOrderNumber() {
        return RestaurantOrderNumber;
    }

    public void setRestaurantOrderNumber(int RestaurantOrderNumber) {
        this.RestaurantOrderNumber = RestaurantOrderNumber;
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

    public double getorderTime() {
        return orderTime;
    }

    public void setorderTime(double orderTime) {
        this.orderTime = orderTime;
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
        return "RestaurantHistory{" + "TableId=" + TableId + ", CustomerId=" + CustomerId + ", RestaurantOrderNumber=" + RestaurantOrderNumber + ", firstName=" + firstName + ", LastName=" + LastName + ", phone=" + phone + ", orderTime=" + orderTime + ", feedback=" + feedback + ", star=" + star + '}';
    }
    
}

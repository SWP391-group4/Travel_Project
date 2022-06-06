/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class RestaurantBooking {
    private String TableId;
    private String CustomerId;
    private int RestaurantOrderNumber;
    private String FirstName;
    private String LastName;
    private String Phone;
    private double OrderTime;

    public RestaurantBooking(String TableId, String CustomerId, int RestaurantOrderNumber, String FirstName, String LastName, String Phone, double OrderTime) {
        this.TableId = TableId;
        this.CustomerId = CustomerId;
        this.RestaurantOrderNumber = RestaurantOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.OrderTime = OrderTime;
    }

    public RestaurantBooking() {
    }

    public RestaurantBooking(String CustomerId, int RestaurantOrderNumber, String FirstName, String LastName, String Phone, double OrderTime) {
        this.CustomerId = CustomerId;
        this.RestaurantOrderNumber = RestaurantOrderNumber;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Phone = Phone;
        this.OrderTime = OrderTime;
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

    public double getOrderTime() {
        return OrderTime;
    }

    public void setOrderTime(double OrderTime) {
        this.OrderTime = OrderTime;
    }

    @Override
    public String toString() {
        return "RestaurantBooking{" + "TableId=" + TableId + ", CustomerId=" + CustomerId + ", RestaurantOrderNumber=" + RestaurantOrderNumber + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Phone=" + Phone + ", OrderTime=" + OrderTime + '}';
    }
    
}

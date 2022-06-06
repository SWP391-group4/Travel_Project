/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Restaurants {
    private String RestaurantId;
    private String RestaurantName;
    private String AddressId;
    private String DishId;
    private String Review;
    private String ServiceId;

    public Restaurants() {
    }

    public Restaurants(String RestaurantId, String RestaurantName, String AddressId, String DishId, String Review, String ServiceId) {
        this.RestaurantId = RestaurantId;
        this.RestaurantName = RestaurantName;
        this.AddressId = AddressId;
        this.DishId = DishId;
        this.Review = Review;
        this.ServiceId = ServiceId;
    }

    public Restaurants(String RestaurantName, String AddressId, String DishId, String Review, String ServiceId) {
        this.RestaurantName = RestaurantName;
        this.AddressId = AddressId;
        this.DishId = DishId;
        this.Review = Review;
        this.ServiceId = ServiceId;
    }

    public String getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(String RestaurantId) {
        this.RestaurantId = RestaurantId;
    }

    public String getRestaurantName() {
        return RestaurantName;
    }

    public void setRestaurantName(String RestaurantName) {
        this.RestaurantName = RestaurantName;
    }

    public String getAddressId() {
        return AddressId;
    }

    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    public String getDishId() {
        return DishId;
    }

    public void setDishId(String DishId) {
        this.DishId = DishId;
    }

    public String getReview() {
        return Review;
    }

    public void setReview(String Review) {
        this.Review = Review;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    @Override
    public String toString() {
        return "Restaurants{" + "RestaurantId=" + RestaurantId + ", RestaurantName=" + RestaurantName + ", AddressId=" + AddressId + ", DishId=" + DishId + ", Review=" + Review + ", ServiceId=" + ServiceId + '}';
    }
    
}

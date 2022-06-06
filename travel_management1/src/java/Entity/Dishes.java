/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Dishes {
    private String DishId;
    private String FoodName;
    private double Price;

    public Dishes() {
    }

    public Dishes(String DishId, String FoodName, double Price) {
        this.DishId = DishId;
        this.FoodName = FoodName;
        this.Price = Price;
    }

    public Dishes(String FoodName, double Price) {
        this.FoodName = FoodName;
        this.Price = Price;
    }

    public String getDishId() {
        return DishId;
    }

    public void setDishId(String DishId) {
        this.DishId = DishId;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    @Override
    public String toString() {
        return "Dishes{" + "DishId=" + DishId + ", FoodName=" + FoodName + ", Price=" + Price + '}';
    }
    
}

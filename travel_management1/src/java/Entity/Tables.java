/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Tables {
    private String TableId;
    private String RestaurantId;
    private double Price;
    private int Status;
    private int TableSize;

    public Tables() {
    }

    public Tables(String TableId, String RestaurantId, double Price, int Status, int TableSize) {
        this.TableId = TableId;
        this.RestaurantId = RestaurantId;
        this.Price = Price;
        this.Status = Status;
        this.TableSize = TableSize;
    }

    public Tables(String RestaurantId, double Price, int Status, int TableSize) {
        this.RestaurantId = RestaurantId;
        this.Price = Price;
        this.Status = Status;
        this.TableSize = TableSize;
    }

    public String getTableId() {
        return TableId;
    }

    public void setTableId(String TableId) {
        this.TableId = TableId;
    }

    public String getRestaurantId() {
        return RestaurantId;
    }

    public void setRestaurantId(String RestaurantId) {
        this.RestaurantId = RestaurantId;
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

    public int getTableSize() {
        return TableSize;
    }

    public void setTableSize(int TableSize) {
        this.TableSize = TableSize;
    }

    @Override
    public String toString() {
        return "Tables{" + "TableId=" + TableId + ", RestaurantId=" + RestaurantId + ", Price=" + Price + ", Status=" + Status + ", TableSize=" + TableSize + '}';
    } 
}

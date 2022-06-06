/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Vouchers {
    private String VoucherId;
    private int Discount;
    private int Quantity;
    private String CustomerId;

    public Vouchers(String VoucherId, int Discount, int Quantity, String CustomerId) {
        this.VoucherId = VoucherId;
        this.Discount = Discount;
        this.Quantity = Quantity;
        this.CustomerId = CustomerId;
    }

    public Vouchers(int Discount, int Quantity, String CustomerId) {
        this.Discount = Discount;
        this.Quantity = Quantity;
        this.CustomerId = CustomerId;
    }

    public Vouchers() {
    }

    public String getVoucherId() {
        return VoucherId;
    }

    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int Discount) {
        this.Discount = Discount;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    @Override
    public String toString() {
        return "Vouchers{" + "VoucherId=" + VoucherId + ", Discount=" + Discount + ", Quantity=" + Quantity + ", CustomerId=" + CustomerId + '}';
    }
    
}

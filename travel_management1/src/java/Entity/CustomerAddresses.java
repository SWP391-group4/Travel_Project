/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class CustomerAddresses {

    private String CustomerId;
    private String Province;
    private String City;
    private String Street;
    private String District;

    public CustomerAddresses(String CustomerId, String Province, String City, String Street, String District) {
        this.CustomerId = CustomerId;
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public CustomerAddresses(String Province, String City, String Street, String District) {
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public CustomerAddresses() {
    }

    public String getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(String CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    @Override
    public String toString() {
        return "CustomerAddresses{" + "CustomerId=" + CustomerId + ", Province=" + Province + ", City=" + City + ", Street=" + Street + ", District=" + District + '}';
    }
    
    
}

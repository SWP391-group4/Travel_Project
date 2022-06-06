/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class SupplierAddresses {
    private String SupplierId;
    private String Province;
    private String City;
    private String Street;
    private String District;

    public SupplierAddresses(String SupplierId, String Province, String City, String Street, String District) {
        this.SupplierId = SupplierId;
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public SupplierAddresses(String Province, String City, String Street, String District) {
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public SupplierAddresses() {
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String SupplierId) {
        this.SupplierId = SupplierId;
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
        return "SupplierAddresses{" + "SupplierId=" + SupplierId + ", Province=" + Province + ", City=" + City + ", Street=" + Street + ", District=" + District + '}';
    }
    
    
    
}

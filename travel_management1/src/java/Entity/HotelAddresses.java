/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class HotelAddresses {
    private String AddressId;
    private String Province;
    private String City;
    private String Street;
    private String District;

    public HotelAddresses(String AddressId, String Province, String City, String Street, String District) {
        this.AddressId = AddressId;
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public HotelAddresses() {
    }

    public HotelAddresses(String Province, String City, String Street, String District) {
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.District = District;
    }

    public String getAddressId() {
        return AddressId;
    }

    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
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
        return "HotelAddresses{" + "AddressId=" + AddressId + ", Province=" + Province + ", City=" + City + ", Street=" + Street + ", District=" + District + '}';
    }
    
}

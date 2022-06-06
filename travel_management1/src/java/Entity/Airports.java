/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Airports {
    private String  AirportId;
    private String  Province;
    private String  Street;
    private String  City;
    private String  District;
    private String  AirportName;

    public Airports(String AirportId, String Province, String Street, String City, String District, String AirportName) {
        this.AirportId = AirportId;
        this.Province = Province;
        this.Street = Street;
        this.City = City;
        this.District = District;
        this.AirportName = AirportName;
    }

    public Airports(String Province, String Street, String City, String District, String AirportName) {
        this.Province = Province;
        this.Street = Street;
        this.City = City;
        this.District = District;
        this.AirportName = AirportName;
    }

    public Airports() {
    }

    public String getAirportId() {
        return AirportId;
    }

    public void setAirportId(String AirportId) {
        this.AirportId = AirportId;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String District) {
        this.District = District;
    }

    public String getAirportName() {
        return AirportName;
    }

    public void setAirportName(String AirportName) {
        this.AirportName = AirportName;
    }

    @Override
    public String toString() {
        return "Airports{" + "AirportId=" + AirportId + ", Province=" + Province + ", Street=" + Street + ", City=" + City + ", District=" + District + ", AirportName=" + AirportName + '}';
    }
    
}

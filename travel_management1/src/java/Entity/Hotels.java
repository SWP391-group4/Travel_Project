/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Hotels {
    private String HotelId;
    private String HotelName;
    private String AddressId;
    private String ServiceId;
    private String image;

    public Hotels(String HotelId, String HotelName, String AddressId, String ServiceId, String image) {
        this.HotelId = HotelId;
        this.HotelName = HotelName;
        this.AddressId = AddressId;
        this.ServiceId = ServiceId;
        this.image = image;
    }

    public Hotels(String HotelName, String AddressId, String ServiceId, String image) {
        this.HotelName = HotelName;
        this.AddressId = AddressId;
        this.ServiceId = ServiceId;
        this.image = image;
    }

    public Hotels() {
    }

    public String getHotelId() {
        return HotelId;
    }

    public void setHotelId(String HotelId) {
        this.HotelId = HotelId;
    }

    public String getHotelName() {
        return HotelName;
    }

    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    public String getAddressId() {
        return AddressId;
    }

    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Hotels{" + "HotelId=" + HotelId + ", HotelName=" + HotelName + ", AddressId=" + AddressId + ", ServiceId=" + ServiceId + ", image=" + image + '}';
    }
    
}

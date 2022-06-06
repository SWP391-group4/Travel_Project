/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Suppliers {
    private String SupplierId;
    private String CompanyName;
    private String ContactName;
    private String Fax;
    private String Email;
    private String Phone;
    private String ServiceId;

    public Suppliers(String SupplierId, String CompanyName, String ContactName, String Fax, String Email, String Phone, String ServiceId) {
        this.SupplierId = SupplierId;
        this.CompanyName = CompanyName;
        this.ContactName = ContactName;
        this.Fax = Fax;
        this.Email = Email;
        this.Phone = Phone;
        this.ServiceId = ServiceId;
    }

    public Suppliers(String CompanyName, String ContactName, String Fax, String Email, String Phone, String ServiceId) {
        this.CompanyName = CompanyName;
        this.ContactName = ContactName;
        this.Fax = Fax;
        this.Email = Email;
        this.Phone = Phone;
        this.ServiceId = ServiceId;
    }

    public Suppliers() {
    }

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String SupplierId) {
        this.SupplierId = SupplierId;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String CompanyName) {
        this.CompanyName = CompanyName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    @Override
    public String toString() {
        return "Suppliers{" + "SupplierId=" + SupplierId + ", CompanyName=" + CompanyName + ", ContactName=" + ContactName + ", Fax=" + Fax + ", Email=" + Email + ", Phone=" + Phone + ", ServiceId=" + ServiceId + '}';
    }
    
}

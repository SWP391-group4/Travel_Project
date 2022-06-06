/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Customers {
    private String customerId;
    private String fIRSTNAME;
    private String lastName;
    private String phone;
    private String email;

    public Customers(String customerId, String fIRSTNAME, String lastName, String phone, String email) {
        this.customerId = customerId;
        this.fIRSTNAME = fIRSTNAME;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Customers(String fIRSTNAME, String lastName, String phone, String email) {
        this.fIRSTNAME = fIRSTNAME;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public Customers() {
    }

    public String getcustomerId() {
        return customerId;
    }

    public void setcustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getfIRSTNAME() {
        return fIRSTNAME;
    }

    public void setfIRSTNAME(String fIRSTNAME) {
        this.fIRSTNAME = fIRSTNAME;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" + "customerId=" + customerId + ", fIRSTNAME=" + fIRSTNAME + ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + '}';
    }
    
}

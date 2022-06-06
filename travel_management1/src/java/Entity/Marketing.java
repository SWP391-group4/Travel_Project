/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Marketing {
    private String MarketingId;
    private String FirstName;
    private String LastName;
    private int Age;
    private String Email;

    public Marketing(String MarketingId, String FirstName, String LastName, int Age, String Email) {
        this.MarketingId = MarketingId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Email = Email;
    }

    public Marketing(String FirstName, String LastName, int Age, String Email) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Email = Email;
    }

    public Marketing() {
    }

    public String getMarketingId() {
        return MarketingId;
    }

    public void setMarketingId(String MarketingId) {
        this.MarketingId = MarketingId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "Marketing{" + "MarketingId=" + MarketingId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", Email=" + Email + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author nam
 */
public class Accounts {
    private String UserId;
    private String Account;
    private String Password;
    private int Type;

    public Accounts(String UserId, String Account, String Password, int Type) {
        this.UserId = UserId;
        this.Account = Account;
        this.Password = Password;
        this.Type = Type;
    }

    public Accounts(String Account, String Password, int Type) {
        this.Account = Account;
        this.Password = Password;
        this.Type = Type;
    }

    public Accounts() {
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getAccount() {
        return Account;
    }

    public void setAccount(String Account) {
        this.Account = Account;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Accounts{" + "UserId=" + UserId + ", Account=" + Account + ", Password=" + Password + ", Type=" + Type + '}';
    }
    
}

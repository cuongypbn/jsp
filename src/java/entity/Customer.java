/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author chienbinhdondoc
 */
public class Customer {
    private int Cid;
    private String FullName,Email;
    private int Phone;
    private String UserName,Password;
    private boolean Status;
    private String Type_Customer;

    public int getCid() {
        return Cid;
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public String getType_Customer() {
        return Type_Customer;
    }

    public void setType_Customer(String Type_Customer) {
        this.Type_Customer = Type_Customer;
    }

    public Customer(int Cid, String FullName, String Email, int Phone, String UserName, String Password, boolean Status, String Type_Customer) {
        this.Cid = Cid;
        this.FullName = FullName;
        this.Email = Email;
        this.Phone = Phone;
        this.UserName = UserName;
        this.Password = Password;
        this.Status = Status;
        this.Type_Customer = Type_Customer;
    }

    public Customer() {
    }
}

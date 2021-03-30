/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author chienbinhdondoc
 */
public class Bill {
    private String Bid;
    private Date createDate;
    private String Cname,email,phone,address;
    private float total;
    private String status;
    private int cid;

    @Override
    public String toString() {
        return "Bill{" + "Bid=" + Bid + ", createDate=" + createDate + ", Cname=" + Cname + ", email=" + email + ", phone=" + phone + ", address=" + address + ", total=" + total + ", status=" + status + ", cid=" + cid + '}';
    }




    public String getBid() {
        return Bid;
    }

    public void setBid(String Bid) {
        this.Bid = Bid;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCname() {
        return Cname;
    }

    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public Bill(String Bid, Date createDate, String Cname, String email, String phone, String address, float total, String status, int cid) {
        this.Bid = Bid;
        this.createDate = createDate;
        this.Cname = Cname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.total = total;
        this.status = status;
        this.cid = cid;
    }

    public Bill() {
    }
    
}

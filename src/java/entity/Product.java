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
public class Product {
    private int Pid;
    private Date Date_Added;
    private float price;
    private String ProducName,Img,Descriptions;
    private int Quantity;
    private String Status;

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public Date getDate_Added() {
        return Date_Added;
    }

    public void setDate_Added(Date Date_Added) {
        this.Date_Added = Date_Added;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducName() {
        return ProducName;
    }

    public void setProducName(String ProducName) {
        this.ProducName = ProducName;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String Descriptions) {
        this.Descriptions = Descriptions;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Product(int Pid, Date Date_Added, float price, String ProducName, String Img, String Descriptions, int Quantity, String Status) {
        this.Pid = Pid;
        this.Date_Added = Date_Added;
        this.price = price;
        this.ProducName = ProducName;
        this.Img = Img;
        this.Descriptions = Descriptions;
        this.Quantity = Quantity;
        this.Status = Status;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" + "Pid=" + Pid + ", Date_Added=" + Date_Added + ", price=" + price + ", ProducName=" + ProducName + ", Img=" + Img + ", Descriptions=" + Descriptions + ", Quantity=" + Quantity + ", Status=" + Status + '}';
    }
    
}

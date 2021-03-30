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
public class BillDetail {
    private String bid;
    private int pid;
    private float ProducMoney;
    private int Quantity;
    private String ProducName;


    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public float getProducMoney() {
        return ProducMoney;
    }

    public void setProducMoney(float ProducMoney) {
        this.ProducMoney = ProducMoney;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public String getProducName() {
        return ProducName;
    }

    public void setProducName(String ProducName) {
        this.ProducName = ProducName;
    }

    public BillDetail() {
    }

    public BillDetail(String bid, int pid, float ProducMoney, int Quantity, String ProducName) {
        this.bid = bid;
        this.pid = pid;
        this.ProducMoney = ProducMoney;
        this.Quantity = Quantity;
        this.ProducName = ProducName;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "BillDetail{" + "bid=" + bid + ", pid=" + pid + ", ProducMoney=" + ProducMoney + ", Quantity=" + Quantity + ", ProducName=" + ProducName + '}';
    }


    
}

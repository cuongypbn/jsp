/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author vancuong
 */
public class Information_coffe {
    private int pid ,ifid;
    private String contex,gioithieu,thanhphan,sanxuattai,phanphoi;
    private int khoiluong;
    private String mau,muivi,img;
    String congdung;
    float gia;
    int soluong;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getCongdung() {
        return congdung;
    }

    public void setCongdung(String congdung) {
        this.congdung = congdung;
    }

    public Information_coffe(int pid, int ifid, String contex, String gioithieu, String thanhphan, String sanxuattai, String phanphoi, int khoiluong, String mau, String muivi, String img, float gia, String congdung) {
        this.pid = pid;
        this.ifid = ifid;
        this.contex = contex;
        this.gioithieu = gioithieu;
        this.thanhphan = thanhphan;
        this.sanxuattai = sanxuattai;
        this.phanphoi = phanphoi;
        this.khoiluong = khoiluong;
        this.mau = mau;
        this.muivi = muivi;
        this.img = img;
        this.gia = gia;
        this.congdung = congdung;
    }

    public Information_coffe(int pid, int ifid, String contex, String gioithieu, String thanhphan, String sanxuattai, String phanphoi, int khoiluong, String mau, String muivi, String img, float gia) {
        this.pid = pid;
        this.ifid = ifid;
        this.contex = contex;
        this.gioithieu = gioithieu;
        this.thanhphan = thanhphan;
        this.sanxuattai = sanxuattai;
        this.phanphoi = phanphoi;
        this.khoiluong = khoiluong;
        this.mau = mau;
        this.muivi = muivi;
        this.img = img;
        this.gia = gia;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

   

    public Information_coffe() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getIfid() {
        return ifid;
    }

    public void setIfid(int ifid) {
        this.ifid = ifid;
    }

    public String getContex() {
        return contex;
    }

    public void setContex(String contex) {
        this.contex = contex;
    }

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }

    public String getThanhphan() {
        return thanhphan;
    }

    public void setThanhphan(String thanhphan) {
        this.thanhphan = thanhphan;
    }

    public String getSanxuattai() {
        return sanxuattai;
    }

    public void setSanxuattai(String sanxuattai) {
        this.sanxuattai = sanxuattai;
    }

    public String getPhanphoi() {
        return phanphoi;
    }

    public void setPhanphoi(String phanphoi) {
        this.phanphoi = phanphoi;
    }

    public int getKhoiluong() {
        return khoiluong;
    }

    public void setKhoiluong(int khoiluong) {
        this.khoiluong = khoiluong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getMuivi() {
        return muivi;
    }

    public void setMuivi(String muivi) {
        this.muivi = muivi;
    }

    @Override
    public String toString() {
        return "Information_coffe{" + "pid=" + pid + ", ifid=" + ifid + ", contex=" + contex + ", gioithieu=" + gioithieu + ", thanhphan=" + thanhphan + ", sanxuattai=" + sanxuattai + ", phanphoi=" + phanphoi + ", khoiluong=" + khoiluong + ", mau=" + mau + ", muivi=" + muivi + ", img=" + img + ", gia=" + gia + '}';
    }


}

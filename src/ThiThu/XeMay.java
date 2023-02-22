/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

/**
 *
 * @author asus_vinh
 */
public class XeMay {
//    maXeMay-String, hangXe - String ,giaTien-double

    private String maXeMay;
    private String hangXe;
    private double giaTien;

    public XeMay() {
    }

    public XeMay(String maXeMay, String hangXe, double giaTien) {
        this.maXeMay = maXeMay;
        this.hangXe = hangXe;
        this.giaTien = giaTien;
    }

    public String getMaXeMay() {
        return maXeMay;
    }

    public void setMaXeMay(String maXeMay) {
        this.maXeMay = maXeMay;
    }

    public String getHangXe() {
        return hangXe;
    }

    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public void inThongTin() {
        System.out.println("ma xe: " + maXeMay + " || hang xe: " + hangXe + " || gia: " + giaTien);
    }

 
    
}

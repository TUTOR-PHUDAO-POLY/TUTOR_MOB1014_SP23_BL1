/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai2;

/**
 *
 * @author asus_vinh
 */
public class DongVat {
//    ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int

    private String ma;
    private String ten;
    private int gioiTinh;
    private int canNang;

    public DongVat() {
    }

    public DongVat(String ma, String ten, int gioiTinh, int canNang) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.canNang = canNang;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }
//    ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int

    public void inThongTin() {
        System.out.println("ma: " + ma + " || ten: " + ten + " || gioi tinh: "
                + gioiTinh + " || can nang: " + canNang);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_ArrayList_OOP;

/**
 *
 * @author Phong
 */
public class SinhVien {
    
    private String ma;
    private String ten;
    private Integer namSinh;
    private String chuyenNganh;
    private Double diemTrungBinh;

    public void display() {
        System.out.println("Mã là: " + getMa());
        System.out.println("Họ tên là: " + getTen());
        System.out.println("Năm sinh là: " + getNamSinh());
        System.out.println("Chuyên ngành là: " 
                + getChuyenNganh());
        System.out.println("Điểm trung bình là: "
                + getDiemTrungBinh());
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

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public Double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(Double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }
    
    
}

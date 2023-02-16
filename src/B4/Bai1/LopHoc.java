/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4.Bai1;

/**
 *
 * @author hangnt
 */
public class LopHoc {
//    Tạo đối tượng LopHoc gồm các thuộc tính: maLop - String ,
//    tenLop - String , dienTich - int, diaDiemLopHoc - String 
//    và các phương thức constructor, getter, setter 
//    và inThongTin(): void

    private String maLop;
    private String tenLop;
    private int dienTich;
    private String diaDiemLopHoc;

    // Mac dinh la 1 class la contructor khong tham so.
    // Nhung khi da tao contructor co tham so thi contructor khong tham so mac dinh 
    // se khong con nua. Muon dung thi phai tao them ca contructor khong tham so.
    // Contrutor : Khoi tao doi tuong
    public LopHoc() {
    }

    public LopHoc(String maLop, String tenLop, int dienTich, String diaDiemLopHoc) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.dienTich = dienTich;
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    // GET: Dung de lay du lieu 
    public String getMaLop() {
        return maLop;
    }

    // SET: Thay doi du lieu 
    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public String getDiaDiemLopHoc() {
        return diaDiemLopHoc;
    }

    public void setDiaDiemLopHoc(String diaDiemLopHoc) {
        this.diaDiemLopHoc = diaDiemLopHoc;
    }

    public void inThongTin() {
        System.out.println(maLop);
        System.out.println(tenLop);
        System.out.println(dienTich);
        System.out.println(diaDiemLopHoc);

    }

}

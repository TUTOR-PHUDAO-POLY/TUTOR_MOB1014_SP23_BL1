/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4.Bai2;

/**
 *
 * @author asus_vinh
 */
public class DongHo {
//       Tạo đối tượng DongHo gồm các thông tin:maDongHo - String, 
//    theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int  
//    và các phương thức constructor, getter, setter và inThongTin(): void

    private String maDongHo;
    private String theLoai;
    private String maSac;
    private Integer kichThuoc;
    private String chatLieu;
    private Integer gia;

    public DongHo() {
    }

    public DongHo(String maDongHo, String theLoai, String maSac, Integer kichThuoc, String chatLieu, Integer gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.maSac = maSac;
        this.kichThuoc = kichThuoc;
        this.chatLieu = chatLieu;
        this.gia = gia;
    }

    public String getMaDongHo() {
        return maDongHo;
    }

    public void setMaDongHo(String maDongHo) {
        this.maDongHo = maDongHo;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getMaSac() {
        return maSac;
    }

    public void setMaSac(String maSac) {
        this.maSac = maSac;
    }

    public Integer getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(Integer kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public Integer getGia() {
        return gia;
    }

    public void setGia(Integer gia) {
        this.gia = gia;
    }
//    maDongHo - String, 
//    theLoai - String, mauSac- String, kichThuoc - int, chatLieu -String, gia-int  

    public void inThongTin() {
        System.out.println("ma dong ho: " + maDongHo + " || the loai:  " + theLoai
                + " || ma sac: " + maSac + " || kich thuoc: "
                + kichThuoc + " || chat lieu: " + chatLieu + " || gia: " + gia);
    }

}

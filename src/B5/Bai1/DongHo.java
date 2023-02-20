/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai1;

/**
 *
 * @author asus_vinh
 */
public class DongHo {
    //maDongHo - String, theLoai - String
    //, mauSac- String, kichThuoc - int, chatLieu -String, gia-int 

    private String maDongHo;
    private String theLoai;
    private String mauSac;
    private int kichThuoc;
    private String chatLieu;
    private int gia;

    public DongHo() {
    }

    public DongHo(String maDongHo, String theLoai, String mauSac, int kichThuoc, String chatLieu, int gia) {
        this.maDongHo = maDongHo;
        this.theLoai = theLoai;
        this.mauSac = mauSac;
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

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(int kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void inThongTin() {
        System.out.println("ma dong ho: " + maDongHo);
        System.out.println("the loai dong ho: " + theLoai);
        System.out.println("mau sac dong ho: " + mauSac);
        System.out.println("kich thuoc dong ho: " + kichThuoc);
        System.out.println("chat lieu dong ho: " + chatLieu);
        System.out.println("gia dong ho: " + gia);

    }
}

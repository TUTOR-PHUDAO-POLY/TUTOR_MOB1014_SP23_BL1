/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

/**
 *
 * @author asus_vinh
 */
public class XeSo extends XeMay{
      private String nhienLieu;
      private String dongCo;

    public XeSo() {
    }

    public XeSo(String nhienLieu, String dongCo) {
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    public XeSo(String nhienLieu, String dongCo, String maXeMay, String hangXe, double giaTien) {
        super(maXeMay, hangXe, giaTien);
        this.nhienLieu = nhienLieu;
        this.dongCo = dongCo;
    }

    public String getNhienLieu() {
        return nhienLieu;
    }

    public void setNhienLieu(String nhienLieu) {
        this.nhienLieu = nhienLieu;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); 
        System.out.println("dong co"+ dongCo+ " || nhien lieu: "+ nhienLieu);
    }
      
      
}

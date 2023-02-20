/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai2;

/**
 *
 * @author asus_vinh
 */
public class Meo extends DongVat{
    private String tiengKeu;

    public Meo() {
    }

    public Meo(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public Meo(String tiengKeu, String ma, String ten, int gioiTinh, int canNang) {
        super(ma, ten, gioiTinh, canNang);
        this.tiengKeu = tiengKeu;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    @Override
    public void inThongTin() {
        super.inThongTin(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

   

   

  
    
    
}

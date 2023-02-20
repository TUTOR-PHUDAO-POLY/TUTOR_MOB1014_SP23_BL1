/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
// ma- String , ten-String , gioiTinh-int (1-Đức, 2- Cái), canNang- int
public class QLDongVat {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<DongVat> listDongVat) {
        while (true) {
            System.out.print("nhap ma: ");
            String ma = sc.nextLine();
            System.out.print("nhap ten: ");
            String ten = sc.nextLine();
            System.out.print("nhap gioi tinh: ");
            int gioiTinh = Integer.valueOf(sc.nextLine());
            System.out.print("nhap can nag: ");
            int canNang = Integer.valueOf(sc.nextLine());

            // add vao list dong vat
            listDongVat.add(new DongVat(ma, ten, gioiTinh, canNang));
            System.out.print("ban co muon nhap tiep hay ko (y/n)??");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void xuatTT(ArrayList<DongVat> listDongVat) {
        for (DongVat o : listDongVat) {
            o.inThongTin();
        }
    }

    public void seach(ArrayList<DongVat> listDongVat) {
        for (DongVat o : listDongVat) {
            if (o.getTen().matches(".*t.*")) {
                // vd: zo* khop voi "z", "zo","zooooo"
                o.inThongTin();
            }
        }
    }

    public void fakeData(ArrayList<DongVat> listDongVat) {
        listDongVat.add(new DongVat("d1", "cho", 0, 20));
        listDongVat.add(new DongVat("d1", "trau", 0, 6));
        listDongVat.add(new DongVat("d1", "meo", 0, 30));
        listDongVat.add(new DongVat("d2", "tho", 1, 0));
    }

    public void nhapTTMeo(ArrayList<Meo> listMeo) {

        System.out.print("nhap ma: ");
        String ma = sc.nextLine();
        System.out.print("nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("nhap gioi tinh: ");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.print("nhap can nag: ");
        int canNang = Integer.valueOf(sc.nextLine());
        System.out.print("nhap tieng keu: ");
        String tiengKeu = sc.nextLine();
        // add vao list dong vat
        listMeo.add(new Meo(tiengKeu, ma, ten, gioiTinh, canNang));
       
        System.out.println("ma: "+ ma+" || tieng keu: "+ tiengKeu 
                + " || ten: "+ten+" || gioi tinh: "+ gioiTinh + " || can nang: "+ canNang);

    }
}

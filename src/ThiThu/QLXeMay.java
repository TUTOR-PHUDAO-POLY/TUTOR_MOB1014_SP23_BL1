/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QLXeMay {

    Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<XeMay> listXeMay) {
        while (true) {
            System.out.print("nhap ma");
            String ma = sc.nextLine();
            System.out.print("nhap hang");
            String hang = sc.nextLine();
            System.out.print("nhap gia");
            double gia = Double.valueOf(sc.nextLine());

            listXeMay.add(new XeMay(ma, hang, gia));

            System.out.print("ban muon nhap tiep hay khong(y/n): ");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void nhapTTXeSo(ArrayList<XeSo> listXeSo) {

        System.out.print("nhap ma");
        String ma = sc.nextLine();
        System.out.print("nhap hang");
        String hang = sc.nextLine();
        System.out.print("nhap gia");
        double gia = Double.valueOf(sc.nextLine());
        System.out.print("nhap nhien lieu: ");
        String nhienLieu = sc.nextLine();
        System.out.print("nhap dong co: ");
        String dongCo = sc.nextLine();

        listXeSo.add(new XeSo(nhienLieu, dongCo, ma, hang, gia));

        for (XeSo o : listXeSo) {
            o.inThongTin();
        }

    }

    public void xuatTT(ArrayList<XeMay> listXeMay) {
//        for (XeMay o : listXeMay) {
//            o.inThongTin();
//        }
        listXeMay.forEach(o1 -> o1.inThongTin());
    }

    public void searh(ArrayList<XeMay> listXeMay, int max, int min) {
        for (XeMay o : listXeMay) {
            if (min <= o.getGiaTien() && max >= o.getGiaTien()) {
                o.inThongTin();
            }
        }
    }

    public void sort(ArrayList<XeMay> listXeMay) {
        Collections.sort(listXeMay, (o1, o2)
                -> Double.compare(o2.getGiaTien(), o1.getGiaTien()));
        xuatTT(listXeMay);
    }

    public void delete(ArrayList<XeMay> listXeMay, String maXe) {
        // duyet mang 
        for (XeMay o : listXeMay) {
            if (maXe.equalsIgnoreCase(o.getMaXeMay())) {
                listXeMay.remove(o);
                break;
            }
        }
    }

    public void fakeData(ArrayList<XeMay> listXeMay) {
        listXeMay.add(new XeMay("x1", "xxxx", 3330));
        listXeMay.add(new XeMay("x2", "xxxx", 460));
        listXeMay.add(new XeMay("x3", "xxxx", 123));
        listXeMay.add(new XeMay("x4", "xxxx", 34));
        listXeMay.add(new XeMay("x5", "xxxx", 12));
        listXeMay.add(new XeMay("x6", "xxxx", 56));
    }
}

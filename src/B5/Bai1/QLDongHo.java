/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
//maDongHo - String, theLoai - String, mauSac- String
//, kichThuoc - int, chatLieu -String, gia-int  
public class QLDongHo {

    private Scanner sc = new Scanner(System.in);

    public void nhapTT(ArrayList<DongHo> listDongHo) {
        while (true) {
            System.out.print("nhap ma dong ho: ");
            String maDongHo = sc.nextLine();
            System.out.print("nhap the loai: ");
            String theLoai = sc.nextLine();
            System.out.print("nhap mau sac: ");
            String mauSac = sc.nextLine();
            System.out.print("nhap kich thuoc: ");
            int kichThuoc = Integer.valueOf(sc.nextLine());
            System.out.print("nhap chat lieu: ");
            String chatLieu = sc.nextLine();
            System.out.print("nhap gia: ");
            int gia = Integer.valueOf(sc.nextLine());

            // add vao list
            listDongHo.add(new DongHo(maDongHo, theLoai,
                    mauSac, kichThuoc, chatLieu, gia));

            System.out.println("muon nhap tiep hay ko(y/n)???");
            String chon = sc.nextLine();
            if (chon.equalsIgnoreCase("n")) {
                break;
            }
        }

    }

    public void xuatTT(ArrayList<DongHo> listDongHo) {
        for (DongHo o : listDongHo) {
            o.inThongTin();
        }
    }

    public void sort(ArrayList<DongHo> listDongHo) {
//        Comparator<DongHo> comp = new Comparator<DongHo>() {
//            @Override
//            public int compare(DongHo o1, DongHo o2) {
//                return o1.getKichThuoc() - o2.getKichThuoc();
//            }
//        };
        Collections.sort(listDongHo,(o1, o2) -> o1.getKichThuoc() - o2.getKichThuoc());
        xuatTT(listDongHo);
    }
    
    public void fakeData(ArrayList<DongHo> listDongHo){
        listDongHo.add(new DongHo("d1", "casiio", 
                "den", 26, "vai", 200));
        listDongHo.add(new DongHo("d2", "casiio", 
                "den", 14, "vai", 200));
        listDongHo.add(new DongHo("d3", "casiio", 
                "den", 514, "vai", 200));
        listDongHo.add(new DongHo("d4", "casiio", 
                "den", 100, "vai", 200));
    }
    
    public void delete(ArrayList<DongHo> listDongHo,String maDongHo){
      boolean check = false;
        for (DongHo o : listDongHo) {
            if(maDongHo.equalsIgnoreCase(o.getMaDongHo())){
                listDongHo.remove(o);
                check = true;
                break;
                
            }
        }
        if(check == false){
            System.out.println("khong tim thay dong ho");
        }else{
            System.out.println("xoa thanh cong");
        }
    }
}

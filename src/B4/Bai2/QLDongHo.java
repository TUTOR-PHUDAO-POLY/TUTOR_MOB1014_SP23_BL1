/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class QLDongHo {

    Scanner scanner = new Scanner(System.in);

    public void nhapTT(ArrayList<DongHo> listDongHo) {
        while (true) {
            System.out.print("nhap ma dong ho: ");
            String ma = scanner.nextLine();
            System.out.print("nhap the loai dong ho: ");
            String theLoai = scanner.nextLine();
            System.out.print("nhap mau sac dong ho: ");
            String mauSac = scanner.nextLine();
            System.out.print("nhap kich thuoc dong ho: ");
            int kichThuoc = Integer.valueOf(scanner.nextLine());
            System.out.print("nhap chat lieu dong ho: ");
            String chatLieu = scanner.nextLine();
            System.out.print("nhap gia dong ho: ");
            int gia = Integer.valueOf(scanner.nextLine());
            DongHo dh = new DongHo(ma, theLoai, mauSac, kichThuoc, chatLieu, gia);
            listDongHo.add(dh);

            System.out.print("ban co muon nhap tiep hay khong(1-y/2-n)?");
            int chon = Integer.valueOf(scanner.nextLine());
            if (chon == 2) {
                break;
            }
        }

    }

    public void xuatTT(ArrayList<DongHo> listDongHo) {
        for (DongHo o : listDongHo) {
            o.inThongTin();
        }
    }

    public void timKiemTheoGia(ArrayList<DongHo> listDongHo, int min, int max) {
        
        boolean check = false;
        for (DongHo o : listDongHo) {
            if (min <= o.getGia() && o.getGia() <= max) {
                o.inThongTin();
                check = true;
            }
        }
        if(check == false){
            System.out.printf("khong co san pham nao trong %d -> %d \n",min,max);
        }
    }
    
    public void deleteDongHo(ArrayList<DongHo> listDongHo, String ma){
         boolean check = false;
        for (DongHo o : listDongHo) {
            if(ma.equalsIgnoreCase(o.getMaDongHo())){
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
    
    public void fakeData(ArrayList<DongHo> listDongHo){
        listDongHo.add(new DongHo("1",
                "casio", "den", 2, "vai", 100));
        listDongHo.add(new DongHo("2",
                "casio", "den", 2, "vai", 150));
        listDongHo.add(new DongHo("3",
                "casio", "den", 2, "vai", 90));
        listDongHo.add(new DongHo("4",
                "casio", "den", 2, "vai", 200));
    }
}

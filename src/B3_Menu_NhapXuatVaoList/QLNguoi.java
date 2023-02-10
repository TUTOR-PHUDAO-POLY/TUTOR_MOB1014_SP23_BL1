/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_Menu_NhapXuatVaoList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QLNguoi {
    
//    private ArrayList<Nguoi> listNguoi = new ArrayList<>();
    
    public void nhapThongTinNguoi(ArrayList<Nguoi> listNguoi){
        //B1: Nhap thong tin tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten:");
        String ten = sc.nextLine();
        System.out.print("Nhap tuoi:");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap gioi tinh: (1-Nam , 0- Nu):");
        int gt = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap que quan:");
        String queQuan = sc.nextLine();
        System.out.print("Nhap nghe nghiep:");
        String ngheNghiep = sc.nextLine();
        
        // B2: Khoi tao va gan gia tri cho doi tuong
        // C1: Dung contructor co tham so
        Nguoi nguoi = new Nguoi(ten, tuoi, gt, queQuan, ngheNghiep);
        
        // C2: Contructor khong tham so 
//        Nguoi nguoi1 = new Nguoi();
//        nguoi1.setTen(ten);
//        nguoi1.setTuoi(tuoi);
        
        // B3: Add vao list
        listNguoi.add(nguoi);
    }
    
    public void inThongTinNguoi(ArrayList<Nguoi> listNguoi1){
        //for-each
        for(Nguoi n1 : listNguoi1){
            n1.inThongTin();
        }
    }
}

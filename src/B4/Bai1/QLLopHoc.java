/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class QLLopHoc {
    
    public void nhapThongTinLopHoc(ArrayList<LopHoc>listLopHoc){
        // B1: Nhap thong tin cac thuoc tinh
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma lop:");
        String maLop = sc.nextLine();
        System.out.print("Nhap ten lop:");
        String tenLop = sc.nextLine();
        System.out.print("Nhap dien tich");
        int dienTich = Integer.valueOf(sc.nextLine());
//        sc.nextLine();
//        int dienTich = sc.nextInt();
//        sc.nextLine();
        System.out.print("Nhap dia diem lop:");
        String diaDiemLopHoc= sc.nextLine();
        // B2: Tao va set gia tri doi tuong 
        // C1: Su dung contructor co tham so : 
        // => Chu y: So sanh thu tu lan luot tham so trai qua phai
        LopHoc lopHoc = new LopHoc(maLop, tenLop, dienTich, diaDiemLopHoc);
        // C2: Contructor khong tham so 
//        LopHoc lopHoc1 = new LopHoc();
//        lopHoc1.setMaLop(maLop);
//        lopHoc1.setTenLop(tenLop);
//        lopHoc1.setDienTich(dienTich);
//        lopHoc1.setDiaDiemLopHoc(diaDiemLopHoc);
        // B3: Add vao list 
        listLopHoc.add(lopHoc);
    }
    
    public void xuatThongTinLopHoc(ArrayList<LopHoc>listLopHoc){
        // for-each : In Thong Tin cua List
//        for (LopHoc lh : listLopHoc) {
//            lh.inThongTin();
//        }
        // for - thuong
        for(int i = 0;i<listLopHoc.size();i++){
            listLopHoc.get(i).inThongTin();
        }
     
    }
}

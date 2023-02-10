/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package B3_Menu_NhapXuatVaoList;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class TutorBuoi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer chucNang = 0;
        do{
           
            System.out.println("1.Nhap thong tin ca nhan");
            System.out.println("2.Kiem tra so");
            System.out.println("0.Thoai");
            System.out.print("Moi ban nhap:");
//            sc.nextLine()
//            chucNang = Integer.valueOf(sc.nextLine());
//            chucNang = Integer.parseInt(sc.nextLine());
            String chucNangStr = sc.nextLine();
            chucNang = Integer.valueOf(chucNangStr);
//            Double number = Double.valueOf(sc.nextLine());
//            double number1= Double.parseDouble(sc.nextLine());
            switch (chucNang) {
                case 1:{
                    //Coi tat ca moi thu nhap tu ban phim la chuoi
                    //=> Ep kieu tuong ung voi tung  kieu du lieu cua bien
                    // Co 2 cach ep kieu : 
                    System.out.print("Nhap ten:");
                    String name = sc.nextLine();
                    System.out.print("Nhap tuoi:");
                    int tuoi = Integer.valueOf(sc.nextLine());
                    System.out.print("Nhap gioi tinh:");
                    String gioiTinh = sc.nextLine();
                    System.out.print("Nhap que quan:");
                    String queQuan = sc.nextLine();
                    System.out.println(name +" - "+ tuoi +" - "+gioiTinh +" - "+queQuan);
                    break;
                }
                case 2:{
                    System.out.print("Nhap 1 so:");
                    int n = Integer.valueOf(sc.nextLine());
                    // nguyen duong >0
                    // nguyen am <0
                    // 0 : K phai so nguyen duong , am 
                    if(n>0){
                        System.out.println("So nguyen duong");
                    }else if(n<0){
                        System.out.println("So nguyen am");
                    }else{
                        System.out.println("Khong phai so nguyen am,duong");
                    }
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    System.out.println("Chuc nang khong ton tai"); 
                    break;
                }
            }
        }while(chucNang != 0);
    }
    
}

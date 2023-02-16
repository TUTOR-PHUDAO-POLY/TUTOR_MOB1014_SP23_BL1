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
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LopHoc> lists = new ArrayList<>();
        QLLopHoc qlLopHoc = new QLLopHoc();
        int chucNang = 0;
        do {
            System.out.println("1.Nhap thong tin cua doi tuong");
            System.out.println("2.In thong tin");
            System.out.println("0.Thoat");
            System.out.print("Moi ban nhap chuc nang:");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1: {
                    qlLopHoc.nhapThongTinLopHoc(lists);
                    break;
                }
                case 2: {
                    qlLopHoc.xuatThongTinLopHoc(lists);
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }

        } while (chucNang != 0);
    }
}

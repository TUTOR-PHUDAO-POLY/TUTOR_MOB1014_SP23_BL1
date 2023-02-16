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
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DongHo> listDongHo = new ArrayList<>();
        int chucNang = 0;
        QLDongHo ql = new QLDongHo();
        ql.fakeData(listDongHo);
        do {
            System.out.println("=========================");
            System.out.println("1.nhap thong tin dong ho");
            System.out.println("2.in thong tin ");
            System.out.println("3.tim kiem dong ho theo khoang gia");
            System.out.println("4.xoa dong ho");
            System.out.println("0.thoat");
            System.out.print("moi chuc nang: ");
            chucNang = Integer.valueOf(scanner.nextLine());
            System.out.println("=========================");
            switch (chucNang) {
                case 1:
                    ql.nhapTT(listDongHo);
                    break;
                case 2:
                    ql.xuatTT(listDongHo);
                    break;
                case 3:
                    System.out.print("nhap min: ");
                    int min = Integer.valueOf(scanner.nextLine());
                    System.out.print("nhap max: ");
                    int max = Integer.valueOf(scanner.nextLine());
                    ql.timKiemTheoGia(listDongHo, min, max);

                    break;
                case 4:
                    System.out.print("nhap ma de xoa: ");
                    String ma = scanner.nextLine();
                    ql.deleteDongHo(listDongHo, ma);
                    ql.xuatTT(listDongHo);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("chuc nang khong ton tai");
            }
        } while (chucNang != 0);
    }
}

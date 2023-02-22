/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThiThu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<XeMay> listXeMay = new ArrayList<>();
        ArrayList<XeSo> listXeSo = new ArrayList<>();
       
        int chucNang = 0;
        new QLXeMay().fakeData(listXeMay);
        do {
            System.out.println("   1.Nhập danh sách đối tượng");
            System.out.println("  2.Xuất danh sách đối tượng ");
            System.out.println("  3. Tìm kiếm xe máy trong khoảng giá tiền max, min");
            System.out.println("  4.Sắp xếp giảm dần của giá tiền");
            System.out.println("5. Xóa đối tượng.");
            System.out.println("7.ke thua.");
            System.out.println("         0.Thoát");
            System.out.print("       moi nhap chuc nag: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    new QLXeMay().nhapTT(listXeMay);
                    break;

                case 2:
                    new QLXeMay().xuatTT(listXeMay);
                    break;
                case 3:
                    System.out.print("nhap min: ");
                    int min = Integer.valueOf(sc.nextLine());
                    System.out.print("nhap max: ");
                    int max = Integer.valueOf(sc.nextLine());
                    new QLXeMay().searh(listXeMay, max, min);
                    break;
                case 4:
                    new QLXeMay().sort(listXeMay);
                    break;
                case 5:
                    System.out.print("nhap ma xe can xoa: ");
                    String maXe = sc.nextLine();
                    new QLXeMay().delete(listXeMay, maXe);
                    break;
                     case 7:
                    new QLXeMay().nhapTTXeSo(listXeSo);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("chuc nang ko ton tai");
            }

        } while (chucNang != 0);
    }
}

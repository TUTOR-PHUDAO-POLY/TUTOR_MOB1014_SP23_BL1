/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
//Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng:
//	1.Nhập thông tin đối tượng. Hỏi nhập tiếp hay không ?
//	2.In các thông tin ra màn hình
//	3.sắp xếp đồng hồ giảm dần theo kích thước
//	4. Xoá đồng hồ 
//	0.Thoát
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        QLDongHo ql = new QLDongHo();
        ArrayList<DongHo> listDongHo = new ArrayList<>();
        int chucNang = 0;
        new QLDongHo().fakeData(listDongHo);
        do {
            System.out.println("1.Nhập thông tin đối tượng. Hỏi nhập tiếp hay không ?");
            System.out.println("2.In các thông tin ra màn hình");
            System.out.println("3.sắp xếp đồng hồ giảm dần theo kích thước");
            System.out.println("4. Xoá đồng hồ ");
            System.out.println("0.Thoát ");
            System.out.print("moi ban nhap: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
//                   ql.nhapTT(listDongHo);
                    new QLDongHo().nhapTT(listDongHo);
                    break;
                case 2:
//                   ql.xuatTT(listDongHo);
                    new QLDongHo().xuatTT(listDongHo);
                    break;
                case 3:
                    new QLDongHo().sort(listDongHo);
                    break;
                case 4:
                    System.out.println("nhap dong ho: ");
                    String maDongHo = sc.nextLine();
                    new QLDongHo().delete(listDongHo, maDongHo);
                    break;
                case 0:

                    break;
                default:
                    System.out.println("chon sai moi ban nhap lai");
            }
        } while (chucNang != 0);
    }
}

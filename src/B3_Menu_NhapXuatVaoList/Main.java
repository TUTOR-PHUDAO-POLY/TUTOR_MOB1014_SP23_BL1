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
public class Main {
//    Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng:
//	1.Nhập thông tin Nguoi (sau khi nhập xong thông tin 1 Nguoi, hỏi có nhập tiếp hay không)
//	2.In thông tin ra màn hình
//	0.Thoát

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nguoi>list1 = new ArrayList<>();
        int chucNang = 0;
        do{
            System.out.println("1.Nhap thong tin nguoi");
            System.out.println("2.In thong tin");
            System.out.println("0.Thoat");
            System.out.println("Moi ban nhap");
            chucNang = Integer.valueOf(sc.nextLine());
            switch(chucNang){
                case 1:{
                    // Nhap 
                    // Cu phap : Goi 1 ham tu class bat ki :
                    // new ten Class Chua Ham Minh Can Goi (). ten Ham Minh Can GOi
                    new QLNguoi().nhapThongTinNguoi(list1);
                    break;
                }
                case 2:{
                    new QLNguoi().inThongTinNguoi(list1);
                    break;
                }
                case 0:{
                    break;
                }
                default:{
                    break;
                        }
            }
        }while(chucNang!=0);
    }
}

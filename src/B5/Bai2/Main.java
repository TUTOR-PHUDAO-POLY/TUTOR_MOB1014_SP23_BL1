/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author asus_vinh
 */
public class Main {
//    Tạo Class Main: trong hàm main() tạo menu lặp đi lặp lại tới khi chọn 0  và làm các chức năng:
//1.Thêm động vật (Sau khi thêm hỏi có muốn thêm tiếp hay ko? Y/N)
//	2.Hiển thị dsach động vật
//	4.Tìm động vật có tên bắt đầu là chữ “t"
//	5.Tạo class Meo kế thừa từ DongVat và thêm thuộc tính tiengKeu - 
//    String và các phương thức constructor, getter, setter
//            v à hàm inThongTin(): void. Nhập thông tin của mèo và hiển thị ra .
//                    Sử dụng constructor có tham số.
//	0.Thoát

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DongVat> listDongVat = new ArrayList<>();
        ArrayList<Meo> listMeo = new ArrayList<>();
        int chucNang = 0;
        new QLDongVat().fakeData(listDongVat);
        do {
            System.out.println("1.Thêm động vật (Sau khi thêm hỏi có muốn thêm tiếp hay ko? Y/N)");
            System.out.println("2.Hiển thị dsach động vật");
            System.out.println("3.Tìm động vật có tên bắt đầu là chữ t");
            System.out.println("4.Nhập thông tin của mèo và hiển thị ra .");
            System.out.println("0.Thoát");
            System.out.print("moi ban nhap chuc nang: ");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 1:
                    new QLDongVat().nhapTT(listDongVat);
                    break;
                case 2:
                    new QLDongVat().xuatTT(listDongVat);
                    break;
                case 3:
                    new QLDongVat().seach(listDongVat);
                    break;
                case 4:
                     new QLDongVat().nhapTTMeo(listMeo);
                    break;
               
                case 0:
                    
                    break;
                default:
                    System.out.println("nhap sai moi nhap lai");
            }
        } while (chucNang != 0);
    }
}

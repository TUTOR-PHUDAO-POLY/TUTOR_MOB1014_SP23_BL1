/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B1_OverviewLoop_IfElse;

import java.util.Scanner;

/**
 *
 * @author Phong
 */
public class Bai1 {

    // Viết chương trình nhập thông tin gồm: Tên, tuổi , địa chỉ, điểm và 
    //      trường học của bản thân. Sau đó, in ra tất cả thông tin đã nhập
    public static void main(String[] args) {
        System.out.println("Bài 1: Nhập xuất thông tin bản thân");

        // Nhập thông tin
        //  Tạo Đối tượng Scanner giúp 
        //  lấy ký tự người dùng nhập từ console
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập tên: "); // println = print + '\n'
        String ten = scanner.nextLine();
        System.out.print("Mời nhập tuổi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine(); // xóa dấu cách thừa sau khi nhập tuổi
        // ép kiểu: parseInt()

        System.out.print("Mời nhập địa chỉ: ");
        String diaChi = scanner.nextLine(); // diachi, DiaChi, home

        System.out.print("Mời nhập điểm: ");
        float diem = scanner.nextFloat();
        scanner.nextLine();
        System.out.print("Mời nhập trường học: ");
        String truongHoc = scanner.nextLine();

        // In thông tin
        System.out.println(" ========== ");
        System.out.println("Tên vừa nhập là: " + ten); // String + String = String
        System.out.println("Tuổi vừa nhập là: " + tuoi);
        System.out.println("Địa chỉ vừa nhập là: " + diaChi);

        System.out.println("Điểm vừa nhập là: " + diem);
        System.out.println("Trường học vừa nhập là: " + truongHoc);
    }
}

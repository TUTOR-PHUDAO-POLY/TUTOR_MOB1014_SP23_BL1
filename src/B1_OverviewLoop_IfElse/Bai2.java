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
public class Bai2 {
    
    // Viết chương trình nhập 2 số dương a và b.
    //     Tính tổng, hiệu, tích và thương. Sau đó, in kết quả ra màn hình
    public static void main(String[] args) {
        // Nhập 2 số
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số a: ");
        double a = scanner.nextDouble();
        System.out.print("Mời nhập số b: ");
        double b = scanner.nextDouble();
        
        // Tính toán
        double tong = a + b;
        double hieu = a - b;
        double tich = a * b;
        double thuong = a / b;
        
        // In kết quả
        System.out.println("Tổng = " + tong);
        System.out.println("Hiệu = " + hieu);
        System.out.println("Tích = " + tich);
        System.out.println("Thương = " + thuong);
    }
}

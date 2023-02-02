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
public class Bai3 {
    
    // Viết chương trình nhập số nguyên dương n (0 < n < 20). 
    //      Tính tổng các số CHẴN từ 1 -> n
    public static void main(String[] args) {
        // Nhập số nguyên dương n
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập số nguyên dương n: ");
        Integer n = sc.nextInt(); // int (kiểu nguyên thủy) = Integer (một lớp)
        
        // Tính tổng 1 -> n
        Integer tong = 0; // Khởi tạo biến tổng
        // Duyệt các số từ 1 -> n
        for(int i = 1; i <= n; i++) { // Với i = 0, i đến n - 1 
            if (i % 2 == 0) { // Nếu i chia 2 dư 0 <=> chia hết cho 2 <=> số chẵn
                tong = tong + i;
            }
            System.out.printf("Vòng %d: tổng = %d\n", i, tong);
        }
        
        // In ra kết qủa
        System.out.println("Tổng = " + tong);
    }
}

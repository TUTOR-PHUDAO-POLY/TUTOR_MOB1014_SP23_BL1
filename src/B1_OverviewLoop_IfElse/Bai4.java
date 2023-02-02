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
public class Bai4 {

    // Viết chương trình nhập số nguyên dương n.
    //  Tính tích các số lẻ từ 1 -> n
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("nhập số n: ");
            n = Integer.valueOf(sc.nextLine()); // ép kiểu
        } while (n <= 0);

        int tich = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                tich *= i;

            }

        }
        System.out.println("tich :" + tich);
    }
}

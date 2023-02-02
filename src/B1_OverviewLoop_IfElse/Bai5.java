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
public class Bai5 {
    
    // Viết chương trình nhập vào tháng 
    //  và in ra số ngày của tháng đó
    public static void main(String[] args) {
        // Nhập tháng
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập tháng: ");
        int thang = sc.nextInt();
        
        // In ngày của tháng đó
        System.out.println("Cách 1: Dùng if-else");
        if (thang == 2) {
            System.out.println("28 hoặc 29 ngày");
        } else if (thang == 1 
                || thang == 3
                || thang == 5
                || thang == 7
                || thang == 8
                || thang == 10
                || thang == 12
                ) {
            System.out.println("31 ngày");
        } else {
            System.out.println("30 ngày");
        }
        
        System.out.println("Cách 2: Dùng switch-case");
        switch(thang) {
            case 2: {
                System.out.println("28 hoặc 29 ngày");
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31 ngày");
                break;
            }
            default: {
                System.out.println("30 ngày");
            }
        }
    }
}

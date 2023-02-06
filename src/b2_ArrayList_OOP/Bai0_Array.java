/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_ArrayList_OOP;

/**
 *
 * @author Phong
 */
public class Bai0_Array {
    
    // Viết chương trình khởi tạo 1 mảng số nguyên 
    //      và in ra màn hình
    //  Ví dụ: 1,2,3,4,5
    public static void main(String[] args) {
        // Khai báo mảng số nguyên
        int[] mang;
        
        // Khởi tạo mảng có 5 phần tử
        mang = new int[5]; // cách 1
        mang = new int[] { 1, 2, 3, 4, 5 }; // cách 2
        
        // Duyệt mảng
        // Mảng chạy từ 0 đến mang.length - 1 <=> 0 ~ 4
        for(int i = 0; i < mang.length; i++) {
            System.out.printf("Phần tử tại vị trí %d = %d\n", 
                    i, mang[i]); 
        }
    }
}

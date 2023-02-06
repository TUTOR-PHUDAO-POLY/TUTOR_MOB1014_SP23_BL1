/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_ArrayList_OOP;

import java.util.ArrayList;

/**
 *
 * @author Phong
 */
public class Bai0_ArrayList {
    
    // Viết chương trình khởi tạo 1 danh sách số nguyên
    //      và in ra màn hình
    //  Ví dụ: 1,2,3,4,5
    public static void main(String[] args) {
        // Khai báo danh sách số nguyên
        ArrayList<Integer> danhSach;
        
        // Khởi tạo danh sách
        danhSach = new ArrayList();
        
        // Thêm giá trị vào danh sách
        danhSach.add(1);
        danhSach.add(2);
        danhSach.add(3);
        danhSach.add(4);
        danhSach.add(5);
//        danhSach.add("PhongTT35");
//        danhSach.add(4.9);
        
        // Duyệt danh sách
        for(int i = 0; i < danhSach.size(); i++) {
            System.out.println("Phần tử tại vị trí " + i 
                    + " = " + danhSach.get(i));
        }
    }
}

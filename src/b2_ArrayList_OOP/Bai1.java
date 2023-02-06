/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_ArrayList_OOP;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Phong
 */
public class Bai1 {
    
    // Viết chương trình nhập 1 danh sách SỐ NGUYÊN từ bàn phím (1đ)
    //  1. In ra số phần tử của danh sách (1đ)
    //  2. In danh sách vừa nhập ra Console (1đ)
    //  3. Tìm giá trị nhỏ nhất trong danh sách và in ra (3đ)
    //  4. In ra vị trí của phần tử nhỏ nhất trong danh sách (2đ)
    //  5. Sắp xếp danh sách tăng dần (2đ)
    public static void main(String[] args) {
        // Khởi tạo danh sách SỐ NGUYÊN
        ArrayList<Integer> danhSach = new ArrayList();
        
        // Fix sẵn dữ liệu thay vì nhập
        //  nhập để về nhà làm
        danhSach.add(3);
        danhSach.add(7);
        danhSach.add(1);
        danhSach.add(0);
        danhSach.add(2);
        
        // 1. In ra số phần tử của danh sách
        System.out.println("1. Số lượng phần tử = " + danhSach.size());
        
        // 2. In danh sách vừa nhập ra Console (1đ)
        System.out.println("2. Danh sách phần tử: ");
        for(int i = 0; i < danhSach.size(); i++) {
            System.out.printf("Phần tử tại vị trí %d = %d\n", 
                    i, danhSach.get(i));
        }
        
        // 3. Tìm giá trị nhỏ nhất trong danh sách và in ra
        // ...
        
        // 4. In ra vị trí của phần tử nhỏ nhất trong danh sách
        // ...
        
        // 5. Sắp xếp danh sách giảm dần
        System.out.println("5. Sắp xếp danh sách: ");
        Collections.sort(danhSach); // mặc định sắp xếp tăng dần
        Collections.reverse(danhSach); // đảo ngược lại sẽ được giảm dần
        for(int i = 0; i < danhSach.size(); i++) { // danhSach.size() = độ dài
            System.out.printf("Phần tử tại vị trí %d = %d\n", 
                    i, danhSach.get(i)); // danhSach.get(i) lấy phần tử tại i
        }
    }
}

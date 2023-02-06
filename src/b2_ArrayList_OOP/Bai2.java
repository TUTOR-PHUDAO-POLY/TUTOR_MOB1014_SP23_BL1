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
public class Bai2 {
    
    // Viết chương trình khởi tạo đối tượng Sinh Viên gồm
    //  Mã, Họ tên, Năm sinh, Chuyên ngành, Điểm trung bình
    public static void main(String[] args) {
        // Khởi tạo và gán giá trị cho đối tượng
        SinhVien svA = new SinhVien(); // Khởi tạo đối tượng
        svA.setMa("PH12345"); // gán mã cho A
        svA.setTen("Nguyễn Văn A"); // gán tên cho A
        svA.setNamSinh(2004); // gán năm sinh cho A
        svA.setChuyenNganh("Lập trình"); // gán chuyên ngành cho A
        svA.setDiemTrungBinh(4.9); // gán điểm TB cho A
        
        System.out.println("Sinh viên A");
        svA.display();
        
        System.out.println(" ============= ");
        
        // Khởi tạo Sinh viên Trần Tuấn Phong có mã là PH54321
        //  chuyên ngành Phát triển Phần mềm, sinh năm 2005
        //  điểm trung bình là 7.94
        SinhVien svP = new SinhVien(); // Khởi tạo đối tượng
        svP.setMa("PH54321"); // gán mã cho A
        svP.setTen("Trần Tuấn Phong"); // gán tên cho A
        svP.setNamSinh(2009); // gán năm sinh cho A
        svP.setChuyenNganh("PTPM"); // gán chuyên ngành cho A
        svP.setDiemTrungBinh(7.94); // gán điểm TB cho A
        
        System.out.println("Sinh viên P");
        svP.display();
    }
}

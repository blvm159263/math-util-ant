/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vanminh.mathutil.core;

/**
 *
 * @author Lenovo
 */
// ta sẽ clone class Math của JDK
// Class của ta viết sẽ cung cap các ham/mehtod tiện ích dùng chung cho nhiều nơi khác nhau
// Thường cái gì mà là tiện ích/tool dùng chung cho các nơi thì nó sẽ được thiết kế là STATIC
public class MathUtil {

    public static final double PI = 3.141592653589793;

    // hàm tiện ích dùng chung tính giai thừa
    // quy ước n! = 1.2.3...n
    // không tính giai thừa số âm
    // 0! = 1! = 1
    // 21! cực kì to, vượt quá 18 số 0 => tràn kiểu long
    // ta quy ước không tính 21! trở lên vì tràn long
    public static long getFactorial(int n) {
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");

        if (n == 0 || n == 1)
            return 1;
    
        long product = 1; // initiate = 1
                          // biến acc - accumulation - tích lũy/góp dần/nhân dồn/con heo đất  
                          
        for (int i = 2; i <= n; i++)
            product *= i;
        
        return product;
    }

}
    
// KĨ THUẬT TDD - TEST DRIVEN DEVELOPMENT - DÀNH CHO DEVELOPER
// LÀ KĨ THUẬT LẬP TRÌNH MÀ KHI VIẾT CODE PHẢI VIẾT LUÔN CÁC BỘ KIỂM THỬ - TEST CASE ĐỂ KIỂM TRA NGAY
// CODE CỦA MÌNH VIẾT ĐÚNG HAY SAI
// LÀ KĨ THUẬT LẬP TRÌNH VIẾT CODE SONG SONG VỚI VIẾT CÁC TEST CASE
// KĨ THUẬT LẬP TRÌNH NÀY GIÚP CODE LIÊN TỤC ĐƯỢC KIỂM TRA XEM CÓ CHẠY ĐÚNG HAY KHÔNG
// NẾU TA XÀI TDD, NÓ GIÚP TA ĐI VÀO QUY TRINH CI - CONTINUOUS INTEGRATION

// ĐỂ LÀM TDD TA:
// 1. VIẾT PHÁC THẢO PROTOTYPE CỦA HAM/METHOD/CLASS
// 2. VIẾT CÁC BỘ KIỂM THỬ - TEST CASE LÀ CÁC ĐOẠN CODE BỔ SUNG THÊM NHƯNG LÀ CODE ĐỂ XÀI CÁI HÀM VỪA VIẾT,
//    ĐỂ CHECK XEM HÀM VỪA VIẾT CÓ ỔN KHÔNG
// 3. CHẠY THỬ HÀM VỪA VIẾT VỚI BỘ TEST CASE VỪA TẠO, XEM TÌNH HÌNH ĐÚNG SAI RA SAO
//  SAI -> REFRACTOR, SỬA CODE
//  ĐÚNG -> HOÀN THIỆN TIẾP CODE KHÁC
// 
package com.vanminh.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.vanminh.mathutil.core.MathUtil.*;

@RunWith(value = Parameterized.class)
public class MathUtillDDTTest {

    //chuận bị data màng 2 chiều vì có n đưa vào và exp
    // và có nhìu cặp như thế [7][2]
    @Parameterized.Parameters
    public static Object[][] initData() {
        int a[] = {5, 10, 15, 20, 25};
        int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
        int c[][] = {{1, 0},
                     {1, 1},
                     {2, 2},
                     {6, 3},
                     {24, 4},
                     {120, 5},
                     {720, 6}
                    };
        return new Integer[][] {{1, 0},
                                {1, 1},
                                {2, 2},
                                {6, 3},
                                {24, 4},
                                {120, 5},
                                {720, 6}
                                };
    }
    
    //sau khi có bộ data qua mảng 2 chiều JUnit nó sẽ tự lặp
    //lấy ra từng cặp data vào trong hàm đê so sánh
    // nhồi bằng cách nào ?
    // gắn vào biến - THAM SỐ HÓA PARAMETERIZE
    //ta sẽ map 2 cột ứng với 2 biến
    
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    //test hoi vì đã có các test case và data
    
    @Test
    public void testFactorialGivenRightArgumentReturnWells(){
        assertEquals(expected, getFactorial(n));
    }
}

//CLASS NÀY SẼ CHỨA CODE DÙNG ĐỂ TEST CODE CHÍNH BÊN CLASS MATHUTILL
//test hàm getF() coi hàm chạy đúng k
//code viết ra dùng để test các code khác, class khác
//thì class này dc gọi tên là test script
//Trong test script sẽ có những tình huống sài app
//đưa data vào và xem hàm có xử lý tình huống như kì vọng k
//test script sẽ ứng với mỗi test case
//mỗi test case sẽ ứng với 1 tình huống sài hàm
//Phân tích test script cũ(e ngày hôm kia) trong test script cũ xuất hiện BAD SMELL( trùng lặp về câu lênh)
//lênh gọi hàm dc lặp đi lặp lại với mỗi bộ test case
//cũng là hàm này nhưng nó phải viết lại cho các bộ data sau
//Exp           n
//1             0
//1             1
//2             2
//6             3
//24            4
//120           5
//720           6
//...
//[7][2]
//Có cách nào thay 2 con số trong lệnh so sánh là ??? nào đó
//Nếu ta tách dc toàn bộ data trong lệnh so sánh ở trên ra 1 lệnh riêng biệt
//sau đó ta chỉ việc pick data này nạp dần vào cái lênh gọi hàm thì ra sẽ đạt dc
//=> code gọn gàng hơn k bị trùng lặp
// Biết dc có bn test case, đủ hay chưa
// Kĩ thuật viết test script mà tách biệt data ra khỏi lệnh so sánh dc gọi bằng những tên sau
//Parameterized - biết data ra 1 chỗ rồi đặt cho chúng cái tên rồi nhồi chúng trở lại
//DDT - Data-Driven testing - viết code kiểm thử theo style tách data
//Framework hỗ trợ sẵn ta tách data, duyệt vòng for trên data nhồi vào hàm tương ứng
// để chơi với DDT, ta cần
//tách data ra từng mảng
// Map cái data này vào các biến tương ứng và nhồi các biến tương ứng này vào các câu lênh so sánh/gọi hàm.

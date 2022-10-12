
package com.vanminh.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

public class MathUtillTest {
    
    //Kiểm thử tình huống cà chớn đưa data vào cà chớn thì nhận về cú tát exception
    //hàm getF() dc thiết kế để
    //nếu đưa vào n tử tế -> phải đưa ra n! tử tế
    // nếu đưa n cà chớn n < 0 || n > 20 
    //chửi và ném ra exception/illegalargumentexception
    //bây giờ nếu tui đưa -5 cho hàm tui nhận về gì?? ngoại lệ
    //thấy ngoại lẹ thì mừng rơi nuốc mắt
    //thấy ngoại lệ như kì vọng ở -5!-> viết code đúng rồi - màu xanh
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException(){
        //Test case 7:
        //n = -5; hy vọng bị vả vào mặt exception
        //hk sài assertEquals vì nó dùng cho các giá trị cụ thể 
        //còn ngoại lệ là 1 thứ đo lường = các m có xuất hiện ngoại lệ hay k
        MathUtil.getFactorial(-5);//ngoại lệ cầm chắc trong tay
        //nhưng phải dòm coi m có hiện nguyên hình k 
    }
    
    
    @Test
    public void testFactorialGivenRightArgumenReturnsWell2(){
        //test case #4
        //n=3 hi vọng exp trả về 6, thực tế act = mấy
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        //test case #5
        //n=4 hi vọng exp trả về 24, thực tế act = mấy
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //test case #6
        //n=5 hi vọng exp trả về 120, thực tế act = mấy
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
    @Test
    public void tryAssertion(){
        Assert.assertEquals(100, 100);
    }
    
    @Test  //quy tắc đặt tên hàm kiểm thử phải mang ý nghĩa của các test case mình muốn test - Coding convention
    public void testFactorialGivenRightArgumenReturnsWell(){
        //test case #1 - tình huống kiểm thử sài hàm getF() đầu tiên
        //n=0, 0! exp = 1, act là mấy
        // gọi hàm chạy mới biết dc
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        // phải so sánh 2 giá trị này - dùng framework, hok sài sout()
        Assert.assertEquals(expected, actual);
        
        
        //test case #2
        //n=1 hi vọng exp trả về 1, thực tế act = mấy
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        //test case #3
        //n=2 hi vọng exp trả về 2, thực tế act = mấy
        Assert.assertEquals(2, MathUtil.getFactorial(2));
      
    }
    
}
//trong calss này chứa cái gì???
//class này chứa các đoạn code cdung2 để test code chính ở bên thư mục
//source package
//Các đoạn code ở đây sẽ dùng để test hàm getFactorial()
//nhưng đoãn code ở trong thư mục này do dev viết ra dùng để test chính cái code
//ở bên thư mục source để đảm bảo rằng các hàm.class biết ra phải chạy đúng
//gọi là test script

//các test script này sẽ có lệnh cơ bản: so sanh exp với act

//nhưng đoạn code này ko dùng lênh sout() truyền thống mà dùng thư viện đặc biệt
//khi hàm sai, ném ra màu đỏ
//khi hàm đúng thì ea màu xanh
//các thư viện giúp thấy màu xanh đỏ để kết luận hàm đúng sai
//lúc này chỉ cần nhìn màu mà ko cần xem chi tiết các dòng sa sánh như bên main
//bộ thư viện này còn gọi là UNIT TEST FRAMEWORK
//mỗi ngôn ngữ đề dó thư viện để test hàm của mình

//Ví dụ:
//Java: JUnit,TestNG
//C#: xUnit,NUnit,MSTest
//PHP: phpUnit
//Js:...


//Google gõ: Unit Test framework for ... NNLT ra tên...

//@Test dc gọi là 1 cái flag - ANNOTATION
//để nó bào hiệu cho thư viện JUnit biết cần generate hàm đi kèm @Test
//biến hàm này thành hàm main() và gửi main() này cho JVM - JAVA VIRTUAL MACHINE
//biết để chạy
//nếu kh có @test chả có hàm main() nào dc generate - no runable test
//việc xài thư viện mà bị ép phải làm những gì đó,theo quy tắc gọi là framework

//Chốt deal xanh đỏ
//nếu việc chạy test case ra màu xanh khi và chỉ khi tất cả đều xanh
//xanh_ khi tất cả các test case cùng xanh

//đỏ: chỉ cần 1 thg trong test case đỏ, tất cả đỏ

//Logic: hàm nếu đã đúng thì phải đúng với tất cả các test case đã dc liệt kê ra
//hàm ngon với các case đã test
//cố gắng liệt kê đủ case là tốt nhất
//NL số 2

//Chốt deal 2
//khi ra màu xanh tổn thì hàm ổn với các test case
//khi ra hàm đỏ nghĩa là có ít nhất 1 việc so sánh exp !- act
//màu đỏ vỉ lý do gì
//do act trả về kh đúng như kì vọng -> bug
// do exp mình tính toán kh đúng - QC bị ngáo


package com.hvpexe.mathutil.core;

import static org.junit.Assert.*;
import org.junit.Test;

public class MathUtilTest {
    
    //hàm getF() dc thiết kế trả về con long nếu n đưa vào 0..20
    //hàm getF() đc thiết kế NÉM RA EXCEPTION NẾU TA ĐƯA VÀO N < 0 || N>20
    //tức là nếu gọi getF(-5) thì CHỖ GỌ SẼ NHẬN VỀ EXCEPTION TÊN LÀ
    //IllegalArgumentException
    //đưa cà chớn, nhận ngoại lệ!!!
    //bắt xem hàm mình có đúng ném ngoai lệ hay ko nếu data cà chớn
    //THẤY NGOẠI LỆ MỪNG RƠI NƯỚC MẮT
    @Test(expected = Exception.class)
    //vietsub" lho chạy hàm này, kiểm tra giùm xem có 1
    //noại lệ thuộc nhóm/class IllegalArgumentException xh hay ko
    //nó xh = cách có đc new IllegalArgumentException ở đâu đó
    //nếu có xh, mừng quá ,đúng như thiết kế, MÀU XANH
    //kÌ VỌNG MÀY XH, DÙ MÀY LÀ EXCEPTION, VÀ MÀY XH THẬT, MÀU XANH
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
    @Test
    public void TestFactorialGivenRightArgumentReturnsWell2() {
        //Test case #4: n = 3; 3! expected = 6?
        assertEquals(6, MathUtil.getFactorial(3));

        //Test case #4: n = 4; 4! expected = 24?
        assertEquals(24, MathUtil.getFactorial(4));

        //Test case #4: n = 5; 5! expected = 120?
        assertEquals(120, MathUtil.getFactorial(5));

        //Test case #4: n = 6; 6! expected = 720?
        assertEquals(720, MathUtil.getFactorial(6));

    }

    @Test //tên hàm test bao hàm luôn ý nghĩa test cái gì
    //quy ước dân kiểm thử
    //hàm này tui muốn test hàm giai thừa khi đưa tham số đúng
    //mày phải trả về đúng
    //viết cde phải theo quy tắc - CODING CONVENTION
    public void TestFactorialGivenRightArgumentReturnsWell() {
        //test case #1: kiểm thử tình huống 0! coi có đúng hem?
        //n = 0, hy vọng hàm ói về expected=1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        long expected = 1;
        long actual = MathUtil.getFactorial(0); //gọi hàm để xem actual là mấy
        //so sánh 2 giá trị coi tương đồng ko? có đúng, ko bug
        //so sánh = sout() và dúng mặt để luận kết quả, XƯA RỒI
        //chơi màu mới ngầu
        assertEquals(expected, actual);

        //Test case #2: kiểm thử tình huống 1! coi có đúng hem?
        // n = 1, hy vọng hàm ói về expected = 1; actual thực tế
        //hàm chạy trả ra mấy, đoán xem???
        expected = 1;
        actual = MathUtil.getFactorial(1);
        assertEquals(expected, actual);

        //Test case #3: n = 2; 2! expected = 2?
        assertEquals(2, MathUtil.getFactorial(2));
    }

    @Test
    public void trỵUnitFirst() {
        assertEquals(69, 69);
    }
}

//CLASS NÀY TA VIẾT CÁC ĐOẠN CODE NHƯ BÌNH THƯỜNG
//NHƯNG CODE NÀY DÙNG ĐỂ TEST CODE CHÍNH BÊN MATHUTIL
//VIẾT CODE ĐỂ TEST CODE CHÍNH, THÌ CẤI ĐOẠN CODE TEST NÀY ĐC GỌI
//TÊN À TEST SCRIPT
//TEST SCRIPT LÀ NHỮNG ĐOẠN CODE ĐC VIẾT RA ĐỂ TEST CODE KHÁC, CODE CHÍNH 
//những đoạn code này sẽ gọi cac hàm bên code chính, so sánh giá trị
//trả về của hàm chính cần test với giá trị kì vọng
//Những đoạn code này/test script này sẽ PHẢI BAO GỒM CÁC TEST CASE BÊN TRONG
//TEST SCRIPT CHỨA CÁC TEST CASE
//TRONG TEST SCRIPT/CLASS NÀY SẼ CÓ TEST 5! 6! 7! -5! => TEST CASE

//@Test @ đc gọi là ANNOTATION, kí hiệu, flag để đánhh dấu đoạn code
//mang 1 ý nghĩa nào đó. Và khi biên dịch/compile code thì
//thư viện đi kèm nó sẽ tự động generate theme code chi mình tùy theo @
//VD @Test thì thư viện JUnit này import nó sẽ ngầm ngầm tự generate
//hàm này thành public static void main() và gửi main() cho JVM
//Kĩ thuật dùng thư viện, bị ép phải theo cú pháp của nó qua những
///@, thư viện này gọi là FRAMEWORK
//FW: là thư viện, những file .jar .dll chứa 1 đống class bên trong
//ép ta phải xài theo cách của nó, theo dàn khung code mà nó quy ước
//dàn khung, template, ta điền nốt code vào chỗ trống
//Thư viện = library, những file .jar .dll chứa 1 đống class bên trong
//ta thoải mái dùng hàm của nó theo cách của ta
//1 thằng gây sai cho tất cả
//lý do: hàm đã dudnsg thì phải đúng hết cho các case đã đc nêu ra
// chỉ càn 1 sự ko == nhau của actual với expected, hàm ko 
// ổn định về kết quả trả về => sai
//ko thể test hết các case (NL2) NHƯNG ĐÃ TEST CASE NÀO THÌ PHẢI NGON
//XANH CASE ĐÓ!!
//NÓI THÊM VỀ MÀU ĐỎ:
//ĐỎ XẢY RA KHI: CÓ 1 SỰ KO BẰNG NHAU CỦA EXPECTED VÀ ACTUAL
//LÝ DO GÌ EXPECTED != ACTUAL
//CÓ 2 LÝ DO
//LD1: EXPECTED ĐÚNG, MÌNH TÍNH BÊN NGOÀI , = TAY KHI CHƯA CÓ HÀM
//      ACTUAL SAI, TÌNH HUỐNG NÀY HÀM CÙI BẮP, BUG BUG
//LD2: EXPECTED SAI, VỨT LUÔN TEST CASE NÀY ĐI, ANH CHÀNG QC/DEV BỊ NGÁO
//KÌ VỌNG MÀ SAI, HY VỌNG GÌ Ở ACTUAL


//DDT - data driven testing
//tách bộ data kiểm thử ra 1 chỗ
//lát hồi nhồi/nạp/fill/điền/feed data này tuần tự vào chỗ kiểm thử
//VD tách data đã kiểm thử ở trên thành
//1     0
//1     1
//2     2
//6     3
//24    4
//120   5
//720   6
//thay vì lênh so sánh, gọi viết cho từng case, ta biến lệnh này 
//trở thành tổng quát , ko điền data cụ thể, mà sẽ lấy từ đâu đó

//        assertEquals(???, MathUtil.getFactorial(???));
//??? này sẽ lấy từ tập data ở trên
//code gọn hơn, đẹp hơn, dễ bảo trì hơn, kiểm soát đc đủ thiết các case
//kĩ thuật tách code test ra khỏi data của nó. lát hồi fill lại sau
//đc GỌI LÀ KĨ THUẬT VIẾT TEST CASE THEO KIỂU THAM SỐ HÓA
//                                      PARAMETERIZED
//HOẶC CÒN GỌI LÀ                       DDT = DATA DRIVEN TESTING
//VIẾT KIỂM THỬ HƯỚNG VỀ TÁCH DATA RIÊNG RA!!!

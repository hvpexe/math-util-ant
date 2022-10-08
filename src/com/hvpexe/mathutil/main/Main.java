/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hvpexe.mathutil.main;

import com.hvpexe.mathutil.core.MathUtil;

/**
 *
 * @author PhuHV
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This message comes from the main() method");
        tryTDDFirst();
    }
    
    public static void tryTDDFirst() {
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        //so sánh 2 giá trị để hàm viết đúng hay ko???
        //3 thứ này tổ hợp 1 thứ gọi là test case - tình huống xài hàm/xài app 
        System.out.println("0! status | Expected = " + expected +
                " | Actual = " + actual);
        
        
    }
    
}

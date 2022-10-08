package com.hvpexe.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

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
        {720, 6}};

        return new Integer[][]{{1, 0},
        {1, 1},
        {2, 2},
        {6, 3},
        {24, 4},
        {120, 5},
        {720, 6}};
    }

    //ta phải map 2 cột của từng dòng vào 2 dấu ? của hàm so sánh
    //  assertEquals(???, MathUtil.getFactorial(???));
    //  assertEquals(cot = 0, MathUtil.getFactorial(cot = 1));
    //map value từ mảng vào 2 biến, nhồi 2 biến này vào hàm so sánh!!!
    @Parameterized.Parameter(value = 0)
    public long expected; // map vào cột 0

    @Parameterized.Parameter(value = 1)
    public int n; //map vào cột-1
    
    @Test //fill data va goi ham so sanh
    public void testFactorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}

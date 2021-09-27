/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhung.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author ASUS
 */
@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    // ta viet ki thuat mới, tách data ra hẳn các lệnh ktra hàm
    // data này ta có thể đặt ở file.txt, cvs,excel
    //input và putput/expected là những cặp
    //nhiều cắp cần phải test, do đó data để test hàm là mảng 2 chiều
    // mảng 2 chiều này sẽ đc nạp từ fite.txt
    // hoặc ta tạo luôn 1 mảng 2 chiều ngày đây
    @Parameters
    public static Object[][] initData(){
        return new Integer[][] {
                                {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                
                };
     }
    // ta cần map 2 cột vào 2 biến để lát feed chúng vào
    //hàm checkFactorial , ta gọi là tham số hóa 
    //parameterized testing
    @Parameter(value = 0 )//map cột 0 của data
    public int input;
    @Parameter(value = 1)
    public long expected;
    @Test
   public void checkFactorialGivenRightArgumentReturnWell(){
      
        Assert.assertEquals(expected, MathUtil.getFactorial(input));
   }
    
}

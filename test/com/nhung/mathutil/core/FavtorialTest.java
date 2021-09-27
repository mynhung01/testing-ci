/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhung.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ASUS
 */
public class FavtorialTest {
    
   @Test
   public void checkFactorialGivenRightArgumentReturnWell(){
       
       long expected = 120;
       long actual = MathUtil.getFactorial(5);
       Assert.assertEquals(expected, actual);
       Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
   }
   
  
   @Test(expected = IllegalArgumentException.class)
   public void checkFactorialGivenWrongArgumentThrowsException(){
        //ta ko dùng hàm assertEqual
        //ngoại lệ chỉ có thể thấy nó xh hay ko ?
       MathUtil.getFactorial(-5);
   }
   //nếu ngoại lệ thì vẫn có màu xanh
   
}
   
   

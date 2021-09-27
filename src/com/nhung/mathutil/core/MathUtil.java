/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhung.mathutil.core;

/**
 *
 * @author ASUS
 */
public class MathUtil {
     public static long getFactorial(int n){
        if(n<0 || n>20)
            throw new IllegalArgumentException("n must between 0 .. 20");
        if( n == 0 || n == 1)
            return 1;
        
        
         long product = 1;
         for (int i = 2; i <= n; i++) 
             product *= i;
         
         return product;
    }
}
// quy uoc xanh do
//1.Xanh tat ca tinh huong so sanh xai ham phai cung xanh
//2. Do , chỉ cần 1 tình huống xài hàm bị đỏ ,coi như cả hàm đỏ

//check xem có xuất hiện ngoại lệ hay không 
   // khi đưa data cà chướn 

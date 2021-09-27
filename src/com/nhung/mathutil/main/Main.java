/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nhung.mathutil.main;

import com.nhung.mathutil.core.MathUtil;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("0!= 1?"+ MathUtil.getFactorial(0) );
        System.out.println("1!= 1?"+ MathUtil.getFactorial(1) );
        System.out.println("2!= 2?"+ MathUtil.getFactorial(2) );
        System.out.println("3!= 6?"+ MathUtil.getFactorial(3) );
         
    }
}
//TDD - Test Driven Development
//Test First Development
//Khi viết code ta phải lưu ý ngay viết test case/ tình huống test


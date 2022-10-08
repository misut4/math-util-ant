/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.misuta.mathutil.core;

import java.util.Scanner;

/**
 *
 * @author admin
 */
// clone math util of jdk
// emulate functions of math util class
public class MathUtil {

    public static final double PI = 3.141592653589793;

    //n! = 1.2.3 ... n
    //cant get to negative
    //0! = 1! = 1
    //21! has more than 18 0s, must be long
    //only accept 0< .. <20
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n *(0 .. 20)");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product = product * i;
        }
        
        return product;
    }

    //Test Driven Development - TDD
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.misuta.mathutil.main;

import com.misuta.mathutil.core.MathUtil;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("main()");
        tryTDDFirst();
    }
    
    public static void tryTDDFirst() {
        //comparing expected with actual values
        
        //case 1: 0!
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        System.out.println("0! status| Expected = " + expected 
                                    + " | Actual= " + actual);
        
        //case 2: 1!
        expected = 1;
        actual = MathUtil.getFactorial(1);
        System.out.println("1! status| Expected = " + expected 
                                    + " | Actual= " + actual);
        
        //case 3: 2!
        System.out.println("2! status| Expected = " + 2 
                                    + " | Actual= " + MathUtil.getFactorial(1));
    }
    
}

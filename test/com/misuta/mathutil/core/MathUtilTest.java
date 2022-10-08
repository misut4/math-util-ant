/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.misuta.mathutil.core;

//import org.junit.jupiter.api.Test;
import org.junit.Assert;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author admin
 */
public class MathUtilTest {

    //IF ONE CASE IS WRONG, NONE IS ALLOWED TO PASS
    
    
    //getFactorial was designed to return a long value if in 0..20 range
    //and will throw an exception if within outerbound 0..20
    //=> IllegalArgumentException
    @Test(expected = IllegalArgumentException.class) 
    //check if function throws an exception within the called exception class
    public void testFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        //case 5: 4! => expected = 24 | n = 4
        Assert.assertEquals(24, MathUtil.getFactorial(4));

        //case 6: 5! => expected = 120 | n = 5
        Assert.assertEquals(120, MathUtil.getFactorial(5));

        //case 7: 6! => expected = 720 | n = 6
        Assert.assertEquals(720, MathUtil.getFactorial(6));

    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        //case 1: 0! => expected = 1 | n = 0
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual); // comparing!

        //case 2: 1! => expected = 1 | n = 1
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);

        //case 3: 2! => expected = 2 | n = 2
        expected = 2;
        actual = MathUtil.getFactorial(2);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void tryJUnitFirst() {
        Assert.assertEquals(69, 69);
    }

}

//this class can be used to be coded normally
//but used for testing
//is called test script
//mainly used for comparing expected and actual values
//test script (1 - many) test cases
//==============================================================================
//Framework: is a library, contains .jar, .dll in which contains classes
//=> forces dev to follow protocal
//==============================================================================
//Library: contains .jar, .dll in which contains classes
//=> free to call 

//DDT: Data Driven Testing  [|]  TDD: Test Driven Development
//separate data into an excluded area
//then feed data accordingly instead of calling each case
//Assert.assertEquals( ??? , MathUtil.getFactorial( ??? ));
//=> clean => easy to maintain, reduce risk of excluded test case


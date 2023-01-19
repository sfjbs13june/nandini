package com.nandini.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorControllerTest {

    @Test
    public void addTest(){
        CalculatorController calculatorController=new CalculatorController();
        double result=calculatorController.add(10,5);
        Assertions.assertEquals(result,15);
    }

    @Test
    public void subTest(){
        CalculatorController calculatorController=new CalculatorController();
        double result=calculatorController.sub(10,5);
        Assertions.assertEquals(result,5);
    }

    @Test
    public void mulTest(){
        CalculatorController calculatorController=new CalculatorController();
        double result=calculatorController.mul(10,5);
        Assertions.assertEquals(result,50);
    }

    @Test
    public void divTest(){
        CalculatorController calculatorController=new CalculatorController();
        double result=calculatorController.div(10,5);
        Assertions.assertEquals(result,2);
    }
}

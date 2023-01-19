package com.nandini.app.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperationControllerTest {

    @Test
    public void addTest(){
        OperationController operationController=new OperationController();
        long result=operationController.add(6,4);
        Assertions.assertEquals(result,10);
    }

    @Test
    public void subTest(){
        OperationController operationController=new OperationController();
        long result=operationController.sub(6,4);
        Assertions.assertEquals(result,2);
    }

    @Test
    public void mulTest(){
        OperationController operationController=new OperationController();
        long result=operationController.mul(6,4);
        Assertions.assertEquals(result,24);
    }
}

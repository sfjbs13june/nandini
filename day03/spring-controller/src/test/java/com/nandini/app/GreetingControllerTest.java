package com.nandini.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class GreetingControllerTest {

    GreetingController GreetingController=new GreetingController();

    @Test
    public void testSayGreet(){
        String expectedResult= "Greet from App";
        String result=GreetingController.SayGreet();
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayWelcome(){
        String expectedResult= "Welcome from App";
        String result=GreetingController.SayWelcome();
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayHi(){
        String expectedResult= "Hi from App";
        String result=GreetingController.SayHi();
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayThanks(){
        String expectedResult= "Thanks from App";
        String result=GreetingController.SayThanks();
        Assert.assertEquals(expectedResult,result);
    }

}


package com.nandini.app;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testSayWelcome(){
        String expectedResult= "welcome from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayWelcome();
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSayHello(){
        String expectedResult= "hello from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayHello();
        Assert.assertEquals(expectedResult,result);
    }
    @Test
    public void testSayBye(){
        String expectedResult= "bye from greeting";
        Greeting greeting =new Greeting();
        String result= greeting.sayBye();
        Assert.assertEquals(expectedResult,result);
    }
}
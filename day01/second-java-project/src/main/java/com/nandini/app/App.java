package com.nandini.app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args)
    {
        Greeting greeting = new Greeting();
        String a = greeting.sayWelcome();
        System.out.println(a);
        String b = greeting.sayHello();
        System.out.println(b);
        String c = greeting.sayBye();
        System.out.println(c);
    }
}
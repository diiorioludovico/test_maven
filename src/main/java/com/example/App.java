package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App.add(2,3);
        App.product(2,3);

    }

    public static Integer add(Integer a, Integer b) {
        return a + b;
    }

    public static Integer product(Integer a, Integer b) {
        return a * b;
    }       
}

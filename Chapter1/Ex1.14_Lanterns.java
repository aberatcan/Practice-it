/*
Write a complete Java program in a class named Lanterns that generates the following three figures of output. Use static methods to show structure and eliminate redundancy in your solution.

In particular, make sure that main contains no System.out.println statements, that any System.out.println statement(s) repeated are captured in a method that is called just once, and that the same System.out.println statement never appears in two places in the code.

    *****
  *********
*************

    *****
  *********
*************
* | | | | | *
*************
    *****
  *********
*************

    *****
  *********
*************
    *****
* | | | | | *
* | | | | | *
    *****
    *****


*/
public class Lanterns{
    public static void main(String[]args){
        top();space();top();line();full();top();space();top();half();line();line();half();half();
    }
    public static void top(){
        System.out.println("    *****\n  *********\n*************");
    }
    public static void line(){
        System.out.println("* | | | | | *");
    }
    public static void full(){
        System.out.println("*************");
    }
    public static void half(){
        System.out.println("    *****");
    }
    public static void space(){
        System.out.println();
    }
    
}

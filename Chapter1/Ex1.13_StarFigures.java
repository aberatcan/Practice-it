/*
Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *

 */
 public class StarFigures{
    public static void main(String[]args) {
        doubleLine();
        star();
        System.out.println();
        doubleLine();
        star();
        doubleLine();
        System.out.println();
        line();
        doubleLine();
        star();
    }
        
        
    public static void doubleLine(){
        System.out.println("*****\n*****");
    }
    public static void star(){
        System.out.println(" * *\n  *\n * *");
    }
    public static void line(){
        System.out.println("  *\n  *\n  *");
    }
                         

}

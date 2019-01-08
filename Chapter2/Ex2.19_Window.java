/*
Write a Java program in a class named Window that produces the preceding figure
 as output. Use nested for loops to print the repeated parts of the figure.
 Once you get it to work, add one class constant to your program so that the
 size of the figure can be changed simply by changing that constant's value. The
  example output shown is at a constant size of 3, but if you change the
  constant, the figure should grow larger and wider proportionally.

+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
|   |   |
|   |   |
|   |   |
+===+===+
(You must solve this problem using only ONE public static final constant, not
 multiple constants; and its value must be used in the way described in this
 problem.)

 */

 public class Window{
    public static final int SIZE=3;
    public static void main(String[]args){
       for(int p=1;p<=2;p++){
        System.out.print("+");
        for(int a=1;a<=SIZE;a++){
            System.out.print("=");
        }
        System.out.print("+");
        for(int b=1;b<=SIZE;b++){
            System.out.print("=");
        }
        System.out.println("+");

        for(int i=1;i<=SIZE;i++){
            System.out.print("|");
            for(int c=1;c<=SIZE;c++){
                System.out.print(" ");
            }
            System.out.print("|");

            for(int c=1;c<=SIZE;c++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
       }
       System.out.print("+");
       for(int a=1;a<=SIZE;a++){
           System.out.print("=");
       }
       System.out.print("+");
       for(int b=1;b<=SIZE;b++){
           System.out.print("=");
       }
       System.out.println("+");
    }
}

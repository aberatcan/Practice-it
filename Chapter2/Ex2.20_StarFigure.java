/*
Write a program in a class named StarFigure that produces the following output using for loops.

////////////////\\\\\\\\\\\\\\\\
////////////********\\\\\\\\\\\\
////////****************\\\\\\\\
////************************\\\\
********************************

*/

public class StarFigure{
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            for(int a=1;a<=-4*i+20;a++){
                System.out.print("/");
            }
            for(int b=1;b<=8*i-8;b++){
                System.out.print("*");
            }
            for(int c=1;c<=-4*i+20;c++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

/*
Write a Java program in a class named SlashFigure that produces the following output. Use nested for loops to capture the structure of the figure. (If you previously solved Self-Check problems 34 and 35 in the book, you will have created a loop table that will be useful in solving this problem. Use it!)

!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!//////
\\\\\\\\!!!!!!////////
\\\\\\\\\\!!//////////

*/

public class SlashFigure{
    public static void main(String[]args){
        for(int i=1;i<=6;i++){
            for(int a=1;a<=2*i-2;a++){
                System.out.print("\\");
            }
            for(int b=1;b<=(-4*i)+26;b++){
                System.out.print("!");
            }
            for(int c=1;c<=2*i-2;c++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}

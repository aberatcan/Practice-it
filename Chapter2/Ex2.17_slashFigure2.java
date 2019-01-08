/*
Modify the SlashFigure program from the previous exercise to produce a new
program SlashFigure2 that uses a global constant for the figure's height. The
previous output used a constant height of 6. Here is the outputs for a constant
 height of 4 and 7 respectively: (If you previously solved Self-Check problems
 34 and 35 in the book, you will have created a loop table that will be useful
 in solving this problem. Use it!)

size 4
!!!!!!!!!!!!!!
\\!!!!!!!!!!//
\\\\!!!!!!////
\\\\\\!!//////

size 7
!!!!!!!!!!!!!!!!!!!!!!!!!!
\\!!!!!!!!!!!!!!!!!!!!!!//
\\\\!!!!!!!!!!!!!!!!!!////
\\\\\\!!!!!!!!!!!!!!//////
\\\\\\\\!!!!!!!!!!////////
\\\\\\\\\\!!!!!!//////////
\\\\\\\\\\\\!!////////////

(You must solve this problem using only ONE public static final constant, not
multiple constants; and its value must be used in the way described in this
problem.)

*/

public class SlashFigure2{
    public static final int HEIGHT=4;
    public static void main(String[]args){
        for(int i=1;i<=HEIGHT;i++){
            for(int a=1;a<=2*i-2;a++){
                System.out.print("\\");
            }
            for(int b=1;b<=(-4*i)+(2+4*HEIGHT);b++){
                System.out.print("!");
            }
            for(int c=1;c<=2*i-2;c++){
                System.out.print("/");
            }
            System.out.println();
        }
    }
}

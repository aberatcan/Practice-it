/*

Modify your StarFigure code from the previous problem to use a constant for the
 size. The outputs below use a constant size of 3 (left) and 6 (right):

size 3
////////\\\\\\\\
////********\\\\
****************

size 6
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

(You must solve this problem using only ONE public static final constant, not
multiple constants; and its value must be used in the way described in this
problem.)

*/

public class StarFigure2{
    public static final int SIZE=3;
    public static void main(String[]args){
        for(int i=1;i<=SIZE;i++){
            for(int a=1;a<=-4*i+4*SIZE;a++){
                System.out.print("/");
            }
            for(int b=1;b<=8*i-8;b++){
                System.out.print("*");
            }
            for(int c=1;c<=-4*i+4*SIZE;c++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}

/*
Write a Java program called DollarFigure that produces the following output. Use nested for loops to capture the structure of the figure.

$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
****$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************

*/

public class DollarFigure{
    public static void main(String[]args){
        for(int i=1;i<=7;i++){
            for(int a=1;a<=2*i-2;a++){
                System.out.print("*");
            }
            for(int b=1;b<=8-i;b++){
                System.out.print("$");
            }
            for(int c=1;c<=16-2*i;c++){
                System.out.print("*");
            }
            for(int d=1;d<=8-i;d++){
                System.out.print("$");
            }
            for(int e=1;e<=2*i-2;e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

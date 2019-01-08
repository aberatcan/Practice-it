/*

Write a method called printDesign that produces the following output. Use nested for loops to capture the structure of the figure.

-----1-----
----333----
---55555---
--7777777--
-999999999-

*/

public static void printDesign() {
    // your code goes here
    for(int i=1;i<=5;i++){
        for(int a=5;a>=i;a--){
            System.out.print("-");
        }
        for(int b=1;b<=2*i-1;b++){
            System.out.print(2*i-1);
        }
         for(int a=5;a>=i;a--){
            System.out.print("-");
        }
        System.out.println();
        
    }
    
}

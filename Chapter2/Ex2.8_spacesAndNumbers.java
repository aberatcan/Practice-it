/*
Write nested for loops to produce the following output:

    1
   22
  333
 4444
55555

*/

for(int i=1;i<=5;i++){
    for(int a=4;a>=i;a--){
        System.out.print(" ");
    }
    for(int b=1;b<=i;b++){
            System.out.print(i);
    }
    System.out.println();
}

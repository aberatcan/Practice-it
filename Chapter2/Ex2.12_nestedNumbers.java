/*
Write nested for loops that produce the following output:


000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999

*/

for(int i=1;i<=3;i++){
    
    for(int a=0;a<10;a++){
        for(int b=1;b<=3;b++){
            System.out.print(a);
        }
    }
    System.out.println();
}

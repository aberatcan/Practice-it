/*
Modify your code from the previous problem to produce the following output:


999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221

*/

for(int i=1;i<=4;i++){
    
    for(int a=9;a>=1;a--){
        for(int b=1;b<=a;b++){
            System.out.print(a);
        }
    }
    System.out.println();
}

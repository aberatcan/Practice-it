/*
Write a complete Java program in a class named Egg that displays the following output:

  _______
 /       \
/         \
-"-'-"-'-"-
\         /
 \_______/
 */
 public class Egg{
    public static void top(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void line(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void main(String[]args){
        top();
        line();
        bottom();
    }
}

import java.util.Scanner;

class Test{
    
    public static void main(String [] args){
   
   try (Scanner obj = new Scanner(System.in)) {
    int num1 =obj.nextInt();
       int num2 =obj.nextInt();
    
       
        int op=(num1<num2)?num1:num2;
        System.out.println(op);
}

}
}

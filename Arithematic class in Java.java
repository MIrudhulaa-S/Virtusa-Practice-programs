import java.util.Scanner;  

public class Main{
    static int add(int a, int b){
        int c = a + b;
        return c;
    }
    
    static int mul(int a, int b){
        int c = a * b;
        return c;
    }
    
    static int sub(int a, int b){
        int c = a - b;
        return c;
    }
    
    static int div(int a, int b){
        int c = a / b;
        return c;
    }
    
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        
        System.out.println(add(num1, num2));
        System.out.println(mul(num1, num2));
        System.out.println(sub(num1, num2));
        System.out.println(div(num1, num2));
    }
}






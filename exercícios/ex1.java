package facul_java;
import java.util.Scanner;

class Calculate {
    public static void main(String[] args) {
    int escolha,x,y;
    Scanner obj = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    escolha = obj.nextInt();
    
    
    if (escolha == 1){
        Scanner n1 = new Scanner(System.in);
        System.out.println("Um valor para x: ");
        x = n1.nextInt();
        
        Scanner n2 = new Scanner(System.in);
        System.out.println("Um valor para y: ");
        y = n2.nextInt();
        n1.close();
        n2.close();

        sum(x,y);
    }
    
    
    if (escolha == 2){
        Scanner n1 = new Scanner(System.in);
        System.out.println("Um valor para x: ");
        x = n1.nextInt();
        
        Scanner n2 = new Scanner(System.in);
        System.out.println("Um valor para y: ");
        y = n2.nextInt();
        n1.close();
        n2.close();
        
        sub(x,y);
    }
    
    if (escolha == 3){
        Scanner n1 = new Scanner(System.in);
        System.out.println("Um valor para x: ");
        x = n1.nextInt();

        
        Scanner n2 = new Scanner(System.in);
        System.out.println("Um valor para y: ");
        y = n2.nextInt();
        n1.close();
        n2.close();

        div(x,y);
    }
    
    if (escolha == 4){
        Scanner n1 = new Scanner(System.in);
        System.out.println("Um valor para x: ");
        x = n1.nextInt();
        
        Scanner n2 = new Scanner(System.in);
        System.out.println("Um valor para y: ");
        y = n2.nextInt();
        n1.close();
        n2.close();

        mult(x,y);
       
    }
    obj.close();
       
    }
    
    static void sum(int x, int y){
        System.out.println(x + y);
    }
    static void sub(int x, int y){
        System.out.println(x - y);
    }
    static void div(int x, int y){
        System.out.println(x / y);
    }
    static void mult(int x, int y){
        System.out.println(x * y);
    }
    
}


import java.util.Scanner;

public class DesafioS {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Informe o valor de A: ");
        int a = sc.nextInt();
        
        System.out.println("Informe o valor de B: ");
        int b = sc.nextInt();
        
        System.out.println("Informe o valor de C: ");
        int c = sc.nextInt();
        
        System.out.println("Informe o valor de D: ");
        int d = sc.nextInt();
        
        int diferenca = ((a * b) - (c * d));
        
        System.out.println("A deiferença do produto de A e B para o produto de C e D é " + diferenca);
    }
}

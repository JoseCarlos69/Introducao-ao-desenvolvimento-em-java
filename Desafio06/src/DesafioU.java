import java.util.Scanner;

public class DesafioU {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Código peça 1: ");
        int codPeca1 = sc.nextInt();
        
        System.out.println("Número de peças 1: ");
        int numDePeca1 = sc.nextInt();
        
        System.out.println("Valor peça 1: ");
        double valorPeca1 = sc.nextDouble();  
        
        System.out.println("Código peça 2: ");
        int codPeca2 = sc.nextInt();
        
        System.out.println("Número de peças 2: ");
        int numDePeca2 = sc.nextInt();
        
        System.out.println("Valor peça 2: ");
        double valorPeca2 = sc.nextDouble();
        
        double valorPago = (numDePeca1 * valorPeca1) + (numDePeca2 * valorPeca2);
        
        System.out.print("O valor que será pago das peças de código " + codPeca1 + " e " + codPeca2 + " vai ser de R$ ");
        System.out.printf("%.2f", valorPago);
        System.out.print(" reais");
        System.out.println("");
    }
}

import java.util.Scanner;

public class DesafioU {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("C�digo pe�a 1: ");
        int codPeca1 = sc.nextInt();
        
        System.out.println("N�mero de pe�as 1: ");
        int numDePeca1 = sc.nextInt();
        
        System.out.println("Valor pe�a 1: ");
        double valorPeca1 = sc.nextDouble();  
        
        System.out.println("C�digo pe�a 2: ");
        int codPeca2 = sc.nextInt();
        
        System.out.println("N�mero de pe�as 2: ");
        int numDePeca2 = sc.nextInt();
        
        System.out.println("Valor pe�a 2: ");
        double valorPeca2 = sc.nextDouble();
        
        double valorPago = (numDePeca1 * valorPeca1) + (numDePeca2 * valorPeca2);
        
        System.out.print("O valor que ser� pago das pe�as de c�digo " + codPeca1 + " e " + codPeca2 + " vai ser de R$ ");
        System.out.printf("%.2f", valorPago);
        System.out.print(" reais");
        System.out.println("");
    }
}

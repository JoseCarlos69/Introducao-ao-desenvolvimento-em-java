import java.util.Scanner;

public class DesafioT {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Vendas: ");
        double vendas = sc.nextDouble();
        
        double salario = vendas * 0.15;
        
        System.out.print("O salário do " + nome + " no final do mês é de R$ ");
        System.out.printf("%.2f", salario);
        System.out.print(" reais");
        System.out.println("");
    }
}

import java.util.Scanner;

public class DesafioH {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char opcao, encerrar;
		double saldo = 0, saque, novoSaldo, deposito, novoDeposito;
		
		do {
			System.out.println("Op��es:");
			System.out.println("(a) Consulta saldo");
			System.out.println("(b) Saque");
			System.out.println("(c) Dep�sito");
			
			opcao = sc.next().charAt(0);
			
			if(opcao == 'a') {
				System.out.println("Saldo: R$ " + saldo);
			}
			if(opcao == 'b') {
				System.out.println("Quanto voc� quer sacar?");
				saque = sc.nextDouble();
				
				novoSaldo = saldo - saque;
				saldo = novoSaldo;
			}
			if(opcao == 'c') {
				System.out.println("Quanto voc� quer dep�sitar?");
				deposito = sc.nextDouble();
				
				novoDeposito = saldo + deposito;
				saldo = novoDeposito;
			}
			System.out.println("Deseja encerrar o programa?");
			encerrar = sc.next().charAt(0);
			
		} while(encerrar == 'N');
	}

}

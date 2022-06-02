import java.util.Scanner;

public class Desafio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade em anos: ");
		int idadeAno = sc.nextInt();
		
		System.out.println("Informe sua idade em meses: ");
		int idadeMes = sc.nextInt();
		
		System.out.println("Informe sua idade em dias: ");
		int idadeDia = sc.nextInt();
		
		int idadeEmDias = (idadeAno * 365) + (idadeMes * 30) + idadeDia;
		
		System.out.println("Você tem " + idadeEmDias + " dias de vida");
	}

}

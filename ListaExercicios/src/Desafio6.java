import java.util.Scanner;

public class Desafio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um texto: ");
		String texto = sc.nextLine();
		
		int qtdCaracteres = texto.length();
		
		System.out.println("Quantidades de caracteres do texto: " + qtdCaracteres);	
	}

}

import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma frase: ");
		String frase = sc.nextLine();
		
		System.out.println("Qual palavra deseja trocar? ");
		String palavra = sc.nextLine();
		
		System.out.println("Qual a palavra que vai substituir? ");
		String troca = sc.nextLine();
 
		String novaFrase = frase.replaceAll(palavra,troca);
 
		System.out.println("original: " + frase);
		System.out.println("trocando tudo por nada: "+  novaFrase);
	}
	
}

import java.util.Scanner;

public class DesafioB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva uma frase ou palavra: ");
		String frasePalavra = sc.nextLine();
		frasePalavra = new StringBuilder(frasePalavra).reverse().toString();
		
		System.out.println("Sua frase ou palavra ou contrário é: " + frasePalavra);



	}

}

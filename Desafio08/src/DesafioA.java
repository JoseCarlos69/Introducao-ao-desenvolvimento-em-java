import java.util.Scanner;

public class DesafioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Seu nome maiúsculo: " + (nome = nome.toUpperCase()));
		System.out.println("Seu nome minúsculo: " + (nome = nome.toLowerCase()));
	}

}

import java.util.Scanner;

public class DesafioA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Seu nome mai�sculo: " + (nome = nome.toUpperCase()));
		System.out.println("Seu nome min�sculo: " + (nome = nome.toLowerCase()));
	}

}

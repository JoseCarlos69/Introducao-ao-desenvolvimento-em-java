import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ano de nascimento: ");
		int ano = sc.nextInt();
		
		if ((2022 - ano) >= 16) {
			System.out.println("Você pode votar esse ano");
		} else {
			System.out.println("Você não pode votar esse ano");
		}
	}

}

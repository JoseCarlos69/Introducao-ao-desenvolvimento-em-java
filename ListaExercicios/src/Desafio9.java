import java.util.Scanner;

public class Desafio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos cavalos o haras possui? ");
		double cavalos = sc.nextDouble();
		
		double ferraduras = cavalos * 4 ;
		
		System.out.println("Serão necessárias " + ferraduras + " ferraduras");

	}

}

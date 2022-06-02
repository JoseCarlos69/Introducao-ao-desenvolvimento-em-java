import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double somaIdades = 0, idades, media;
		
		System.out.println("Quantidades de idades que vão ser usadas: ");
		double qtdIdades = sc.nextDouble();
		
		for(int i = 1; i <= qtdIdades; i++) {
			
			System.out.println("Digite a " + i + "° idade");
			idades = sc.nextDouble();
			
			somaIdades = somaIdades + idades;
		}
		
		media = somaIdades / qtdIdades;
		System.out.println("A média das idades é de " + media);
	}
}
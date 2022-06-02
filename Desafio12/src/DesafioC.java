import java.util.Scanner;

public class DesafioC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0 ,notas ,media = 0;
		int contador = 1;
		
		while(contador <= 3) {
			System.out.println(contador + "° nota: ");
			notas = sc.nextInt();
			
			soma = soma + notas;
			
			media = soma / 3;
			
			contador++;
		}
		System.out.printf("Média = " + media);
	}

}

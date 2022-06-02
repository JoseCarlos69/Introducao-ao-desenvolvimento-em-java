import java.util.Scanner;

public class DesafioJ {
	public static void main(String[] args) { 		
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.println("Entre com o numero: ");
		int entrada = sc.nextInt();
						
		for (int i = 1; i <= entrada; i++) {
			
			fatorial = fatorial * i;			
			
			if(i == entrada) {
				System.out.println( i + "! = " + fatorial);
			}
		}
		
	}	

}
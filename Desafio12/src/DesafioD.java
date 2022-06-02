import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entrada, multiplicador = 0;
		
	    System.out.println("Informar um número: ");
	    entrada = sc.nextInt();
	    while(multiplicador <= 10) {
	    	
	    	int resultado = entrada * multiplicador;
	    	
	    	System.out.println(entrada + " x " + multiplicador + " = " + resultado);
	    	
	    	multiplicador++;
	    }
	}
}
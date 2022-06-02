import java.util.Scanner;

public class DesafioE {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    char string;
		int i, cont;
		
		System.out.println("Digite uma frase:");
		string = sc.next().charAt(100);
		
		System.out.println("A frase digitada foi: " + string);
		
		cont = 0;
		
		for(i = 0; string != '\0'; i = i + 1) {
			if(string == 'a') {
				cont = cont + 1;
				string = 'b';
			}
		}
		System.out.println("Numero de caracteres: " + cont);
		System.out.println("Frase resultante: " + string);
	}

}

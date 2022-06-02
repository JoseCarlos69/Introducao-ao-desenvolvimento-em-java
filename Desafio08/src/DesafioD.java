import java.util.Scanner;

public class DesafioD {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Informe uma palavra ou frase: ");
	    String frasePalavra = sc.nextLine();
	    
	    frasePalavra = frasePalavra.replaceAll("a", "");
	    
	    System.out.println(frasePalavra);
	}

}

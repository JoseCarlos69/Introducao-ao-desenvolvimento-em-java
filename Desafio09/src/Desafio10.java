import java.util.Scanner;

public class Desafio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lado a: ");
        float a = sc.nextFloat();
        
        System.out.print("Lado b: ");
        float c = sc.nextFloat();

        System.out.print("Lado c: ");
        float b = sc.nextFloat();   
		
        if (a == b || b == c || c == a) {
        	if (a == b && b == c) {
        		System.out.println("Equilátero");
        	} else {
            System.out.println("Isósceles");
        	}
        }

        if (a != b && b != c && c != a) {
        	System.out.println("Escaleno");
        }

	}

}

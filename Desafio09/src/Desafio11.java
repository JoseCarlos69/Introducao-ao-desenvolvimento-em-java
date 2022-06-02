import java.util.Scanner;

public class Desafio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lado a: ");
        float a = sc.nextFloat();
        
        System.out.print("Lado b: ");
        float c = sc.nextFloat();

        System.out.print("Lado c: ");
        float b = sc.nextFloat();            
        
        double hipotenusa = a;

        if (hipotenusa < b) {
        	hipotenusa = b;
        }

        if (hipotenusa < c) {
        	hipotenusa = c;
        }
        
        float ang = ((b * b) + (c * c) - (a * a)) / 2 * b * c;
   
        if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa * hipotenusa) {
        	System.out.println("Retângulo");
        } else if (ang > 90 && ang < 180) {
        	System.out.println("Obtusangulo");
        } else {
        	System.out.println("Acutangulo");
        }
	}

}

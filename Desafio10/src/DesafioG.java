import java.util.Scanner;

public class DesafioG {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite a: ");
		double a = sc.nextDouble();
		
		System.out.println("Digite b: ");
		double b = sc.nextDouble();
		
		System.out.println("Digite c: ");
		double c = sc.nextDouble();
  
        double firstroot, secondroot;
  
        double det = (b * b) - (4 * a * c);
  
        int conta = 0;
        
        if (det > 0) {
        	conta = 1;
        } else if (det == 0) {
        	conta = 2;
        } else {
        	conta = 3;
        }
        
        switch(conta) {
        case 1:
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);
  
            System.out.format("First Root = %.2f and Second Root = %.2f", firstroot, secondroot);
        break;
        case 2:
        	firstroot = secondroot = -b / (2 * a);
        	  
            System.out.format("First Root = Second Root = %.2f;", firstroot);
        break;
        case 3:
            double real = -b / (2 * a);
            
            double imaginary = Math.sqrt(-det) / (2 * a);
  
            System.out.printf("First Root = %.2f+%.2fi", real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi", real, imaginary);
        break;
        default:
        	System.out.println("ERRO");
        }
    }
}

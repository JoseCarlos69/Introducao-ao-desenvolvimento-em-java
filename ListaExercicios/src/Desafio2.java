import java.util.Scanner;

public class Desafio2 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o raio: ");
        double R = sc.nextDouble();
        
        System.out.println("Informe a �rea: ");
        double A = sc.nextDouble();
        
        double V = 3.14159 * R * R * A;
        
        System.out.println("O volume da lata de �leo � de " + V + " m�");
        
    }

}

import java.util.Scanner;

public class Desafio3 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.println("Massa: ");
        double m = sc.nextDouble();
        
        System.out.println("Altura: ");
        double h = sc.nextDouble();
        
        System.out.println("Tempo: ");
        double t = sc.nextDouble();
        
        double cavalos = (m * h / t) / 745.6999;
        
        System.out.println("A quantidade de cavalos necessários é " + cavalos);
        
    }

}

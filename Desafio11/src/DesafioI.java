import java.util.Scanner;

public class DesafioI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        
        System.out.println("Entre com um número para o intervalo: ");
        int num = sc.nextInt();       
        
        System.out.println("Números primos no intervalo de 2 a " + num);
        for(int i = 2; i <= num; i++) {
        	
            boolean primo = true;        
            
            for(int j = 2; j < i; j++) {            
                if(i % j == 0) {
                    primo = false;
                }
            }
            
            if(primo) {
                System.out.println(i);   
            }
        }
    }
}
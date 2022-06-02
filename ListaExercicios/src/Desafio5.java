import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nome1 = "é o mestre do universo";
        
        System.out.println("Escreva uma palavra para ser trocada: ");
        String nome2 = sc.nextLine();
        
        String aux = nome2;
        nome2 = nome1;
        nome1 = aux;   
        System.out.println(nome1 + nome2);
    } 

}

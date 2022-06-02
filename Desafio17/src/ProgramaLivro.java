import java.util.Scanner;

public class ProgramaLivro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Livro livro1 = new Livro();
		
		System.out.print("Digite o título do livro: ");
		livro1.setTitulo(sc.nextLine());
		
		System.out.print("Digite o nome do autor do livro: ");
		livro1.setAutor(sc.nextLine());
		
		System.out.print("Digite o ISBN do livro: ");
		livro1.setIsbn(sc.nextInt());

		System.out.print("Digite o número de páginas do livro: ");
		livro1.setNumDePaginas(sc.nextInt());

		System.out.print("Digite o valor da compra do livro: ");
		livro1.setValorDeCompra(sc.nextFloat());
		
		System.out.println("");
		System.out.println("Informações do livro: ");
		System.out.println("");
		System.out.println("Título: " + livro1.getTitulo());
		System.out.println("Autor: " + livro1.getAutor());
		System.out.println("ISBN: " + livro1.getIsbn());
		System.out.println("Número de páginas: " + livro1.getNumDePaginas());
		System.out.println("Valor da compra: R$ " + livro1.getValorDeCompra() + " reais");

	}

}

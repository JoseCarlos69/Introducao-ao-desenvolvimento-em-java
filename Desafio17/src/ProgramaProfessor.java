import java.util.Scanner;

public class ProgramaProfessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Professor professor1 = new Professor();
		ContaBancaria contaBanco = new ContaBancaria();
		
		System.out.print("Digite o código do professor: ");
		professor1.setCodDoProfessor(sc.nextInt());
		
		System.out.print("Digite o nome do professor: ");
		professor1.setNome(sc.next());		
		
		System.out.print("Digite o endereço do professor: ");
		professor1.setEndereco(sc.next());
		
		System.out.print("Digite o telefone do professor: ");
		professor1.setTelefone(sc.nextInt());
		
		System.out.print("Digite a carga horária do professor: ");
		professor1.setCargaHoraria(sc.nextInt());
		
		System.out.print("Digite a conta do banco do professor: ");
		professor1.setContaBanco(sc.nextInt());
		
	}

}

import java.util.Scanner;

public class ProgramaContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ContaBancaria conta1 = new ContaBancaria();
		
		System.out.print("Digite o número da conta: ");
		conta1.setNumDaConta(sc.nextInt());
		
		System.out.print("Digite o nome do banco da conta: ");
		conta1.setBanco(sc.next());
		
		System.out.print("Digite o número da agência da conta: ");
		conta1.setAgencia(sc.nextInt());
		
		System.out.print("Digite o tipo da conta: ");
		conta1.setTipoDaConta(sc.next());
		
		System.out.print("Digite o saldo atual da conta: ");
		conta1.setSaldoAtual(sc.nextFloat());
		
		System.out.print("Digite o limite dísponivel da conta: ");
		conta1.setLimiteDisponivel(sc.nextFloat());
		
		System.out.println("");
		System.out.println("Informações da Conta: ");
		System.out.println("");
		System.out.println("Número da conta: " + conta1.getNumDaConta());
		System.out.println("Banco: " + conta1.getBanco());
		System.out.println("Agência: " + conta1.getAgencia());
		System.out.println("Tipo da conta: " + conta1.getTipoDaConta());
		System.out.println("Saldo atual: R$ " + conta1.getSaldoAtual() + " reais");
		System.out.println("Limite disponível: R$ " + conta1.getLimiteDisponivel() + " reais");

	}

}

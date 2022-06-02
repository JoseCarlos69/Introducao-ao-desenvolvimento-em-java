import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Onibus onibus1 = new Onibus();
		Onibus onibus2 = new Onibus();
		Onibus onibus3 = new Onibus();
		
		Passageiro passageiro1 = new Passageiro();
		
		System.out.print("Nome: ");
		passageiro1.nome = sc.nextLine();
		
		System.out.print("Identidade: ");
		passageiro1.identidade = sc.nextInt();
		
		onibus1.quantAssent = new int[8][4];
		int l = 0, c = 0;
				
		do {
			System.out.print("Escolha um assento de 1 a 32: ");
			passageiro1.assentoEscolhido = sc.nextInt();
			
			if(passageiro1.assentoEscolhido < 1 || passageiro1.assentoEscolhido > 32) {
				System.out.println("Assento inválido");
			}
			System.out.println("");

			
		}while(passageiro1.assentoEscolhido < 1 || passageiro1.assentoEscolhido > 32);
		
		for(l = 0; l < onibus1.quantAssent.length; l++) {
			for(c = 0; c < onibus1.quantAssent[l].length; c++) {
				if(onibus1.quantAssent[l][c] == 0) {
					if(passageiro1.assentoEscolhido == 1) {
						onibus1.quantAssent[0][0] = passageiro1.assentoEscolhido;
					} else if(passageiro1.assentoEscolhido == 2) {
						onibus1.quantAssent[0][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 3) {
						onibus1.quantAssent[0][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 4) {
						onibus1.quantAssent[0][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 5) {
						onibus1.quantAssent[1][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 6) {
						onibus1.quantAssent[1][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 7) {
						onibus1.quantAssent[1][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 8) {
						onibus1.quantAssent[1][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 9) {
						onibus1.quantAssent[2][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 10) {
						onibus1.quantAssent[2][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 11) {
						onibus1.quantAssent[2][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 12) {
						onibus1.quantAssent[2][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 13) {
						onibus1.quantAssent[3][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 14) {
						onibus1.quantAssent[3][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 15) {
						onibus1.quantAssent[3][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 16) {
						onibus1.quantAssent[3][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 17) {
						onibus1.quantAssent[4][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 18) {
						onibus1.quantAssent[4][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 19) {
						onibus1.quantAssent[4][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 20) {
						onibus1.quantAssent[4][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 21) {
						onibus1.quantAssent[5][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 22) {
						onibus1.quantAssent[5][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 23) {
						onibus1.quantAssent[5][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 24) {
						onibus1.quantAssent[5][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 25) {
						onibus1.quantAssent[6][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 26) {
						onibus1.quantAssent[6][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 27) {
						onibus1.quantAssent[6][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 28) {
						onibus1.quantAssent[6][3] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 29) {
						onibus1.quantAssent[7][0] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 30) {
						onibus1.quantAssent[7][1] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 31) {
						onibus1.quantAssent[7][2] = passageiro1.assentoEscolhido;
					}  else if(passageiro1.assentoEscolhido == 32) {
						onibus1.quantAssent[7][3] = passageiro1.assentoEscolhido;
					} else {
						System.out.println("Assento Ocupado");
					}
				}
			}
		}
		
		System.out.println("Assentos: ");
		System.out.println("");

		for(l = 0; l < onibus1.quantAssent.length; l++) {
			for(c = 0; c < onibus1.quantAssent[l].length; c++) {
				if(onibus1.quantAssent[l][c] > 0 && onibus1.quantAssent[l][c] <= 32) {
					System.out.print(onibus1.quantAssent[l][c] + " - Ocupado | ");
				} else {
					System.out.print(onibus1.quantAssent[l][c] + " - Livre   | ");
				}
			}
			System.out.println("");
		}
		
		System.out.println("");
		
		System.out.println("Passageiro " + passageiro1.nome + " no assento " + passageiro1.assentoEscolhido + " número de documento " + passageiro1.identidade);
		
	}

}

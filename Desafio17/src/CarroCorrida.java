
public class CarroCorrida {
	private int numeroCarro;
	private String piloto;
	private String equipe;
	private float velocidadeMaxima;
	private float velocidadeAtual;
	private boolean ligado;
	
	public CarroCorrida(int numeroCarro, String piloto, String equipe, float velocidadeMaxima) {
		this.numeroCarro = numeroCarro;
		this.piloto = piloto;
		this.equipe = equipe;
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public int getNumeroCarro() {
		return numeroCarro;
	}

	public void setNumeroCarro(int numeroCarro) {
		this.numeroCarro = numeroCarro;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getEquipe() {
		return equipe;
	}

	public void setEquipe(String equipe) {
		this.equipe = equipe;
	}

	public float getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public float getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(float velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	
	public void acelerar() {
		if(ligado == true) {
			System.out.println("Acelerando...");
			while(velocidadeAtual < velocidadeMaxima) {
				velocidadeAtual++;
			}
		}
	}
	
	public void frear() {
		if(ligado == true) {
			velocidadeAtual = (float) (velocidadeAtual - velocidadeAtual * 0.05);
		}
	}
	
	public void parar() {
		while(velocidadeAtual > 0) {
			velocidadeAtual--;
		}
	}
	
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		if(velocidadeAtual == 0) {
			ligado = false;
		}
	}
}


public class ContaBancaria {
	private int numDaConta;
	private String banco;
	private int agencia;
	private String tipoDaConta;
	private float saldoAtual;
	private float limiteDisponivel;
	
	public int getNumDaConta() {
		return numDaConta;
	}
	public void setNumDaConta(int numDaConta) {
		this.numDaConta = numDaConta;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTipoDaConta() {
		return tipoDaConta;
	}
	public void setTipoDaConta(String tipoDaConta) {
		this.tipoDaConta = tipoDaConta;
	}
	public float getSaldoAtual() {
		return saldoAtual;
	}
	public void setSaldoAtual(float saldoAtual) {
		this.saldoAtual = saldoAtual;
	}
	public float getLimiteDisponivel() {
		return limiteDisponivel;
	}
	public void setLimiteDisponivel(float limiteDisponivel) {
		this.limiteDisponivel = limiteDisponivel;
	}
}

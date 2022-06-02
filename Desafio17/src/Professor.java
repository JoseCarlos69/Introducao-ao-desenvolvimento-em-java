
public class Professor {
	private int codDoProfessor;
	private String nome;
	private String endereco;
	private int telefone;
	private int cargaHoraria;
	private ContaBancaria contaBanco;
	
	public int getCodDoProfessor() {
		return codDoProfessor;
	}
	public void setCodDoProfessor(int codDoProfessor) {
		this.codDoProfessor = codDoProfessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public ContaBancaria getContaBanco() {
		return contaBanco;
	}
	public void setContaBanco(ContaBancaria contaBanco) {
		this.contaBanco = contaBanco;
	}
}

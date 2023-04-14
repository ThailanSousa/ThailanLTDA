package br.com.thailanml.mercadolivre.entidade;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String sexo;
	private String endereco;
	private String telefone;
	
	
	public Pessoa () {
		
	}


	public Pessoa(String nome, String cpf, String sexo, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}

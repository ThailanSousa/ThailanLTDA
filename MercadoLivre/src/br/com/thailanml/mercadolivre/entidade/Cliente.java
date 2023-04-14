package br.com.thailanml.mercadolivre.entidade;

public class Cliente extends Pessoa {

	private String email;
	private int id;
	private String datacadastro;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String sexo, String endereco, String telefone, String email, int id, String datacasatro) {
		super(nome, cpf, sexo, endereco, telefone);
		this.email = email;
		this.id = id;
		this.datacadastro = datacadastro;
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDatacadastro() {
		return datacadastro;
	}

	public void setDatacadastro(String datacadastro) {
		this.datacadastro = datacadastro;
	}

	@Override
	public String toString() {
		return "Cliente [email=" + email + ", id=" + id + ", datacadastro=" + datacadastro + "]";
	}

	
	
}

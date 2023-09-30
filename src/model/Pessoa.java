package model;

public class Pessoa {

	private String nome;
	private int idade;
	private char sexo;
	private String cpf;
	private Endereco endereco;
	private Conta Conta;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Conta getConta() {
		return Conta;
	}
	public void setConta(Conta Conta) {
		this.Conta = Conta;
	}
	
	public Pessoa(String nome, int idade, char sexo, String cpf, Endereco endereco, model.Conta Conta) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.cpf = cpf;
		this.endereco = endereco;
		this.Conta = Conta;
	}
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
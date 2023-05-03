package br.com.fiap.beans;

public class Empresa {
	private String nome;
	private String tipo;
	private String cnpj;
	private Endereco endereco;
	
	// CONSTRUCTOR
	public Empresa() {
		super();
	}
	public Empresa(String nome, String tipo, String cnpj, Endereco endereco) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}
	public Empresa(String nome, String tipo, String cnpj) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.cnpj = cnpj;
	}
	
	// GET & SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}

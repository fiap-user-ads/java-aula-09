package br.com.fiap.beans;

public class Cliente {
	private String nome;
	private String rg;
	private int idade;
	private double renda;
	
	// CONSTRUCTOR
	public Cliente() {
		super();
	}
	public Cliente(String nome, String rg, int idade, double renda) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
		this.renda = renda;
	}
	
	// GET & SET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getRenda() {
		return renda;
	}
	public void setRenda(double renda) {
		this.renda = renda;
	}
	
}

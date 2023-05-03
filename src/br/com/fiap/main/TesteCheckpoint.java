package br.com.fiap.main;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;

public class TesteCheckpoint {
	public static void main(String[] args) {
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite o nome da empresa"),
				JOptionPane.showInputDialog("Digite o tipo da empresa"),
				JOptionPane.showInputDialog("Digite o cnpj da empresa")
		);
		Endereco objEndereco = new Endereco(
				JOptionPane.showInputDialog("Digite o lograduro da empresa"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da empresa")),
				JOptionPane.showInputDialog("Digite o cep da empresa"),
				JOptionPane.showInputDialog("Digite o bairro da empresa"),
				JOptionPane.showInputDialog("Digite o municipio da empresa"),
				JOptionPane.showInputDialog("Digite o estado da empresa")
		);
		Cliente objCliente = new Cliente(
				JOptionPane.showInputDialog("Digite o nome do cliente"),
				JOptionPane.showInputDialog("Digite o rg do cliente"),
				Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente")),
				Double.parseDouble(JOptionPane.showInputDialog("Digite a renda do cliente"))
		);
		objEmpresa.setEndereco(objEndereco);
		
		System.out.println(
				"===== EMPRESA =====" +
				"\nNome da empresa: " + objEmpresa.getNome() +
				"\nTipo da empresa: " + objEmpresa.getTipo() +
				"\nCnpj da empresa: " + objEmpresa.getCnpj() +
				"\n" +
				"\n===== ENDERECO =====" +
				"\nLogradouro da empresa" + objEmpresa.getEndereco().getLogradouro() +
				"\nNumero da empresa" + objEmpresa.getEndereco().getNumero() +
				"\nCep da empresa" + objEmpresa.getEndereco().getCep() +
				"\nBairro da empresa" + objEmpresa.getEndereco().getBairro() +
				"\nMunicipio da empresa" + objEmpresa.getEndereco().getMunicipio() +
				"\nEstadp da empresa" + objEmpresa.getEndereco().getEstado() +
				"\n" +
				"\n===== CLIENTE =====" +
				"\nNome do cliente: " + objCliente.getNome() +
				"\nRg do cliente: " + objCliente.getRg() +
				"\nIdade do cliente: " + objCliente.getIdade() +
				"\nRenda do cliente: " + objCliente.getRenda()
				
				
		);
	}
}
	
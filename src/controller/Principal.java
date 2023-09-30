package controller;

//import java.sql.Connection;

import dao.ContaDAO;
import dao.impl.ContaDAOImpl;
import model.Conta;
//import model.util.Conexao;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Conexao conexao = new Conexao();
		//Connection conn = conexao.getConnection();
		
		Conta conta = new Conta();
		conta.setNumero(58975);
		conta.setSaldo(45000.00);
		conta.setLimite(30000d);
		
		ContaDAO contaDao = new ContaDAOImpl();
		contaDao.salvar(conta);
		conta.setSaldo(46000.00);
		conta.setLimite(40000d);
		contaDao.alterar(conta);
		contaDao.remover(58975);

	}

}

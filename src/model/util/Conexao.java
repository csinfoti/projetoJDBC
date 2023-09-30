package model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	private String url="jdbc:postgresql://localhost:5432/postgres";
	private String user = "postgres";
	private String password = "12345"; 
	
	/**
	 * Método responsável por conectar no banco
	 * @return Connection
	 * @throws ClassNotFoundException
	 */
	
	public Connection getConnection() {
		
		Connection conn = null;
		try {
			
			Class.forName("org.postgresql.Driver");
			
			conn = DriverManager
					.getConnection(url, user, password);
		
			if(conn != null) {
				System.out.println("Banco conectado");
			}
		} catch (Exception e) {
			System.out.println("Erro na conexão com o banco. " + e.getMessage());
		}
		return conn;
	}
	
	//Método para fechar conexão com BD
	
	public void fecharConexao(Connection conn) {
		try {
			if(conn != null)
				conn.close();
		} catch(SQLException e){
			System.out.println("Erro ao fechar Conexao. " + e.getMessage());
		}
	}
}

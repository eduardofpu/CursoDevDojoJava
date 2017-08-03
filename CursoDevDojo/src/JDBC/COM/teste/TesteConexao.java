package JDBC.COM.teste;

import JDBC.COM.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) {
		ConexaoFactory conn = new ConexaoFactory();

		conn.getConexao();
	}

}

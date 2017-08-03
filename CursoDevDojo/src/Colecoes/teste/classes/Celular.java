package Colecoes.teste.classes;
//Site de documentação de coleções

//http://bigocheatsheet.com/
//https://www.javacodegeeks.com/
//https://dzone.com/refcardz/core-java

public class Celular {

	private String nome;
	private String IMEI;

	public Celular(String nome, String iMEI) {
		super();
		this.nome = nome;
		IMEI = iMEI;
	}


	@Override
	public String toString() {
		return "Celular [nome=" + nome + ", IMEI=" + IMEI + "]";
	}


	@Override
	public int hashCode() {
		return IMEI != null ? IMEI.hashCode() : 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Celular other = (Celular) obj;
		if (IMEI == null) {
			if (other.IMEI != null)
				return false;
		} else if (!IMEI.equals(other.IMEI))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

}

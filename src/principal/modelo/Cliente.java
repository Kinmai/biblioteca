package principal.modelo;

public class Cliente {
	private String nome;
	private int espera;
	private int retirado;
	private boolean temlivro;
	private boolean temespera;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRetirado(int id) {
		this.retirado = id;
		if(id>0) {
			temlivro = true;
		}
		else {
			temlivro = false;
		}
	}
	
	public void setEspera(int id) {
		this.espera = id;
	}
	
	public boolean getTemLivro() {
		return this.temlivro;
	}
	
	
}

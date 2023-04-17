package principal.modelo;

public class Cliente {
	private String nome;
	private int espera;
	private int retirado;
	private boolean temlivro;
	private boolean esperando;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setTemlivro(int id) {
		this.retirado = id;
		if(id>0) {
			this.temlivro = true;
		}
		else {
			this.temlivro = false;
		}
	}
	
	public boolean isTemlivro() {
		return temlivro;
	}

	public void setTemlivro(boolean temlivro) {
		this.temlivro = temlivro;
	}

	public boolean isEsperando() {
		return esperando;
	}

	public void setEsperando(boolean esperando) {
		this.esperando = esperando;
	}

	public int getEspera() {
		return espera;
	}

	public int getRetirado() {
		return retirado;
	}

	public void setEspera(int id) {
		this.espera = id;
	}
	
	public boolean getTemLivro() {
		return this.temlivro;
	}
	
	public void retirarLivro(Livro livro) {
		
	}
	
	public void devolverLivro(Livro livro) {
		
	}
	
}

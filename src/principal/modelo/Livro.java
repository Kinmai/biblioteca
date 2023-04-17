package principal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private int id;
	private String nome;
	private int quantidade;
	private boolean disponivel;
	List<String> fila = new ArrayList<>();
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

	public List<String> getFila() {
		return fila;
	}

	public void setFila(List<String> fila) {
		this.fila = fila;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int qte) {
		this.quantidade = qte;
	}
	
	public boolean checkDispobibilidade() {
		if(this.quantidade == 0) {
			this.disponivel = false;
		}
		if(this.quantidade>0) {
			this.disponivel = true;
		}
		
		return this.disponivel;
	}
	
	public void colocarNaFila(String user) {
		fila.add(user);
	}
	
	public void tirarDaFila(Cliente user) {
		if(fila.get(0)==user.getNome()) {
			fila.remove(0);
			
		}
		
	}

	/*public void emprestarLivro(Cliente user) {
		if(this.quantidade>=1) {
			this.quantidade--;
			user.setTemlivro(this.id);
		}
		else {
			colocarNaFila(user.getNome());
			user.setEspera(this.id);
		}
	}*/

	
	
	
}

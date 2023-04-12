package principal.modelo;

import java.util.ArrayList;
import java.util.List;

public class Livro {
	private int id;
	private String nome;
	private int quantidade;
	private boolean disponibilidade;
	List<String> fila = new ArrayList<>();
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setQuantidade(int qte) {
		this.quantidade = qte;
	}
	
	public boolean checkDispobibilidade() {
		if(this.quantidade == 0) {
			this.disponibilidade = false;
		}
		if(this.quantidade>0) {
			this.disponibilidade = true;
		}
		
		return this.disponibilidade;
	}
	
	public void colocarNaFila(String user) {
		fila.add(user);
	}
	
	public void tirarDaFila(Cliente user) {
		if(fila.get(0)==user.getNome()) {
			fila.remove(0);
			
		}
		
	}

	public void emprestarLivro(Cliente user) {
		if(this.quantidade>=1) {
			this.quantidade--;
			user.setRetirado(this.id);
		}
		else {
			colocarNaFila(user.getNome());
			user.setEspera(this.id);
		}
	}

	
	
	
}

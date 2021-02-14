package entidade;

public class Levantador {
	
	private String nome;
	private Integer peso;
	
	public Levantador(String nome, Integer peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getPeso() {
		return peso;
	}
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	

}

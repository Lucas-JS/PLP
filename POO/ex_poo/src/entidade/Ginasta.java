package entidade;

public class Ginasta {
	private String nome;
	private Double nota1, nota2, nota3, nota4, nota5;
	
	public Ginasta(String nome, Double nota1, Double nota2, Double nota3, Double nota4, Double nota5) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		this.nota4 = nota4;
		this.nota5 = nota5;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota1() {
		return nota1;
	}

	public void setNota1(Double nota1) {
		this.nota1 = nota1;
	}

	public Double getNota2() {
		return nota2;
	}

	public void setNota2(Double nota2) {
		this.nota2 = nota2;
	}

	public Double getNota3() {
		return nota3;
	}

	public void setNota3(Double nota3) {
		this.nota3 = nota3;
	}

	public Double getNota4() {
		return nota4;
	}

	public void setNota4(Double nota4) {
		this.nota4 = nota4;
	}

	public Double getNota5() {
		return nota5;
	}

	public void setNota5(Double nota5) {
		this.nota5 = nota5;
	}

	// recupera menor nota
	public Double getMenor() {
		double menor = nota1;
		
		if (nota2 < menor) {
			menor = nota2 ;
			}
		if (nota3 < menor) {
			menor = nota3 ;
			}
		if (nota4 < menor) {
			menor = nota4 ;
			}
		if (nota5 < menor) {
			menor = nota5 ;
			}
		
		return menor;
	}
	
	// calcula media retirando a menor nota
	public Double getMedia() {
		return (somaNotas() - getMenor())/4;
	}
	
	public Double somaNotas() {
		return nota1 + nota2 + nota3 + nota4 + nota5;
	}
}

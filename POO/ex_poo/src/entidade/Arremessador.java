package entidade;

public class Arremessador {
	
	private String nome;
	private Double arremesso1, arremesso2, arremesso3;
	
	public Arremessador(String nome, Double arremesso1, Double arremesso2, Double arremesso3) {
		this.nome = nome;
		this.arremesso1 = arremesso1;
		this.arremesso2 = arremesso2;
		this.arremesso3 = arremesso3;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getArremesso1() {
		return arremesso1;
	}

	public void setArremesso1(Double arremesso1) {
		this.arremesso1 = arremesso1;
	}

	public Double getArremesso2() {
		return arremesso2;
	}

	public void setArremesso2(Double arremesso2) {
		this.arremesso2 = arremesso2;
	}

	public Double getArremesso3() {
		return arremesso3;
	}

	public void setArremesso3(Double arremesso3) {
		this.arremesso3 = arremesso3;
	}
	
	public Double getMaior() {
		double maior = arremesso1;
		
		if(arremesso2 > maior) 
			maior = arremesso2;
		if(arremesso3 > maior) 
			maior = arremesso3;			
		return maior;
	}
	
	public Double getSegundaMaior() {
		double a = arremesso1;
		double b = arremesso2;
		double c = arremesso3;
		
		if ( a > b) {
	        if (c > a)
	            return a;
	        if (b > c)
	            return b;
	    } else {
	        if (c > b)
	            return b;
	        if (a > c)
	            return a;
	    }
	    return c;
		
	}
	

}

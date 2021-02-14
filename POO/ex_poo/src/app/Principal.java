package app;

import entidade.Arremessador;
import entidade.Ginasta;
import entidade.Judoca;
import entidade.Levantador;
import util.Juri;

public class Principal {
	
	public static void main(String[] args) {
		// Levantamento de pesos
		Levantador a = new Levantador("João", 310);
		Levantador b = new Levantador("Carlos", 320);
		
		System.out.println("Vencedor do levantamento de peso: "+Juri.julgaLevantador(a, b));
		//===================================================================================
		// Judo
		Judoca g = new Judoca("Thiago", false, 6, 10);
		Judoca h = new Judoca("Pedro", false, 5, 14);
		
		System.out.println("Vencedor do judô: "+Juri.julgaJudo(g, h));
		//===================================================================================
		// Arremesso de pesos
		Arremessador c = new Arremessador("José", 20.53, 21.9, 21.5);
		Arremessador d = new Arremessador("Luiz", 20.78, 22.6, 22.7);
		
		System.out.println("Vencedor do arremesso de pesos: "+Juri.julgaArremessador(c, d));
		//===================================================================================
		// Ginástica artística
		Ginasta e = new Ginasta("Beatriz", 9.5, 9.0, 9.1, 8.75, 8.8);
		Ginasta f = new Ginasta("Lilian", 9.3, 8.5, 9.2, 8.9, 9.4);
		
		System.out.println("Vencedora da ginastica artistica: "+Juri.julgaGinasta(e, f));
		
		
	}
}

package util;

import entidade.Arremessador;
import entidade.Ginasta;
import entidade.Judoca;
import entidade.Levantador;

public class Juri {

	// determina vencedor do levantamento de pesos
	public static String julgaLevantador(Levantador a, Levantador b) {
		String vencedor = "";
		if (a.getPeso() > b.getPeso()) {
			vencedor = a.getNome();
		} else {
			vencedor = b.getNome();
		}
		return vencedor;
	}

	// determina vancedor do arremesso de peso
	public static String julgaArremessador(Arremessador a, Arremessador b) {
		String vencedor = "";

		double maxA = a.getMaior();
		double maxB = b.getMaior();
		double secondA = a.getSegundaMaior();
		double secondB = b.getSegundaMaior();

		if (maxA != maxB) {
			if (maxA > maxB) {
				vencedor = a.getNome();
			} else {
				vencedor = b.getNome();
			}
		} else if (secondA > secondB) {
			vencedor = a.getNome();
		} else {
			vencedor = b.getNome();
		}

		return vencedor;
	}

	// determina vencedor da ginastica artistica
	public static String julgaGinasta(Ginasta a, Ginasta b) {
		String vencedor = "";

		if (a.getMedia() > b.getMedia()) {
			vencedor = a.getNome();
		} else {
			vencedor = b.getNome();
		}

		return vencedor;
	}

	// determina vencedor do judô
	public static String julgaJudo(Judoca a, Judoca b) {
		String vencedor = "";

		if (a.getIppon() == true) {
			return a.getNome();
		}
		if (b.getIppon() == true) {
			return b.getNome();
		}
		if (a.getWazari() == b.getWazari()) {
			if (a.getYuko() > b.getYuko()) {
				vencedor = a.getNome();
			} else {
				vencedor = b.getNome();
			}
		}
		if (a.getWazari() > b.getWazari()) {
			vencedor = a.getNome();
		} else {
			vencedor = b.getNome();
		}
		return vencedor;
	}
}

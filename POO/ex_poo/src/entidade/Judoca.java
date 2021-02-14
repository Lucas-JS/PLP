package entidade;

public class Judoca {
	
	private String nome;
	private Boolean ippon;
	private Integer wazari;
	private Integer yuko;
	
	public Judoca(String nome, Boolean ippon, Integer wazari, Integer yuko) {
		this.nome = nome;
		this.ippon = ippon;
		this.wazari = wazari;
		this.yuko = yuko;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getIppon() {
		return ippon;
	}

	public void setIppon(Boolean ippon) {
		this.ippon = ippon;
	}

	public Integer getWazari() {
		return wazari;
	}

	public void setWazari(Integer wazari) {
		this.wazari = wazari;
	}

	public Integer getYuko() {
		return yuko;
	}

	public void setYuko(Integer yuko) {
		this.yuko = yuko;
	}
	
	

}

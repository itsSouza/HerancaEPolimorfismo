package entidades;

public abstract class Contribuintes {
	
	private String nome;
	private Double rendaAno;
	
	
	public Contribuintes() {
	}


	public Contribuintes(String nome, Double rendaAno) {
		this.nome = nome;
		this.rendaAno = rendaAno;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getRendaAno() {
		return rendaAno;
	}


	public void setRendaAno(Double rendaAno) {
		this.rendaAno = rendaAno;
	}
	
	public abstract Double taxa();



	
	
}

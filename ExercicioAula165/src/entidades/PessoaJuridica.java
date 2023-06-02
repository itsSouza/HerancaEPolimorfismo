package entidades;

public class PessoaJuridica extends Contribuintes{
	
	private int numeroDeEmpregados = 0;
	
	
	public PessoaJuridica() {
		super();
	}
	


	public PessoaJuridica(String nome, Double rendaAno, int numeroDeEmpregados) {
		super(nome, rendaAno);
		this.numeroDeEmpregados = numeroDeEmpregados;
	}



	public int getNumeroDeEmpregados() {
		return numeroDeEmpregados;
	}



	public void setNumeroDeEmpregados(int numeroDeEmpregados) {
		this.numeroDeEmpregados = numeroDeEmpregados;
	}



	@Override
	public Double taxa() {
		if(numeroDeEmpregados > 10) {
			return getRendaAno() * 0.14;
		}
		else{
			return getRendaAno() * 0.16;
			
		}
	}

}

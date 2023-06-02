package entidades;

public class PessoaFisica extends Contribuintes {

	
	private Double gastoSaude;
	
	
	public PessoaFisica() {
		super();
	}
	
	

	public PessoaFisica(String nome, Double rendaAno, Double gastoSaude) {
		super(nome, rendaAno);
		this.gastoSaude = gastoSaude;
	}


	public Double getGastoSaude() {
		return gastoSaude;
	}



	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}



	@Override
	public Double taxa() {	
		if(getRendaAno() < 20000.00) {
			return (getRendaAno() * 0.15) - (gastoSaude * 0.50);
		}
		else {
			return (getRendaAno() * 0.25) - gastoSaude * 0.50;
		}
}


}

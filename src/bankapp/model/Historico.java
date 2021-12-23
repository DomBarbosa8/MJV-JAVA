package bankapp.model;

public class Historico {

	private String data;
	private Double valor;
	private String tipoOperacao;
	
	public Historico() {
		
	}

	public Historico(String data, Double valor, String tipoOperacao) {
		this.data = data;
		this.valor = valor;
		this.tipoOperacao = tipoOperacao;
	}

	public String getData() {
		return data;
	}

	public Double getValor() {
		return valor;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}
	
	
	//22/12/2021  - SAQUE 100
	//22/12/2021 - DEPOSITO 50
	//22/12/2021 - TRANSFERENCIA 30
	
	
	
}

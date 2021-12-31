package cambioapp.model;

import java.time.LocalDate;

//classes de modelo representam a estrutura, servem para ser par�metros (
public class Transacao {
	
	private LocalDate dataTransacao;//classe date � praticamente deprecada, utilizam-se as classes java.time
	private String cpf;//recomendado o uso de String porque pode come�ar com o n�mero 0
	private String nome;
	private Moeda moeda; //enum � uma classe que cria os objetos de forma pr�-definida
	private Moeda moedaVenda;
	private Double valorVendido;
	private Double taxaCambio;
	private Moeda moedaCompraMoeda;
	private Double valorComprado;
	
	public LocalDate getDataTransacao() {
		return dataTransacao;
	}
	public void setDataTransacao(LocalDate dataTransacao) {
		this.dataTransacao = dataTransacao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Moeda getMoeda() {
		return moeda;
	}
	public void setMoeda(Moeda moeda) {
		this.moeda = moeda;
	}
	public Moeda getMoedaVenda() {
		return moedaVenda;
	}
	public void setMoedaVenda(Moeda moedaVenda) {
		this.moedaVenda = moedaVenda;
	}
	public Double getValorVendido() {
		return valorVendido;
	}
	public void setValorVendido(Double valorVendido) {
		this.valorVendido = valorVendido;
	}
	public Double getTaxaCambio() {
		return taxaCambio;
	}
	public void setTaxaCambio(Double taxaCambio) {
		this.taxaCambio = taxaCambio;
	}
	public Moeda getMoedaCompraMoeda() {
		return moedaCompraMoeda;
	}
	public void setMoedaCompraMoeda(Moeda moedaCompraMoeda) {
		this.moedaCompraMoeda = moedaCompraMoeda;
	}
	public Double getValorComprado() {
		return valorComprado;
	}
	public void setValorComprado(Double valorComprado) {
		this.valorComprado = valorComprado;
	}
	@Override
	public String toString() {
		return "Transacao [dataTransacao=" + dataTransacao + ", cpf=" + cpf + ", nome=" + nome + ", moeda=" + moeda
				+ ", moedaVenda=" + moedaVenda + ", valorVendido=" + valorVendido + ", taxaCambio=" + taxaCambio
				+ ", moedaCompraMoeda=" + moedaCompraMoeda + ", valorComprado=" + valorComprado + "]";
	}
	
	//n�o utilizar o toString para formatar informa��es para o usu�rio!
	

}

package desafio2.model;

import java.time.LocalDate;

public class RegistroProfissional {
	
	public String profissao;
	public String nome;
	public Double salarioMinimo;
	public Double salarioMaximo;
	public LocalDate dataNascimento;
	public String cpf;
	public String rg;
	public String logradouro;
	public String numero;
	public String bairro;
	public String municipio;
	public Uf uf;
	public String cep;
	public String naturalidade;
	public String pais;
	public String telefone;
	public String celular;
	public String email;
	public Grau grau;
	
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getSalarioMinimo() {
		return salarioMinimo;
	}
	public void setSalarioMinimo(Double salarioMinimo) {
		this.salarioMinimo = salarioMinimo;
	}
	public Double getSalarioMaximo() {
		return salarioMaximo;
	}
	public void setSalarioMaximo(Double salarioMaximo) {
		this.salarioMaximo = salarioMaximo;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public Uf getUf() {
		return uf;
	}
	public void setUf(Uf uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Grau getGrau() {
		return grau;
	}
	public void setGrau(Grau grau) {
		this.grau = grau;
	}
	@Override
	public String toString() {
		return "RegistroProfissional [profissao=" + profissao + ", nome=" + nome + ", salarioMinimo=" + salarioMinimo
				+ ", salarioMaximo=" + salarioMaximo + ", dataNascimento=" + dataNascimento + ", cpf=" + cpf + ", rg="
				+ rg + ", logradouro=" + logradouro + ", numero=" + numero + ", bairro=" + bairro + ", municipio="
				+ municipio + ", uf=" + uf + ", cep=" + cep + ", naturalidade=" + naturalidade + ", pais=" + pais
				+ ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", grau=" + grau + "]";
	}
	
	
	

}

package bankapp.repository;

import java.util.HashSet;
import java.util.Set;

import bankapp.model.Conta;

public class ContaRepository {
	
	private Set <Conta> contas = new HashSet <Conta> ();
	
	
	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}
	
	public Set <Conta> getContas() {
		return contas;
	}
	
}

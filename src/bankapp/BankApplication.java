package bankapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import bankapp.model.Conta;
import bankapp.repository.ContaRepository;
import bankapp.service.ContaService;


public class BankApplication {

	public static void main(String[] args) {
		
		caso3();

	}
	
	private static void caso3() {
		List<String> nomes = new ArrayList();
		nomes.add("Dom");
		nomes.add("Bruna");
		nomes.add("Juliana");
		
		Collections.sort(nomes);
		
		for(String nome: nomes) {
			System.out.println(nome);
		}
	}
	
	private static void caso2() {
		
		ContaRepository repository = new ContaRepository();
		
		Conta contaTaty = new Conta();
		contaTaty.setNomeCorrentista("TATY");
		contaTaty.setNumero("234-1");
		repository.adicionarConta(contaTaty);
		
		Conta contaWagner = new Conta();
		contaWagner.setNomeCorrentista("WAGNER");
		contaWagner.setNumero("765-3");
		repository.adicionarConta(contaWagner);
		
		Conta contaMayara = new Conta();
		contaMayara.setNomeCorrentista("MAYARA");
		contaMayara.setNumero("564-7");
		repository.adicionarConta(contaMayara);
		
		Set <Conta> contas = repository.getContas();
		
		for(Conta conta : contas) {
			
			System.out.println(conta);
		}
		
		//System.out.println(contaTaty);
		
		ContaService terminal = new ContaService();
		terminal.depositar(contaTaty, 100.0);
		System.out.println("Saldo Atual: " + contaTaty.getSaldo());
		terminal.sacar(contaTaty, 30);
		terminal.depositar(contaTaty, 50);
		terminal.exibirExtrato(contaTaty);
		System.out.println("Seu novo saldo é: " + contaTaty.getSaldo());
		
		System.out.println(contaMayara);
		
		ContaService terminal1 = new ContaService();
		terminal.depositar(contaMayara, 70.0);
		System.out.println("Saldo Atual: " + contaMayara.getSaldo());
		terminal.sacar(contaMayara, 30);
		terminal.depositar(contaMayara, 60);
		terminal.exibirExtrato(contaMayara);
		System.out.println("Seu novo saldo é: " + contaMayara.getSaldo());
		
		System.out.println(contaWagner);
		
		ContaService terminal2 = new ContaService();
		terminal.depositar(contaWagner, 50.0);
		System.out.println("Saldo Atual: " + contaWagner.getSaldo());
		terminal.sacar(contaWagner, 15);
		terminal.depositar(contaWagner, 5);
		terminal.sacar(contaWagner, 20);
		terminal.exibirExtrato(contaWagner);
		System.out.println("Seu novo saldo é: " + contaWagner.getSaldo());
		
	}
	
	
}

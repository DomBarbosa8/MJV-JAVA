package bankapp;

import bankapp.model.Conta;
import bankapp.repository.ContaRepository;
import bankapp.service.ContaService;


public class BankApplication {

	public static void main(String[] args) {
		
		caso2();

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
		
		Conta [] contas = repository.getContas();
		
		for(int i = 0; i < contas.length; i = i + 1) {
			
			Conta contAtual = contas[i];
			System.out.println(contAtual);
		}
		
		System.out.println(contaTaty);
		
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

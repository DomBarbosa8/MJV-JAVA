package desafio2.app;

import java.util.List;

import desafio2.model.RegistroProfissional;
import desafio2.util.LeitorRegistros;
import desafio2.util.TransacaoPrint;

public class RegistroApp {

	public static void main(String[] args) {
		
		LeitorRegistros leitor = new LeitorRegistros();
		
		List<RegistroProfissional> registroProfissional = leitor.converter("C:\\Users\\Dom\\MJV-JAVA\\AulaGit\\FICHACADASTRAL.csv");
		
		TransacaoPrint printer = new TransacaoPrint();
		printer.imprimir(registroProfissional.get(0));
		
	}
}

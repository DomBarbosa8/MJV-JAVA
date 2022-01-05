package cambioapp.app;

import java.util.List;

import cambioapp.model.Transacao;
import cambioapp.util.LeitorRemessa;
import cambioapp.util.LeitorRemessaDelimitado;
import cambioapp.util.LeitorRemessaPosicional;
import cambioapp.util.TransacaoPrint;

public class CambioApp {

	public static void main(String[] args) {
		
		LeitorRemessa leitor = null;
		String caminho = "C:\\Users\\Dom\\MJV-JAVA\\AulaGit\\DELREMESSA.csv";
		//String caminho = "C:\\Users\\Dom\\MJV-JAVA\\AulaGit\\POSREMESSA.csv";
		
		//LeitorRemessa leitor = new LeitorRemessa();
		//eu não posso instanciar, criar um objeto de uma classe abstrata
		
		
		if(caminho.contains("DEL"))
			leitor = new LeitorRemessaDelimitado();
		else
			leitor = new LeitorRemessaPosicional();
		//foi aplicado o polimorfismo através de fluxos condicionais: um único leitor possui comportamentos diferentes mediante cada critério da aplicação
		
		List<Transacao> transacoes = leitor.converter(caminho);
		
		//List<Transacao> transacoes = leitor.converter("C:\\Users\\Dom\\MJV-JAVA\\AulaGit\\DELREMESSA.csv");
		
		
		TransacaoPrint printer = new TransacaoPrint();
		
		printer.imprimir(transacoes.get(0));//imprime conforme o indice escolhido
		
		//for(Transacao t: transacoes) {
		//	printer.imprimir(t);
		//}
		
		
		//for(Transacao t: transacoes) {
		//	System.out.println(t);
		//}
		
	}
}

package cambioapp.app;

import java.util.List;

import cambioapp.model.Transacao;
import cambioapp.util.LeitorRemessa;
import cambioapp.util.TransacaoPrint;

public class CambioApp {

	public static void main(String[] args) {
		
		LeitorRemessa leitor = new LeitorRemessa();
		
		List<Transacao> transacoes = leitor.converter("C:\\Users\\Dom\\MJV-JAVA\\AulaGit\\DELREMESSA.csv");
		
		
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

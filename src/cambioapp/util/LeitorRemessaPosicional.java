package cambioapp.util;

import java.util.List;

import cambioapp.model.Transacao;

//foi aplicado o conceito de heran�a para desfrutar recursos da classe pai, utilizando o extends
public class LeitorRemessaPosicional extends LeitorRemessa {
	
	public List<Transacao> converter(String caminhoArquivo){
		System.out.println("IMPLEMENTA��O POSICIONAL");
		
		List<String> conteudos = ler(caminhoArquivo);
		return null;
		
	}

}

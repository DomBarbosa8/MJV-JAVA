package cambioapp.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import cambioapp.model.Transacao;

public abstract class LeitorRemessa {
	
	public abstract List<Transacao> converter (String caminhoArquivo);
	//se tiver um m�todo abstrato, toda a classe tamb�m precisa ser
	//foi usada a abstra��o(da responsabilidade/contrato) porque alguns comportamentos possuem m�ltiplas estruturas, mais de uma composi��o
	
	
	//foi aplicado o encapsulamento atrav�s de forma protegida, para que as classes filhas possam utilizar o m�todo
	protected List<String>ler(String caminhoArquivo) {
		try {
			List <String> transacoes = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return transacoes;
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
		
	}

}

package cambioapp.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import cambioapp.model.Transacao;

public abstract class LeitorRemessa {
	
	public abstract List<Transacao> converter (String caminhoArquivo);
	//se tiver um método abstrato, toda a classe também precisa ser
	//foi usada a abstração(da responsabilidade/contrato) porque alguns comportamentos possuem múltiplas estruturas, mais de uma composição
	
	
	//foi aplicado o encapsulamento através de forma protegida, para que as classes filhas possam utilizar o método
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

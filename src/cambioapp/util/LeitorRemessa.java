package cambioapp.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cambioapp.model.Moeda;
import cambioapp.model.Transacao;

public class LeitorRemessa {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private List<String>ler(String caminhoArquivo) {
		try {
			List <String> transacoes = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.UTF_8);
			return transacoes;
		}catch(IOException e){
			e.printStackTrace();
			return null;
		}
		
	}
	
	public List<Transacao> converter(String caminhoArquivo){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");//formatação unica para ser usada posteriormente nas interções
		List<String> conteudos = ler(caminhoArquivo);
		List<Transacao> transacoes = new ArrayList();
		
		for(String linha:conteudos) {
			//cada linha é uma composição de campos
			String [] campos = linha.split(";");
			//tenho um array de campos que existem nessas linhas e serão "quebrados" através do split pelo delimitador ";"
			Transacao t = new Transacao();
			t.setCpf(campos[1]);
			t.setNome(campos[2]);
			t.setValorVendido(Double.valueOf(campos[4]));//as classes wrappers tem métodos estáticos que convertem um valor de String em um valor correspondente a sua classe wrapper
			t.setTaxaCambio(Double.valueOf(campos[5]));
			t.setValorComprado(Double.valueOf(campos[7]));
			t.setMoedaVenda(Moeda.valueOf(campos[3].toUpperCase()));//assim como o Double, o Enum tb possui o método valueOf
			t.setMoedaCompraMoeda(Moeda.valueOf(campos[6].toUpperCase()));//usar o to.Uppercase para garantir a integridade dos dados
			
			String date = campos[0];
			LocalDate data = LocalDate.parse(date, formatter);
			t.setDataTransacao(data);
			
			
			transacoes.add(t);
		}
		return transacoes;
	}
	
	

}

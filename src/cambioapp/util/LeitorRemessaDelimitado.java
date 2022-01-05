package cambioapp.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cambioapp.model.Moeda;
import cambioapp.model.Transacao;

public class LeitorRemessaDelimitado extends LeitorRemessa{
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");;//formata��o unica para ser usada posteriormente nas intera��es
	
	public List<Transacao> converter(String caminhoArquivo){
		System.out.println("IMPLEMENTA��O DELIMITADA");
		
		List<String> conteudos = ler(caminhoArquivo);
		List<Transacao> transacoes = new ArrayList();
		
		for(String linha:conteudos) {
			//cada linha � uma composi��o de campos
			String [] campos = linha.split(";");
			//tenho um array de campos que existem nessas linhas e ser�o "quebrados" atrav�s do split pelo delimitador ";"
			Transacao t = new Transacao();
			t.setCpf(campos[1]);
			t.setNome(campos[2]);
			t.setValorVendido(Double.valueOf(campos[4]));//as classes wrappers tem m�todos est�ticos que convertem um valor de String em um valor correspondente a sua classe wrapper
			t.setTaxaCambio(Double.valueOf(campos[5]));
			t.setValorComprado(Double.valueOf(campos[7]));
			t.setMoedaVenda(Moeda.valueOf(campos[3].toUpperCase()));//assim como o Double, o Enum tb possui o m�todo valueOf
			t.setMoedaCompraMoeda(Moeda.valueOf(campos[6].toUpperCase()));//usar o to.Uppercase para garantir a integridade dos dados
			
			String date = campos[0];
			LocalDate data = LocalDate.parse(date, formatter);
			t.setDataTransacao(data);
			
			
			transacoes.add(t);
		}
		return transacoes;
	}
	
	

}

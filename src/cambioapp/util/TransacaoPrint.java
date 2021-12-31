package cambioapp.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import cambioapp.model.Transacao;

public class TransacaoPrint {
	
	public void imprimir(Transacao transacao) {
		
		NumberFormat nf = DecimalFormat.getCurrencyInstance(Locale.ENGLISH);
		
		StringBuilder cupom = new StringBuilder();//quando tiver a necessidade de fazer v�rias opera��es de concatena��o, � recomendado usar o StringBuilder
		cupom.append("-------------------------------------------------\n");
		cupom.append("SIS CAMBIO - COMPROVANTE DE TRANSACAO\n");
		cupom.append("TRANSACAO DE CAMBIO\n");
		cupom.append("-------------------------------------------------\n");
		cupom.append(String.format("%-10s%s\n","NOME:", transacao.getNome()));
		//cupom.append(String.format("%-10s%s\n","CPF:", transacao.getCpf()));
		cupom.append(String.format("%-10s%s\n", "CPF:", FormatterUtil.cpf(transacao.getCpf())));
		cupom.append("\n-------------------------------------------------\n");
		cupom.append(String.format("%-10s%s\n","VENDIDO:", FormatterUtil.moeda(transacao.getValorVendido(), transacao.getMoedaVenda())));
		cupom.append(String.format("%-10s%s\n", "COMPRADO:", FormatterUtil.moeda(transacao.getValorComprado(), transacao.getMoedaCompraMoeda())));
		//O -10 alinha � esquerda e completa com 10 espa�os em branco, mesmo que a palavra seja menor, considera os espa�os em branco
		cupom.append(String.format("%010d", 123));//No caso do 010 ele preenche os espa�os com 0 � esquerda (para d�gito)
		
		System.out.println(cupom);
		
		
	}

}

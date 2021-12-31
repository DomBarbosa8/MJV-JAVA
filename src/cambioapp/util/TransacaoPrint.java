package cambioapp.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import cambioapp.model.Transacao;

public class TransacaoPrint {
	
	public void imprimir(Transacao transacao) {
		
		NumberFormat nf = DecimalFormat.getCurrencyInstance(Locale.ENGLISH);
		
		StringBuilder cupom = new StringBuilder();//quando tiver a necessidade de fazer várias operações de concatenação, é recomendado usar o StringBuilder
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
		//O -10 alinha à esquerda e completa com 10 espaços em branco, mesmo que a palavra seja menor, considera os espaços em branco
		cupom.append(String.format("%010d", 123));//No caso do 010 ele preenche os espaços com 0 à esquerda (para dígito)
		
		System.out.println(cupom);
		
		
	}

}

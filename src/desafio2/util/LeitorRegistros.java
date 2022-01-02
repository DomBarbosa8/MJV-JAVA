package desafio2.util;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import desafio2.model.Grau;
import desafio2.model.RegistroProfissional;
import desafio2.model.Uf;

public class LeitorRegistros {
	
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private List<String> ler(String caminhoArquivo) {
		
		try {
			List<String> registros = Files.readAllLines(Paths.get(caminhoArquivo), StandardCharsets.ISO_8859_1);
			return registros;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
			

	}
	
	public List<RegistroProfissional> converter (String caminhoArquivo) {
		
		List<String> registros = ler(caminhoArquivo);
		List<RegistroProfissional> registroProfissional = new ArrayList<>();
		for(String linha: registros) {
			
			String[] campos = linha.split(";");
			RegistroProfissional r = new RegistroProfissional();
			r.setProfissao(campos[0]);
			r.setNome(campos[1]);
			r.setSalarioMinimo(Double.valueOf(campos[2]));
			r.setSalarioMaximo(Double.valueOf(campos[3]));
			r.setCpf(campos[5]);
			r.setRg(campos[6]);
			r.setLogradouro(campos[7]);
			r.setNumero(campos[8]);
			r.setBairro(campos[9]);
			r.setMunicipio(campos[10]);
			r.setUf(Uf.SP);
			r.setCep(campos[12]);
			r.setNaturalidade(campos[13]);
			r.setPais(campos[14]);
			r.setTelefone(campos[15]);
			r.setCelular(campos[16]);
			r.setEmail(campos[17]);
			r.setGrau(Grau.SUPERIOR);
			
			String data = campos[4];
			LocalDate date = LocalDate.parse(data, formatter);
			r.setDataNascimento(date);
			
		
			
			registroProfissional.add(r);
			
		}
		
		return registroProfissional;
		
		
	}
}

package desafio2.util;

import desafio2.model.RegistroProfissional;

public class TransacaoPrint {
	
	public void imprimir(RegistroProfissional registroProfissional) {
		
		StringBuilder ficha = new StringBuilder();
		
		ficha.append("**********************************************************************\n");
		ficha.append("--------------------------FICHA PROFISSIONAL--------------------------\n");
		ficha.append("**********************************************************************\n");
		ficha.append("-------------------------INFORMA��ES PESSOAIS-------------------------\n");
		ficha.append("**********************************************************************\n");
		ficha.append(String.format("%-20s%s\n","PROFISS�O:", registroProfissional.getProfissao()));
		ficha.append(String.format("%-20s%s\n","NOME:", registroProfissional.getNome()));
		ficha.append(String.format("%-20s%s\n","NASC.:", registroProfissional.getDataNascimento()));
		ficha.append(String.format("%-20s%s\n", "CPF:", Formater.cpf(registroProfissional.getCpf())));
		ficha.append(String.format("%-20s%s\n", "RG:", Formater.rg(registroProfissional.getRg())));
		ficha.append(String.format("%-20s%s\n", "TELEFONE:", Formater.telefone(registroProfissional.getTelefone())));
		ficha.append(String.format("%-20s%s\n", "CELULAR:", Formater.celular(registroProfissional.getCelular())));
		ficha.append(String.format("%-20s%s\n","EMAIL:", registroProfissional.getEmail()));
		ficha.append("**********************************************************************\n");
		ficha.append("------------------------------ENDERE�O-------------------------------\n");
		ficha.append("**********************************************************************\n");
		ficha.append(String.format("%-20s%s\n","LOGRADOURO:", registroProfissional.getLogradouro()));
		ficha.append(String.format("%-20s%s\n","N�:", registroProfissional.getNumero()));
		ficha.append(String.format("%-20s%s\n","BAIRRO:", registroProfissional.getBairro()));
		ficha.append(String.format("%-20s%s\n","MUNIC�PIO:", registroProfissional.getMunicipio()));
		ficha.append(String.format("%-20s%s\n","UF:", registroProfissional.getUf()));
		ficha.append(String.format("%-20s%s\n","PAIS:", registroProfissional.getPais()));
		ficha.append("**********************************************************************\n");
		ficha.append("---------------------------SAL�RIO REQUERIDO--------------------------\n");
		ficha.append("**********************************************************************\n");
		ficha.append(String.format("%-20s%s\n","M�NIMO:", registroProfissional.getSalarioMinimo()));
		ficha.append(String.format("%-20s%s\n","M�XIMO:", registroProfissional.getSalarioMaximo()));
		ficha.append("**********************************************************************\n");
		ficha.append(String.format("%-20s%s\n","GRAU INSTRU��O:", registroProfissional.getGrau()));
		ficha.append("**********************************************************************\n");
	
	
		
		
		
		System.out.println(ficha);
				
	}

}

package cambioapp.util;

public class FormatUtilPower {

	//public static String cep(String cep)
	
	
	public static String cep(Long cep) {
		String cepFormatado = cep.toString().format("%08d", cep);//formatação de quantidade de caracteres
		cepFormatado = cepFormatado.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2-$3");//formatação do cep
		return cepFormatado;
		
		
		//cep = cep.replaceAll("(\\d{2})(\\d{3})(\\d{3})", "$1.$2-$3");
		//return cep;
	}
	
	public static String removerCaracteresEspeciais (String texto) {
		String textoSemCaractereEspecial = texto.replaceAll("\\D","");
		return textoSemCaractereEspecial;
	}
	public static void main(String[] args) {
		
		//String cep = "12350000";funcionou
		//String cep = "0630102";não funcionou
		//Integer cep = 0630102;não funcionou
		//Long cep = 0630102L; não funcionou
		
		Long cep = 630102L;
		
		String cepFormatado = cep(cep);
		System.out.println(cepFormatado);
		
		String cepSemFormatacao = removerCaracteresEspeciais(cepFormatado);
		System.out.println(cepSemFormatacao);
		
		
		
		//System.out.println(cep(cep.toString()));resultado=208962
		
		//System.out.println(cep(cep.toString()));
		
		System.out.println(cep(cep));
	}
}

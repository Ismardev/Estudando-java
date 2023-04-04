
public class TestaConversao {
	
	
	public static void main (String[]args) {
		
		//para declarar uma variavel flutuante tipo float eu preciso declarar que ela é float com f no final do valor ou (float) na frente do valor usando casting
		float valorflutuante = 3.14f ;
		
		
		double salario = 1270.50;
		int valor = (int) salario;
		System.out.println(valor);
		
		// o long precisa ter obrigatoriamente o l no final 
		long numerogrande = 34612546123546l;
		short valorpequeno = 2131;
		byte b = 127;
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println(total);
		
	}

}

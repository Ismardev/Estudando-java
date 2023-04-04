
public class TestaEscopo {
	
	public static void main(String[] args) {

		System.out.println("testando condicionais");
		
		int idade = 18;
		int quantidadedePessoas = 3;
		boolean acompanhado;
		
		if(quantidadedePessoas>=2) {
			
			acompanhado = true;
			
			}else {
			
			acompanhado = false;
		}
		
		//boolean acompanhado = quantidadedePessoas >=2;
		
		System.out.println("valor de acompanhado e " + acompanhado);
		
		if (idade >= 18 && acompanhado) {

			System.out.println("seja bem vindo ");
		
		}  else {
				
			System.out.println("infelizmente você tem menos que 18 anos ou nao esta acompanhado ");
		}
			
		

	}

}

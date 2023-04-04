
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");
		
		int idade = 22;
		int quantidadedePessoas = 3;
		
		if (idade >= 18) {

			System.out.println("voce tem mais de 18 anos ");
			System.out.println("seja bem vindo ");
		} else {
			
			if (quantidadedePessoas>=2) {
				
				System.out.println("voce tem menos que 18 anos mais esta acompanhado pode entrar");
				
			} else {
				System.out.println("infelizmente você tem menos que 18 anos ");
			}
			
		} 

	}

}

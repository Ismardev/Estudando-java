
public class TesteReferencias {

	public static void main (String[] args) {
		
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println(" saldo da primeira conta " + primeiraConta.saldo);
		
		// essa variavel segunda conta esta fazendo uma referencia para a primeira conta ou seja apontando para o mesmo objeto
		Conta segundaConta = primeiraConta;
		
		
		System.out.println("saldo da segunda conta " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		
		System.out.println(primeiraConta.saldo);
		
		if (primeiraConta == segundaConta) {
			
			System.out.println("sao a mesma conta !!");
			
		}
		
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		
	}
	
	
}

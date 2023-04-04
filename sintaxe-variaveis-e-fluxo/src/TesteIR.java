
public class TesteIR {

	public static void main (String [] args) {
		
		double salario = 3300;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			
			System.out.println("o IR e de 7.5% ");
			System.out.println("e pode deduzir ate R$: 142");
			
		} else {
			
			if (salario >=2800.01 && salario <= 3751.0) {
			
			System.out.println("o IR e de 15%");
			System.out.println("e pode deduzir ate R$: 350 ");
			
			}else {
				
				if (salario >=3751.01 && salario <= 4664.00) {
					
					System.out.println("o IR e de 22.5%");
					System.out.println("e pode deduzir ate R$: 636");
					
				}
			}
			
			
			
			
			
		}
		
		
	}
	
	
	
}

import java.util.Scanner;

public class Processador {

	public static void main(String[] args) {
		String processador;
		Scanner leia = new Scanner(System.in);
		boolean condition = true;
		
		while (condition == true) {
			
			System.out.println("\nVamos começar escolhendo seu processador: ");
			System.out.println("Escolha qual a linha de processadores de sua prêferencia"
					+ "\n1- AMD"
					+ "\n2- INTEL");
			
			int P = leia.nextInt();
			
			
			
			switch (P) {
			
			case 1: 
				
				System.out.println(" 1- Ryzen 3 3200g"
						 + "\n 2- Ryzen 5 5600g "
						 + "\n 3- Ryzen 7 8600g"
						 + "\n 4- Ryzen 9 5900xt"
						 + "\n 5- Ryzen 7 5800xt");
				condition = false;
				int escolhaAMD = leia.nextInt();
				
				switch (escolhaAMD) {
				case 1: 
					processador = "Ryzen 3 3200g";
					break;
					
				case 2: 
					processador = "Ryzen 5 5600g";
					break;
					
				case 3: 
				processador = "Ryzen 7 8600g";
					break;
					
				case 4: 
					processador = "Ryzen 9 5900xt";
					break;
					
				case 5: 
					processador = "Ryzen 7 5800xt";
					break;

					default: 

				}
				
				break;
				
				
			
			case 2: 
				System.out.println(
						   " 1- INTEL i5 14400"
						 + "\n 2- INTEL i3 14100f"
						 + "\n 3- INTEL i7 14700"
						 + "\n 4- INTEL i9 14900"
						 + "\n 5- INTEL i3 10320");  
				
				condition = false;
				int escolhaINTEL = leia.nextInt();
				
				switch (escolhaINTEL) {
				case 1: 
					processador = "INTEL i5 14400";
					break;
					
				case 2: 
					processador = "INTEL i3 14100f";
					break;
					
				case 3: 
				processador = "INTEL i7 14700";
					break;
					
				case 4: 
					processador = "INTEL i9 14900";
					break;
					
				case 5: 
					processador = "INTEL i3 10320";
					break;
						
				default: 
					System.out.println("você ta de sacanagem né meu mano");

				}
				
				break;
			}
				
            
				
		}
        

	}

}
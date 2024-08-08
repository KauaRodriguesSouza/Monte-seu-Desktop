import java.util.Scanner;

public class PlacaMae {

	public static void main(String[] args) {
		String PlacaMae;
		Scanner leia = new Scanner(System.in);
		boolean condition = true;
		
		while (condition == true) {
			
			System.out.println("\nAgora escolha sua Placa Mãe: ");
			System.out.println("Escolha qual a linha de placas Mãe é de sua prêferencia"
					+ "\n 1- AsROCK"
					+ "\n 2- Asus"
					+ "\n 3- Biostar"
					+ "\n 4- Gigabyte");
			
			int M = leia.nextInt();
			
			switch (M) {
			
			case 1: 
				
				System.out.println(
						   " 1- B550M-HDV DDR4"
						 + "\n 2- B550 Pro4 DDR4 "
						 + "\n 3- X570 Steel Legend DDR4"
						 + "\n 4- A520M-HVS DDR4"
						 + "\n 5- B550M Steel Legend DDR4");
				condition = false;
				int escolhaAsROCK = leia.nextInt();
				
				switch (escolhaAsROCK) {
				case 1: 
					PlacaMae = "B550M-HDV DDR4";
					break;
					
				case 2: 
					PlacaMae = "B550 Pro4 DDR4";
					break;
					
				case 3: 
					PlacaMae = "X570 Steel Legend DDR4";
					break;
					
				case 4: 
					PlacaMae = "A520M-HVS DDR4";
					break;
					
				case 5: 
					PlacaMae = "B550M Steel Legend DDR4";
					break;
                    						
				}
				
				break;
				
				
			
			case 2: 
				System.out.println(
						   " 1- Prime B550M-A DDR4"
						 + "\n 2- PRIME A520M-E DDR4"
						 + "\n 3- PRIME A520M-K DDR4"
						 + "\n 4- PRIME Z790-P DDR5"
						 + "\n 5- B760-PLUS DDR5");  
				
				condition = false;
				int escolhaAsus = leia.nextInt();
				
				switch (escolhaAsus) {
				case 1: 
					PlacaMae = "Prime B550M-A DDR4";
					break;
					
				case 2: 
					PlacaMae = "PRIME A520M-E DDR4";
					break;
					
				case 3: 
					PlacaMae = "PRIME A520M-K DDR4";
					break;
					
				case 4: 
					PlacaMae = "PRIME Z790-P DDR5";
					break;
					
				case 5: 
					PlacaMae = "B760-PLUS DDR5";
					break;
				
					default:
						
				}
				
				break;

				case 3: 
				System.out.println(
						   " 1- H610M DDR4"
						 + "\n 2- H510M DDR4"
						 + "\n 3- Z690A Valkyrie DDR4"
						 + "\n 4- Z690A Silver Racing DDR4"
						 + "\n 5- B760M DDR4");  
				
				condition = false;
				int escolhaBiostar = leia.nextInt();
				
				switch (escolhaBiostar) {
				case 1: 
					PlacaMae = "H610M DDR4";
					break;
					
				case 2: 
					PlacaMae = " H510M DDR4";
					break;
					
				case 3: 
					PlacaMae = "Z690A Valkyrie DDR4";
					break;
					
				case 4: 
					PlacaMae = "Z690A Silver Racing DDR4";
					break;
					
				case 5: 
					PlacaMae = "B760M DDR4";
					break;
				
					default:
						
				}
				
				break;

				case 4: 
				System.out.println(
						   " 1- B550M DS3H DDR4"
						 + "\n 2- Z790 UD AC DDR5"
						 + "\n 3- B650M DS3H DDR5"
						 + "\n 4- B760 Aorus Elite DDR5"
						 + "\n 5- B650E Aorus Master DDR5");  
				
				condition = false;
				int escolhaGigabyte = leia.nextInt();
				
				switch (escolhaGigabyte) {
				case 1: 
					PlacaMae = "B550M DS3H DDR4";
					break;
					
				case 2: 
					PlacaMae = "Z790 UD AC DDR5";
					break;
					
				case 3: 
					PlacaMae = "B650M DS3H DDR5";
					break;
					
				case 4: 
					PlacaMae = "B760 Aorus Elite DDR5";
					break;
					
				case 5: 
					PlacaMae = "B650E Aorus Master DDR5";
					break;
						
				}
				
				break;
				
			}
				
				
		}
	}

}
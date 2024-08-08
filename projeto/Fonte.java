import java.util.Scanner;

public class Fonte {

	public static void main(String[] args) {
		String fonte;
		Scanner leia = new Scanner(System.in);
		boolean condition = true;
		
		while (condition == true) {
			
			System.out.println("\n Agora escolha sua fonte: ");
			System.out.println("Escolha qual a linha de fonte de sua prêferencia"
					+ "\n1- PICHAU"
					+ "\n2- ASUS"
                    + "\n2- CORSAIR"
                    + "\n2- REDRAGON");
			
			int F = leia.nextInt();
			
			
			
			switch (F) {
			
			case 1: 
				
				System.out.println(" 1- Nidus 650L, 650W"
						 + "\n 2- Nidus, 850W "
						 + "\n 3- Nidus 750L, 750W"
						 + "\n 4- Nidus 550L, 550W");
				condition = false;
				int escolhaPichau = leia.nextInt();
				
				switch (escolhaPichau) {
				case 1: 
					fonte = "Nidus 650L, 650W";
					break;
					
				case 2: 
					fonte = "Nidus, 850W";
					break;
					
				case 3: 
				    fonte = "Nidus 750L, 750W";
					break;
					
				case 4: 
					fonte = "Nidus 550L, 550W";
					break; 

				}
				
				break;
				
				
			
			case 2: 
				System.out.println(
						   " 1- Tuf Gaming, Full-Modular, 1200W"
						 + "\n 2- TUF Gaming, 1000W"
						 + "\n 3- Prime, Full-Modular, 750W"
						 + "\n 4- ROG STRIX, 1000W"
						 + "\n 5- ROG THOR 1000W");  
				
				condition = false;
				int escolhaAsus = leia.nextInt();
				
				switch (escolhaAsus) {
				case 1: 
					fonte = "Tuf Gaming, Full-Modular, 1200W";
					break;
					
				case 2: 
					fonte = "TUF Gaming, 1000W";
					break;
					
				case 3: 
				    fonte = " Prime, Full-Modular, 750W";
					break;
					
				case 4: 
					fonte = "ROG STRIX, 1000W";
					break;
					
				case 5: 
					fonte = "ROG THOR 1000W";
					break;

				}
				
				break;

                case 3: 
				System.out.println(
						   " 1- RM1200x, 1200w"
						 + "\n 2- HX1000i, 1000W"
						 + "\n 3- CV Series CV550 550W"
						 + "\n 4- HX750, 750W"
						 + "\n 5- RMx Series RM1000x, 1000W");  
				
				condition = false;
				int escolhaCorsair = leia.nextInt();
				
				switch (escolhaCorsair) {
				case 1: 
					fonte = "RM1200x, 1200w";
					break;
					
				case 2: 
					fonte = "HX1000i, 1000W";
					break;
					
				case 3: 
				    fonte = "CV Series CV550 80 Plus Bronze 550W";
					break;
					
				case 4: 
					fonte = "HX750, 750W";
					break;
					
				case 5: 
					fonte = "RMx Series RM1000x, 1000W";
					break;
						
				default: 
					System.out.println("você ta de sacanagem né meu mano");

				}
				
				break;

                case 4: 
				System.out.println(
						   " 1- RGPS 500W"
						 + "\n 2- Power Supply, 1300W"
						 + "\n 3- Power Supply RGB, 850W"
						 + "\n 4- RGPS 600W"
						 + "\n 5- Power Supply RGB, 750W");  
				
				condition = false;
				int escolhaRedragon = leia.nextInt();
				
				switch (escolhaRedragon) {
				case 1: 
					fonte = "RGPS 500W";
					break;
					
				case 2: 
					fonte = "Power Supply, 1300W";
					break;
					
				case 3: 
				    fonte = "Power Supply RGB, 850W";
					break;
					
				case 4: 
					fonte = "RGPS 600W";
					break;
					
				case 5: 
					fonte = "Power Supply RGB, 750W";
					break;
						
				}
				
				break;

			}
				
            
				
		}
        

	}

}
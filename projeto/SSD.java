import java.util.Scanner;

public class SSD {

	public static void main(String[] args) {
		String ssd;
		Scanner leia = new Scanner(System.in);
		boolean condition = true;
		
		while (condition == true) {
			
			System.out.println("\n Agora escolha seu SSD: ");
			System.out.println("Escolha qual a linha de ssdes de sua prêferencia"
					+ "\n1- PICHAU"
					+ "\n2- KINGSTON"
                    + "\n3- REDRAGON"
                    + "\n4- SAMSUNG");
			
			int S = leia.nextInt();
			
			
			
			switch (S) {
			
			case 1: 
				
				System.out.println(" 1- Rover, 2TB"
						 + "\n 2- Rover X, 1TB "
						 + "\n 3- Aldrin PRO, 512GB"
						 + "\n 4- Kepler L, 512GB"
						 + "\n 5- Aldrin A1, 2TB");
				condition = false;
				int escolhaPichau = leia.nextInt();
				
				switch (escolhaPichau) {
				case 1: 
					ssd = "Rover, 2TB";
					break;
					
				case 2: 
					ssd = "Rover X, 1TB";
					break;
					
				case 3: 
				ssd = "Aldrin PRO, 512GB";
					break;
					
				case 4: 
					ssd = "Kepler L, 512GB";
					break;
					
				case 5: 
					ssd = "Aldrin A1, 2TB";
					break;

					default: 

				}
				
				break;
				
				
			
			case 2: 
				System.out.println(
						   " 1- KC600, 256GB"
						 + "\n 2- DC600M, 960GB"
						 + "\n 3-  Fury Renegade, 4TB"
						 + "\n 4- XS2000, 1TB"
						 + "\n 5- INTEL i3 10320");  
				
				condition = false;
				int escolhaKingston = leia.nextInt();
				
				switch (escolhaKingston) {
				case 1: 
					ssd = "KC600, 256GB";
					break;
					
				case 2: 
					ssd = "DC600M, 960GB";
					break;
					
				case 3: 
				    ssd = " Fury Renegade, 4TB";
					break;
					
				case 4: 
					ssd = "XS2000, 1TB";
					break;
					
				case 5: 
					ssd = "Center Enterprise DC600M, 7.68TB";
					break;

				}
				
				break;

                case 3: 
				System.out.println(
						   " 1- Ember, 512GB"
						 + "\n 2- Blaze, 1TB"
						 + "\n 3- Spark, 960GB"
						 + "\n 4-  Haste, 960GB"
						 + "\n 5- Ember, 256GB");  
				
				condition = false;
				int escolhaRedragon = leia.nextInt();
				
				switch (escolhaRedragon) {
				case 1: 
					ssd = "Ember, 512GB";
					break;
					
				case 2: 
					ssd = "Blaze, 1TB";
					break;
					
				case 3: 
				    ssd = " Spark, 960GB";
					break;
					
				case 4: 
					ssd = " Haste, 960GB";
					break;
					
				case 5: 
					ssd = "Ember, 256GB";
					break;
						
				default: 
					System.out.println("você ta de sacanagem né meu mano");

				}
				
				break;

                case 4: 
				System.out.println(
						   " 1- 870 EVO, 4TB"
						 + "\n 2- 990 PRO, 4TB"
						 + "\n 3- T7, 1TB"
						 + "\n 4- 980 PRO, 2TB"
						 + "\n 5- V-Nand 870 EVO, 2TB");  
				
				condition = false;
				int escolhaSamsung = leia.nextInt();
				
				switch (escolhaSamsung) {
				case 1: 
					ssd = "870 EVO, 4TB";
					break;
					
				case 2: 
					ssd = " 990 PRO, 4TB";
					break;
					
				case 3: 
				    ssd = "T7, 1TB";
					break;
					
				case 4: 
					ssd = "980 PRO, 2TB";
					break;
					
				case 5: 
					ssd = "V-Nand 870 EVO, 2TB";
					break;
						
				default: 
					System.out.println("você ta de sacanagem né meu mano");

				}
				
				break;
			}
				
            
				
		}
        

	}

}
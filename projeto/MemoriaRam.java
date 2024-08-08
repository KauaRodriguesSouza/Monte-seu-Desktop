import java.util.Scanner;

public class MemoriaRam {

	public static void main(String[] args) {
		String memoriaRam;
		Scanner leia = new Scanner(System.in);
		boolean condition = true;

		while (condition == true) {

			System.out.println("\n Agora escolha sua memória ram: ");
			System.out.println("Escolha qual a linha de memoria ram de sua prêferencia"
					+ "\n 1- CORSAIR"
					+ "\n 2- KINGSTON"
					+ "\n 3- REDRAGON");

			int R = leia.nextInt();

			switch (R) {

				case 1:

					System.out.println(" 1- ValueSelect 4GB"
							+ "\n 2- Vengeance 32GB "
							+ "\n 3- VALUESELECT 16GB"
							+ "\n 4- Vengeance, 96GB"
							+ "\n 5- Vengeance LPX 16GB");
					condition = false;
					int escolhaCorsair = leia.nextInt();

					switch (escolhaCorsair) {
						case 1:
							memoriaRam = "ValueSelect, 4GB";
							break;

						case 2:
							memoriaRam = "Vengeance DDR5 32GB";
							break;

						case 3:
							memoriaRam = "VALUESELECT 16GB";
							break;

						case 4:
							memoriaRam = "Vengeance, 96GB";
							break;

						case 5:
							memoriaRam = "Vengeance LPX 16GB";
							break;

						default:

					}

					break;

				case 2:
					System.out.println(
							" 1- Fury Renegade 8GB"
									+ "\n 2- Fury Beast, 16GB"
									+ "\n 3- Fury Renegade 32GB"
									+ "\n 4- HyperX Fury 8GB"
									+ "\n 5- HyperX Savage 4GB");

					condition = false;
					int escolhaKingston = leia.nextInt();

					switch (escolhaKingston) {
						case 1:
							memoriaRam = "Fury Renegade 8GB";
							break;

						case 2:
							memoriaRam = "Fury Beast, 16GB";
							break;

						case 3:
							memoriaRam = "Fury Renegade 32GB";
							break;

						case 4:
							memoriaRam = "HyperX Fury 8GB";
							break;

						case 5:
							memoriaRam = "INTEL i3 10320";
							break;

					}

					break;

				case 3:

					System.out.println(
							"1- Magma, RGB, 32GB"
									+ "\n 2- Solar, RGB, 16GB "
									+ "\n 3- Rage, 16GB"
									+ "\n 4- Flame, 16GB"
									+ "\n 5- Flame, 8GB");
					condition = false;
					int escolhaRedragon = leia.nextInt();

					switch (escolhaRedragon) {
						case 1:
							memoriaRam = "Magma, RGB, 32GB";
							break;

						case 2:
							memoriaRam = "Solar, RGB, 16GB";
							break;

						case 3:
							memoriaRam = "Rage, 16GB";
							break;

						case 4:
							memoriaRam = "Flame, 16GB";
							break;

						case 5:
							memoriaRam = "Flame, 8GB";
							break;

						default:

					}

					break;
			}

		}

	}

}
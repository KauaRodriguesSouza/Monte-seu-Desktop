import java.util.Scanner;
public class Sistema {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);


		
		System.out.println("Olá, bem vindo a ALL TECH! ");
		System.out.println("Comece a montar seu computador e viver sua diversão");
		
		System.out.println("1- para começar a montagem do seu desktop"
						 + "\n2- sair do nosso site");
		int num = leia.nextInt();	
		
		switch (num) {
			case 1 : {
				System.out.println("Oba vamos começar a planejar seu computador...");
				Processador.main(args);
				PlacaMae.main(args);
				MemoriaRam.main(args);
				SSD.main(args);
				Fonte.main(args);
				
			}
			case 2: {
				System.out.println("Você saiu do noso site");
				break;
			}	
		}

		
			
	}
}
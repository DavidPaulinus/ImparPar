package DesafioImparPar;

import java.util.Locale;
import java.util.Scanner;
import NumImparPar.gerador;

public class SistemaImparPar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num;
		String letra;
		gerador.generateRandomIntIntRange(0, 10);
		
		System.out.print("Ímpar [i] ou par [p]? ");
		letra=sc.next();
		System.out.print("Manda o número que você quer usar de 0 à 10: ");
		num=sc.nextInt();
		
		if (num<0 || num>10) {
			System.out.println("Opa, eu falei de 0 até 10, parceiro. Esse número aí é inválido");
		}else {
			int result = num + gerador.generateRandomIntIntRange(0, 10);
			
			System.out.println("Resultado: " + result);
			
			if (letra.equalsIgnoreCase("i") && result%2==1) {
				System.out.println("Parabéns!!! Deu ímpar mesmo");
			}
			
			if (letra.equalsIgnoreCase("i") && result%2==0) {
				System.out.println("Deu par, mals ae ;-;");
			}
			
			if(letra.equalsIgnoreCase("p") && result%2==0) {
				System.out.println("Parabéns!!! Deu par mesmo");
			}
			
			if(letra.equalsIgnoreCase("p") && result%2==1) {
				System.out.println("Deu ímpar, mals ae ;-;");
			}
			else {
				System.out.println("Mano, eu falei [i] ou [p]. Essa opção aí é inválida, deixa de ser retardado.");
			}
		}
		sc.close();
	}

}

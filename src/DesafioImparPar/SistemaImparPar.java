package DesafioImparPar;

import java.util.Locale;
import java.util.Scanner;
import NumImparPar.gerador;

public class SistemaImparPar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num,result;
		String letra, strg="Resultado";
		gerador.generateRandomIntIntRange(0, 10);
		
		System.out.print("Ímpar [i] ou par [p]? ");
		letra=sc.next();
		
		if(letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("p")) {
		
			System.out.print("Manda o número que você quer usar de 0 à 10: ");
			num=sc.nextInt();
		
			if (num<0 || num>10) {
			System.out.println("Opa, eu falei de 0 até 10, parceiro. Esse número aí é inválido.");
			}
			
			else {
				result = num + gerador.generateRandomIntIntRange(0, 10);
			
				System.out.printf("%-13s%03d%n", strg, result);
			
				/*"%s ->pra texto, 13->denota q a string tem no minimo 13 espaços, 
				'-' -> indica que a string tem que estar na esquerda/começo da tela*/
				
				/*%d -> pra inteiros, 0 -> indica que o int vai ser preenchida com 0 antes, 
				3-> a int tem que ter no mínimo 3 espaços*/
				
				//%n ->quebra de linha
				
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
			}
		}
		else {
			System.out.println("Mano, eu falei [i] ou [p]. Essa opção aí é inválida, deixa de ser retardado.");
		}
		sc.close();
	}

}

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
		
		System.out.print("�mpar [i] ou par [p]? ");
		letra=sc.next();
		System.out.print("Manda o n�mero que voc� quer usar de 0 � 10: ");
		num=sc.nextInt();
		
		if (num<0 || num>10) {
			System.out.println("Opa, eu falei de 0 at� 10, parceiro. Esse n�mero a� � inv�lido");
		}else {
			int result = num + gerador.generateRandomIntIntRange(0, 10);
			
			System.out.println("Resultado: " + result);
			
			if (letra.equalsIgnoreCase("i") && result%2==1) {
				System.out.println("Parab�ns!!! Deu �mpar mesmo");
			}
			
			if (letra.equalsIgnoreCase("i") && result%2==0) {
				System.out.println("Deu par, mals ae ;-;");
			}
			
			if(letra.equalsIgnoreCase("p") && result%2==0) {
				System.out.println("Parab�ns!!! Deu par mesmo");
			}
			
			if(letra.equalsIgnoreCase("p") && result%2==1) {
				System.out.println("Deu �mpar, mals ae ;-;");
			}
			else {
				System.out.println("Mano, eu falei [i] ou [p]. Essa op��o a� � inv�lida, deixa de ser retardado.");
			}
		}
		sc.close();
	}

}

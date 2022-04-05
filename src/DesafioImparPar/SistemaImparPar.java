package DesafioImparPar;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class SistemaImparPar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int num;
		char letra;
		
		System.out.print("Impar ou par? ");
		letra=sc.next().charAt(0);
		System.out.print("Manda o número que você quer usar: ");
		num=sc.nextInt();
		
		System.out.println(letra);
		
		sc.close();
	}

}

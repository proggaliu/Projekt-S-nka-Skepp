package sankaSkepp;

import java.util.Scanner;


public class Spelplan {
	
	
	//Anv�nder h�mtar koordinater fr�n tangentbordet
	public static String nyaKoordinater() {
		String nyKoordinat = "";
		String siffror = "123456789";
		String bokstaver = "ABCDEFGHJI";
		
		do {Scanner scanner = new Scanner(System.in);
		nyKoordinat = scanner.toString(); }while ((nyKoordinat.length()==2) || //Anv�nd IndexOf f�r att kontorllera inputdata
				
		return nyKoordinat; //String p� formen plats0: siffra, plats1: bokstav
	}

	public static void main(String[] args) {
		//Initerar variabler f�r spelplanen och specifierar att spelplanen ska vara tio g�nger tio rutor
		int kolumn = 10;
		int rad = 10;
		int j = 0;
		int i = 0;

		int [][] nySpelplan = new int[kolumn][rad];


		//Fyller spelplanen med vatten
		for(i = 0; i < rad; i++){
			for(j = 0; j < kolumn; j++){
				nySpelplan[i][j] = -1;
			}
		}
	}


	
	//Metoden f�r att l�gga ut b�tar p� spelplaen
	public static int [][] placeraFartyg (int [][] nySpelplan) {
	
		Scanner scanner = new Scanner(System.in);
		int j = 0;
		int i = 0;
		
		System.out.println("P� vilken rad vill du placera din b�t?");
		i = scanner.nextInt()-1;
		System.out.println("P� vilken kolumn vill du placera din b�t?");
		j = scanner.nextInt()-1;

		nySpelplan[i][j] = 5;

return nySpelplan;

	}
		//Prova att skjuta
	public static int [][] skjut (int [][] nySpelplan) {
		boolean result = false;

		int j = 0;
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("P� vilken rad vill du skjuta?");
		i = scanner.nextInt()-1;
		System.out.println("P� vilken kolumn vill du skjuta?");
		j = scanner.nextInt()-1;

		if(nySpelplan[i][j] == 5) { System.out.println("Tr�ff"); nySpelplan[i][j] = 10;}
		else if (nySpelplan[i][j] == -1) {System.out.println("Miss"); nySpelplan[i][j] = 7;}
		return null;
	}

	
//Metoden som anv�nds f�r att printa spelplanen
	public static void visaPlanen (int [][] nySpelplan) {
		System.out.print("  A B C D E F G H I");
		for(int r =0; r < 9; r++)	
		{ 	
			System.out.println("");
			System.out.print((r + 1) + "");
			for(int c = 0; c < 9; c++)
			{

				if(nySpelplan[r][c] == -1)
				{
					System.out.print(" ~");//vatten
				}
				else if (nySpelplan[r][c] == 5)
				{
					System.out.print(" x");//b�t
				}

				else if (nySpelplan[r][c] == 10)
				{
					System.out.print(" t");//tr�ff
				}
				else if (nySpelplan[r][c] == 7)
				{
					System.out.print(" m");//miss
				}
			}
		}
		System.out.println("");
	}
}



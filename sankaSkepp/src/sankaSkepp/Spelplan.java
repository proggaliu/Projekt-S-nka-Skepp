package sankaSkepp;

import java.util.Scanner;


public class Spelplan {
	
	
	//Metod f�r att h�mta koordinater fr�n tangentbordet
	public static String nyaKoordinater() {
		String nyKoordinat = "";
		String siffror = "123456789";
		String bokstaver = "ABCDEFGHIJabcdefghij";
		
		do {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Koordinater anges p� formen bokstav siffra, utan mellanslag. Detta kan exempelvis vara 'H5'");
		nyKoordinat = scanner.nextLine();
		}
		while ((nyKoordinat.length()!=2) || ((siffror.indexOf(nyKoordinat.charAt(1))) != -1) || ((bokstaver.indexOf(nyKoordinat.charAt(0))) != -1));
				
		return nyKoordinat; //String p� formen plats0: siffra, plats1: bokstav
	}

	public static void main(String[] args) {
		//Initerar variabler f�r spelplanen och specifierar att spelplanen ska vara tio g�nger tio rutor
		int kolumn = 9;
		int rad = 9;
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

	
	//Metod f�r regler f�r utplacering av b�tar
	public static boolean reglerPlaceraBat(int [][] nySpelplan, int i, int j) {
		boolean platsOk = true;
		
		
		//TODO: Kontrollera att det inte redan ligger en b�t p� platsen
		//TODO: Kontrollera att det inte ligger en annan b�t innom den n�rmsta rutan
		
		
		
		
		return platsOk;
	}

	
	//Metoden f�r att l�gga ut b�tar p� spelplaen
	public static int [][] placeraFartyg (int [][] nySpelplan) {
	
		int j = 0;
		int i = 0;
		String koordinat = "";
		
		System.out.println("P� vilka koordinater vill du placera din b�t?");
		koordinat = nyaKoordinater();
		j = (int) koordinat.charAt(1) - 1;
		
		if (koordinat.charAt(0) == 'A' || koordinat.charAt(0) == 'a') {j = 0;}
		if (koordinat.charAt(0) == 'B' || koordinat.charAt(0) == 'b') {j = 1;}
		if (koordinat.charAt(0) == 'C' || koordinat.charAt(0) == 'c') {j = 2;}
		if (koordinat.charAt(0) == 'D' || koordinat.charAt(0) == 'd') {j = 3;}
		if (koordinat.charAt(0) == 'E' || koordinat.charAt(0) == 'e') {j = 4;}
		if (koordinat.charAt(0) == 'F' || koordinat.charAt(0) == 'f') {j = 5;}
		if (koordinat.charAt(0) == 'G' || koordinat.charAt(0) == 'g') {j = 6;}
		if (koordinat.charAt(0) == 'H' || koordinat.charAt(0) == 'h') {j = 7;}
		if (koordinat.charAt(0) == 'I' || koordinat.charAt(0) == 'i') {j = 8;}
		if (koordinat.charAt(0) == 'j' || koordinat.charAt(0) == 'j') {j = 9;}
		
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



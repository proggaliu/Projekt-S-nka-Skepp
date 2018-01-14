package sankaSkepp;

import java.util.Scanner;


public class Spelplan {
	
	
	//Metod för att hämta koordinater från tangentbordet
	public static String nyaKoordinater() {
		String nyKoordinat = "";
		String siffror = "123456789";
		String bokstaver = "ABCDEFGHIJabcdefghij";
		
		do {	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Koordinater anges på formen bokstav siffra, utan mellanslag. Detta kan exempelvis vara 'H5'");
		nyKoordinat = scanner.nextLine();
		}
		while ((nyKoordinat.length()!=2) || ((siffror.indexOf(nyKoordinat.charAt(1))) != -1) || ((bokstaver.indexOf(nyKoordinat.charAt(0))) != -1));
				
		return nyKoordinat; //String på formen plats0: siffra, plats1: bokstav
	}

	public static void main(String[] args) {
		//Initerar variabler för spelplanen och specifierar att spelplanen ska vara tio gånger tio rutor
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

	
	//Metod för regler för utplacering av båtar
	public static boolean reglerPlaceraBat(int [][] nySpelplan, int i, int j) {
		boolean platsOk = true;
		
		
		//TODO: Kontrollera att det inte redan ligger en båt på platsen
		//TODO: Kontrollera att det inte ligger en annan båt innom den närmsta rutan
		
		
		
		
		return platsOk;
	}

	
	//Metoden för att lägga ut båtar på spelplaen
	public static int [][] placeraFartyg (int [][] nySpelplan) {
	
		int j = 0;
		int i = 0;
		String koordinat = "";
		
		System.out.println("På vilka koordinater vill du placera din båt?");
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
		
		System.out.println("På vilken rad vill du skjuta?");
		i = scanner.nextInt()-1;
		System.out.println("På vilken kolumn vill du skjuta?");
		j = scanner.nextInt()-1;

		if(nySpelplan[i][j] == 5) { System.out.println("Träff"); nySpelplan[i][j] = 10;}
		else if (nySpelplan[i][j] == -1) {System.out.println("Miss"); nySpelplan[i][j] = 7;}
		return null;
	}

	
//Metoden som används för att printa spelplanen
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
					System.out.print(" x");//båt
				}

				else if (nySpelplan[r][c] == 10)
				{
					System.out.print(" t");//träff
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



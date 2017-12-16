package sankaSkepp;

import java.util.Scanner;


public class Spelplan {

	public static void main(String[] args) {
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
	//Använder hämtar koordinater från tangentbordet
	public static String nyaKoordinater() {
		String nyKoordinat = "";
		
		do {Scanner scanner = new Scanner(System.in);
		nyKoordinat = scanner.toString();} while (nyKoordinat.length() == 2);
				
		return nyKoordinat;
	}

	
	//Metoden för att lägga ut båtar på spelplaen
	public static int [][] placeraFartyg (int [][] nySpelplan) {
	
		
		System.out.println("På vilken rad vill du placera din båt?");
		i = scanner.nextInt()-1;
		System.out.println("På vilken kolumn vill du placera din båt?");
		j = scanner.nextInt()-1;

		nySpelplan[i][j] = 5;

return nySpelplan;

	}
		//Prova att skjuta
	public static int [][] skjut (int [][] nySpelplan) {
		boolean result = false;

		System.out.println("På vilken rad vill du skjuta?");
		i = scanner.nextInt()-1;
		System.out.println("På vilken kolumn vill du skjuta?");
		j = scanner.nextInt()-1;

		if(nySpelplan[i][j] == 5) { System.out.println("Träff"); nySpelplan[i][j] = 10;}
		else if (nySpelplan[i][j] == -1) {System.out.println("Miss"); nySpelplan[i][j] = 7;}
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



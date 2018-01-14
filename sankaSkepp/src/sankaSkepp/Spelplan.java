package sankaSkepp;

import java.util.Scanner;

public class Spelplan {

	private static int [][] spelPlanen;
	private int planKolumn;
	private int planRad;
	private static Skepp[] allaSkepp;

	static {
		allaSkepp = new Skepp[] {

				new Skepp(2,"ubat1"),		
				new Skepp(2,"ubat2"),
				new Skepp(2,"ubat3"),
				new Skepp(3,"jagare1"),
				new Skepp(3,"jagare2"),
				new Skepp(4,"superbat"),
		};
	}

	public Spelplan(int kolumn, int rad) {

		planKolumn = kolumn;
		planRad = rad;

		spelPlanen = new int [kolumn][rad];

		// Fyller spelplanen med vatten
		for(int i = 0; i < kolumn; i++){
			for(int j = 0; j < rad; j++){
				spelPlanen[i][j] = -1;
			}
		}
	}
	public static void placeraFartyg()
	{

		for(Skepp Skepp : allaSkepp)
		{
			visaPlanen();
			System.out.println("Välj vart du vill att din " + Skepp.getName() + "ska utgå ifrån, tänk på att det måste vara minst en ruta mellan skeppen.");
			placeraFartyg2(Skepp.getSize()); //Hur kommer programmet ihåg denna koordinat?
			visaPlanen();
		}
	}

	public static void  placeraFartyg2(int sz) {

		int j = 0;
		int i = 0;
		int riktning = 0;
		String koordinat = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("På vilka koordinater vill du placera din båt?");
		koordinat = nyaKoordinater();
		i =  Integer.parseInt(String.valueOf(koordinat.charAt(1))) - 1;

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

		if (reglerPlaceraBat(i, j)) {
			spelPlanen[i][j] = 5;
		}
		else {System.out.println("Här får du inte placera ditt fartyg");}

		System.out.println("I vilken riktning vill du placera ditt fartyg?\nTryck 1 för vertikalt eller 2 för horisontalt. " +
				"Tänk på att båten måste ligga inom spelplanen och att det måste vara minst en ruta mellan skeppen.");

		riktning = scan.nextInt();

		// Placerar ut skeppet i den riktning som användaren skriver in
		if(riktning == 1 )

		{
			i++;
			for(int temp = 0; temp < sz; temp++)
			{

				if (reglerPlaceraBat(i, j)) {
					spelPlanen[i][j] = 5;
					i++;
				}
				else {System.out.println("Här får du inte placera ditt fartyg");}
			}

		}


		if(riktning == 2)
		{
			j++;
			for(int temp = 0; temp < sz; temp++)
			{

				if (reglerPlaceraBat(i, j)) {
					spelPlanen[i][j] = 5;
					j++;
				}
				else {System.out.println("Här får du inte placera ditt fartyg");}
			}

		}

	}

	public static boolean  reglerPlaceraBat(int i, int j) {
		boolean platsOk = true;

		if (spelPlanen[i][j]==5){platsOk = false;}

		//TODO: Kontrollera om det ligger någon annan båt brevid den vi ska placera ut.

		return platsOk;
	}

	//Metod f�r att h�mta koordinater från tangentbordet

	public static String nyaKoordinater() {

		String nyKoordinat = "";
		String siffror = "123456789";
		String bokstaver = "ABCDEFGHIJabcdefghij";

		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Koordinater anges på formen bokstav siffra, utan mellanslag. Detta kan exempelvis vara 'H5'");
			nyKoordinat = scanner.nextLine();
		}
		while ((nyKoordinat.length()!=2) || ((siffror.indexOf(nyKoordinat.charAt(1))) == -1) || ((bokstaver.indexOf(nyKoordinat.charAt(0))) == -1));


		return nyKoordinat; //String p� formen plats0: siffra, plats1: bokstav
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


	//Metoden som anv�nds f�r att printa spelplanen
	public static void visaPlanen () {
		
		System.out.print("  A B C D E F G H I");
		
		for(int r =0; r < 9; r++)	
		{ 	
			System.out.println("");
			System.out.print((r + 1) + "");
			
			for(int c = 0; c < 9; c++)
			{
				if(spelPlanen[r][c] == -1)
				{
					System.out.print(" ~");//vatten
				}
				else if (spelPlanen[r][c] == 5)
				{
					System.out.print(" x");//båt
				}

				else if (spelPlanen[r][c] == 10)
				{
					System.out.print(" t");//träff
				}
				else if (spelPlanen[r][c] == 7)
				{
					System.out.print(" m");//miss
				}
			}
		}
		System.out.println("");
	}
}


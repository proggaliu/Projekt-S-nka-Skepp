package sankaSkepp;

import java.util.*;

public class Main {

	public static void main(String[] args) {	

		int val = 0;

		System.out.println("Väkommen, vill du spela mot en annan person eller datorn?");
		System.out.println("Tryck 1 för annan spelare, tryck 2 för datorn");

		while(val != 1 && val != 2)

		{
			try
			{
				Scanner scan = new Scanner(System.in);
				val = scan.nextInt();
				if(val != 1 && val != 2)
				{
					System.out.println("Skriv endast 1 eller 2");		
				}

			}
			catch(Exception InputMismatchException)
			{			
				System.out.println("Skriv endast 1 eller 2");		
			}
		}

		// Skapar spelare
		if(val == 1)
		{
			ManniskaSpelare spelare1 = new ManniskaSpelare();
			ManniskaSpelare spelare2 = new ManniskaSpelare();

			spelare1.placeraFartyg();

		}
		else if (val == 2)
		{
			ManniskaSpelare spelare1 = new ManniskaSpelare();
			AIspelare aispelare = new AIspelare();	
		}
	}
}
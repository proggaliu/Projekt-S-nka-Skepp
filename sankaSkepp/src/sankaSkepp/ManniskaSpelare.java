package sankaSkepp;

import java.util.Scanner;

public class ManniskaSpelare {
	
	static Spelplan spelplan;
	static Spelplan traffplan;
	
	
	public ManniskaSpelare() {	
		Spelplan spelPlan =  new Spelplan (9,9);
		Spelplan traffPlan  =  new Spelplan (9,9);	
	}
	
	public static void placeraFartyg()
	{
		Spelplan.placeraFartyg();
	}
}
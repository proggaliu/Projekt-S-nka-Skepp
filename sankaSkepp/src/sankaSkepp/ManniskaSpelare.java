package sankaSkepp;

import java.util.Scanner;

public class ManniskaSpelare {
	
	static SpelPlan spelPlan;
	static SpelPlan traffPlan;
	
	
	public ManniskaSpelare() {	
		SpelPlan spelPlan =  new SpelPlan (9,9);
		SpelPlan traffPlan  =  new SpelPlan (9,9);	
	}
	
	public static void placeraFartyg()
	{
		SpelPlan.placeraFartyg();
	}
}
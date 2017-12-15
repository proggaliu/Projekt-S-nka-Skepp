package sankaSkepp;

import java.util.Scanner;


public class Spelplan {

	public static void main(String[] args) {
	 int columns = 10;
	    int rows = 10;
	    int j = 0;
	    int i = 0;

	    String[][] nySpelplan = new String[columns][rows];
	    
	    
	   
	    for(i = 0; i < rows; i++){
	        for(j = 0; j < columns; j++){
	        	nySpelplan[i][j] = "~";
	        }
	    }
	    
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("På vilken rad vill du placera din båt?");
	    i = scanner.nextInt();
	    System.out.println("På vilken kolumn vill du placera din båt?");
	    j = scanner.nextInt();
	    
	    nySpelplan[i][j] = "x";
	    
	    
	    for(i = 0; i < rows; i++){
	    	System.out.println();
	        for(j = 0; j < columns; j++){
	            System.out.print(nySpelplan[i][j]);
	        }
	    }
	    }
	    
}



package Tools;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Toolbox {

	//fonction pour recuperer un String via un scanner et le renvoi
		public static String inputString(String message) {
			System.out.println(message);
			Scanner scan = new Scanner (System.in);
			return scan.nextLine();
	}
	
	//fonction pour recuperer un char via un scanner et le renvoi
		public static char inputChar(String message) {
			System.out.println(message);
			Scanner scan = new Scanner (System.in);
			return scan.nextLine().charAt(0);
	}
	
	
	//fonction pour recuperer un int via un scanner et le renvoi
		public static int inputInt(String message) {
			System.out.println(message);
			Scanner scan = new Scanner (System.in);
			return scan.nextInt();	
	}
	
	//fonction pour recuperer un double via un scanner et le renvoi
		public static double inputDouble(String message) {
			System.out.println(message);
			Scanner scan = new Scanner (System.in);
			return scan.nextDouble();		
	}
	    
    //fonction pour generer un int aleatoire entre deux limites
	    public static int randomInt(int limiteBasse , int limiteHaute) {
	    	Random r = new Random();
	    	// si limite basse  = 10 et limite haute = 100
	    	// 10 + (100 - 10) * nombre aleatoire == nombre entre 10 et 100
	    	double randomValue = limiteBasse + (limiteHaute - limiteBasse) * r.nextDouble();
	    	return (int) randomValue;
    }
    
    //fonction ppour generer un double aleatoire entre deux limites
        public static double randomDouble(int limiteBasse , int limiteHaute) {
        	Random r = new Random();
        	// si limite basse  = 10 et limite haute = 100
        	// 10 + (100 - 10) * nombre aleatoire == nombre entre 10 et 100
        	double randomValue = limiteBasse + (limiteHaute - limiteBasse) * r.nextDouble();
        	return randomValue;
    }
       
    // fonction pour melanger une liste de joueurs
	public static List<String>initPlayerOrder(int nbPlayer){
		//creation de la liste des joueurs
		List<String>ListPlayer = new ArrayList<>();
		//insertion des joueurs
		for (int i = 0; i < nbPlayer; i++) {
			ListPlayer.add(i, "Joueur " + (i+1));
			//on tire au hasard l'ordre des joueurs
			Collections.shuffle(ListPlayer);
		}return ListPlayer;
	}
       
	public static void printTab(String case1, String case2, String case3, String case4, String case5, String case6, String case7, String case8, String case9) {
		
		System.out.println(" " + case1 + " | " + case2 + " | " + case3 );
		System.out.println("---|---|---");
		System.out.println(" " + case4 + " | " + case5 + " | " + case6 );
		System.out.println("---|---|---");
		System.out.println(" " + case7 + " | " + case8 + " | " + case9 );
		System.out.println();
	}
}

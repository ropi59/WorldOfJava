package Run;
import java.util.Scanner;

import Characters.AbstractFighters;
import Characters.Character;
import Characters.Monsters;
import Tools.Toolbox;

public class World {

	static Scanner scan = new Scanner(System.in);
	//methods
	//character creation with name choose by user
	public static AbstractFighters characterFactory() {
		String pseudo = Toolbox.inputString("Enter character name :");
		int hp = (Toolbox.randomInt(700, 1000));
		int atk = (Toolbox.randomInt(50, 100));
		AbstractFighters perso = new Character(pseudo, hp, atk);
		
	return perso;
	}
	
	//monsters creation with name choose randomly
	public static AbstractFighters monsterFactory() {
		String pseudo = World.generateName();
		int hp = (Toolbox.randomInt(500, 1000));
		int atk = (Toolbox.randomInt(50, 100));
		AbstractFighters monster = new Monsters(pseudo, hp, atk);
		
	return monster;
	}
	
	public static void displayWorldInformations() {
		System.out.println("Welcome to our new world");
	}
	
	//monsters name generator
	public static String generateName() {
		String [] startName = {"Cerbère", "Goule", "Serpent", "Zombie", "Vampire", "Sorcière", "Chaton", "Troll", "Guerrier"};
		String [] endName = {" de la Mort", " en décomposition", " Putride", " Mortel", " de feu", " ninja", " à paillette", " des Montagnes", " de l'enfer"};
		int i = Toolbox.randomInt(0,startName.length);
		int j = Toolbox.randomInt(0,endName.length);
		String monsterName = startName[i] + endName[j];
		//System.out.println(monsterName);
		return monsterName;	
	}
	
	//fight process
	public static void fight (AbstractFighters fighter1, AbstractFighters fighter2) {
		System.out.println("FIGHT!");
		int tour = 1;
		boolean order = true;
		while ((fighter1.getHp() > 0) &&  (fighter2.getHp() > 0 )) {
			System.out.println("----Tour " + tour + "----");
			System.out.println(fighter1.getName() + " : " + fighter1.getHp() + " HP   |  " + fighter2.getName() + " : " + fighter2.getHp() + " HP");
			if(fighter1.getHp() >0) {
//				System.out.println(fighter1.getName() + " attack " + fighter2.getName() + "!");
//				fighter2.setHp(fighter2.getHp() - fighter1.getAtk());
//				System.out.println(fighter2.getName() + " lose " + fighter1.getAtk() + "HP.");	
//				System.out.println();
				int damage = fighter1.attack(fighter2);
				fighter2.defend(damage);
			}
			if(fighter2.getHp() > 0) {
				System.out.println(fighter2.getName() + " attack " + fighter1.getName() + "!");
				fighter1.setHp(fighter1.getHp() - fighter2.getAtk());
				System.out.println(fighter1.getName() + " lose " + fighter2.getAtk() + "HP.");
			}
			tour++;
			scan.nextLine();
		}
		System.out.println("End fight");
		//display fight winner
		if(fighter1.getHp() > 0) {
			System.out.println(fighter2.getName() + " is dead.");
			System.out.println(fighter1.getName() + " win.");
		}else {
			System.out.println(fighter1.getName() + " is dead.");
			System.out.println(fighter2.getName() + " win.");
		}
	}
}

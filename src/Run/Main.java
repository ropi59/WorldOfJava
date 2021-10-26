package Run;

import Characters.Monsters;

public class Main {

	public static void main(String[] args) {
		
		World world = new World();
//		
//		Monsters monster = World.monsterFactory();
//		System.out.println(monster);
//		
//		Characters.Character character = World.characterFactory();
//		System.out.println(character);
	
		World.fight(world.characterFactory(), world.monsterFactory());
		
		
		
		
	}
}

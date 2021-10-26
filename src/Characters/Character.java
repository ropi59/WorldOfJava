package Characters;

import Interfaces.IFighter;

public class Character extends AbstractFighters {

	//constructors
	public Character() {
		super();
	}
	
	public Character(String name, int hp, int atk) {
		super(name, hp, atk);
	}

	@Override
	public int getDamage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setDamage(int damage) {
		// TODO Auto-generated method stub
	}

	@Override
	public void attack(IFighter opponnent) {
		// TODO Auto-generated method stub
	}

	@Override
	public void defend(int damage) {
		// TODO Auto-generated method stub
	}
	
}

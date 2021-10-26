package Characters;

import Interfaces.IFighter;

public abstract class AbstractFighters implements IFighter{

	//attributes
	private String name;
	private int hp;
	private int atk;
	
	//constructors
	public AbstractFighters() {
		super();
	}
	
	public AbstractFighters(String name, int hp, int atk) {
		super();
		this.setName(name);
		this.setHp(hp);
		this.setAtk(atk);
	}
	
	//getters setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	
	//methods
	public int attack(AbstractFighters opponnent) {
		System.out.println(this.getName() + " attack " + opponnent.getName() + "!");
		int damage = this.getAtk();	
		return damage;
	}

	public void defend(int damage) {
		System.out.println("coucou");
		this.setHp(this.getHp() - damage);
		System.out.println(this.getName() + " lose " + damage + "HP.");	
		System.out.println();
	}

	@Override
	public String toString() {
		return "NOM : " + this.name + ", HP : " + this.hp + ", ATK : " + this.atk;
	}
}

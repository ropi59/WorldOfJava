package Interfaces;


public interface IFighter {

	//getters setters
	public String getName();
	public void setName(String name);
	public int getHp();
	public void setHp(int hp);
	public int getDamage();
	public void setDamage(int damage);
	
	//methods
	public void attack(IFighter opponnent);

	public void defend(int damage);
}

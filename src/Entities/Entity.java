package Entities;
import java.util.ArrayList;

import Equippables.Weapon;
import Items.Item;
/**
 * All the enemies and the players.
 *
 * @author phoongm.
 *         Created Apr 26, 2017.
 */
public abstract class Entity {
	protected int str;
	protected int dex;
	protected int con;
	protected int intel;
	protected int wis;
	protected int cha;
	protected int health;
	protected Weapon weapon1;
	protected ArrayList<Item> inventory;
	protected Weapon weapon2;
	
	public abstract void resetHealth();

	public void setHealth(int newHealth){
		this.health = newHealth;
	}
	public void equip(Weapon weapon){
		this.weapon1 = weapon;
	}
	public void doDamage(Entity entity){
		entity.setHealth(entity.health - weapon1.generateAttack());
	}

	public int getHealth() {
		// TODO Auto-generated method stub.
		return this.health;
	}
	
}

package Entities;
/**
 * Describes the player character.
 *
 * @author phoongm.
 *         Created Apr 26, 2017.
 */
public class Player extends Entity{

	public Player(){
		this.str = 8;
		this.dex = 8;
		this.con = 8;
		this.intel = 8;
		this.wis = 8;
		this.cha = 8;
		setHealth();
	}
	
	public void setHealth(){
		 this.health = (Math.random() + 1)*250 + 12*this.str + 25*this.con;
	}
	
}

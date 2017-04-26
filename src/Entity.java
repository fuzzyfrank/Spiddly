import java.util.ArrayList;

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
	protected double health;

	
	
	protected Weapon weapon;
	protected ArrayList<Item> Inventory;
	protected Weapon weapon2;
	
	
	public abstract void setHealth();
	
}

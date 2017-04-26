
/**
 * TODO Put here a description of what this class does.
 *
 * @author phoongm.
 *         Created Apr 26, 2017.
 */
public abstract class Item {

	public int durability;
	public int damage;
	public String name;

	public int getDurability() {
		return this.durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return this.damage;
	}	
	public void setDamage(int toSet){
		this.damage = toSet;
	}
	
	public abstract void use(Entity entity);
}


public interface Monster {

	String name = "DefaultWeapon";
	double attack = 1;
	double defense = 1;
	String element = "DefaultElement";
	int health = 1;
	int evasion = 1;
	boolean isDead = false;

	public abstract int generateAttack();

	public abstract int generateDefense();

	public abstract String setElement();

	public abstract String monsterType();

	public abstract void injure(int damage);
	
	public abstract int attack(int damage);
	
	public abstract boolean checkDead();
}

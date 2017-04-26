
public interface Monster {

	String name = "DefaultWeapon";
	double attack = 1;
	double defense = 1;
	String element = "DefaultElement";
	int health = 1;
	int evasion = 1;

	public abstract int generateAttack();

	public abstract int generateDefense();

	public abstract String setElement();

	public abstract String monsterType();

	public abstract int injure(int damage);
	
	public abstract int attack(int damage);
}

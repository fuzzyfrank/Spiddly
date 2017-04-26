
public interface Monster {

	String name = "DefaultWeapon";
	double attack = 1;
	double defense = 1;
	String element = "DefaultElement";

	public abstract int generateAttack();

	public abstract int generateDefense();

	public abstract String setElement();

	public abstract String monsterType();

}

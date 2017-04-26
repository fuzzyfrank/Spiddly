import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Slime implements Monster {

	String name = "DefaultWeapon";
	double attack = 1;
	double defense = 1;
	String element = "DefaultElement";

	
	@Override
	public int generateAttack() {
		int i = ThreadLocalRandom.current().nextInt(40, 90);
		return i;
	}

	@Override
	public int generateDefense() {
		int i = ThreadLocalRandom.current().nextInt(10, 30);
		return i;
	}

	@Override
	public String setElement() {
		ArrayList<String> elements = new ArrayList<String>() {
			{
				add("Fire");
				add("Water");
				add("Earth");
			}
		};
		int elmt = ThreadLocalRandom.current().nextInt(0, 3);
		return elements.get(elmt);
	}

	@Override
	public String monsterType() {
		return "Slime";
	}

}

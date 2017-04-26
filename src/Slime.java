import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Slime implements Monster {

	String name = this.monsterType();
	double attack = this.generateAttack();
	double defense = this.generateDefense();
	String element = this.setElement();
	boolean isDead = false;
	int health = ThreadLocalRandom.current().nextInt(100, 300);
	int evasion = ThreadLocalRandom.current().nextInt(2, 6);


	
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

	@Override
	public void injure(int damage) {
		System.out.println("You dealt " + damage + " damage.");
		this.health = this.health - damage;
	}

	@Override
	public boolean checkDead() {
		if(this.health <= 0){
			System.out.println("You killed the slime!");
			return true;
		}
		System.out.println("The slime has " + this.health + " health left.");
		return false;
	}

}

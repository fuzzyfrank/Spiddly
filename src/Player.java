import java.util.concurrent.ThreadLocalRandom;

public class Player {

	public int health = ThreadLocalRandom.current().nextInt(400, 700);
	public int evasion = ThreadLocalRandom.current().nextInt(3, 10);
	public Weapon weapon;
	public Armor armor;
	boolean isDead = false;
	double attack = this.sumAttack();
	double defense = this.sumDefense();
	
	public void injure(int damage){
		System.out.println("You dealt " + damage + " damage.");
		this.health = this.health - damage;
	}
	
	public double sumAttack(){
		double d = this.armor.attack + this.weapon.attack;
		return d;
	}

	public double sumDefense() {
		double d = this.armor.defense + this.weapon.defense;
		return d;
	}
	
	public boolean checkDead() {
		if(this.health <= 0){
			System.out.println("You have died.");
			return true;
		}
		System.out.println("You have " + this.health + " health left.");
		return false;
	}

}

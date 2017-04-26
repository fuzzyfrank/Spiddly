import java.util.concurrent.ThreadLocalRandom;

public class Player {

	public int health = ThreadLocalRandom.current().nextInt(400, 700);
	public int evasion = ThreadLocalRandom.current().nextInt(3, 10);
	public Weapon weapon;
	
	
	
	public int injure(int damage){
		
	}

	public int attack(int damage){
		
	}
	
	public int sumAttack(){
		
	}

	public int sumDefense() {
		
	}

}

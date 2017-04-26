
public class Main {

	public static void main(String[] args) {
		Sword testSword = new Sword();
		testSword.generateWeapon();
		Dagger testDagger = new Dagger();
		testDagger.generateWeapon();
		Ring testRing = new Ring();
		testRing.generateWeapon();
		Shield testShield = new Shield();
		testShield.generateWeapon();
		//Creates a warrior character
		Player warrior = new Player();
		System.out.println("Creating a warrior.");
		warrior.weapon = testSword;
		warrior.armor = testShield;
		//Isn't returning the correct attack and defense values, so I tried to sum it up again, but it didn't help
		warrior.sumAttack();
		warrior.sumDefense();
		System.out.println("The warrior's attack is " + warrior.attack + " and their defense is " + warrior.defense + ".");
		System.out.println("They have " + warrior.health + " health and their evasion is " + warrior.evasion + ".");
		System.out.println("The have equipped a " + warrior.weapon.weaponType().toLowerCase() + " and a " + warrior.armor.armorType().toLowerCase() + ".");
		//Creates a rogue
		Player rogue = new Player();
		System.out.println("Creating a rogue.");
		rogue.weapon = testDagger;
		rogue.armor = testRing;
		//Isn't returning the correct attack and defense values, so I tried to sum it up again, but it didn't help
		rogue.sumAttack();
		rogue.sumDefense();
		System.out.println("The rogue's attack is " + rogue.attack + " and their defense is " + rogue.defense + ".");
		System.out.println("They have " + rogue.health + " health and their evasion is " + rogue.evasion + ".");
		System.out.println("The have equipped a " + rogue.weapon.weaponType().toLowerCase() + " and a " + rogue.armor.armorType().toLowerCase() + ".");
		
	}
	
}

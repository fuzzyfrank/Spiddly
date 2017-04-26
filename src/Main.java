import Equippables.Dagger;
import Equippables.Ring;
import Equippables.Shield;
import Equippables.Sword;

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
	}
	
}

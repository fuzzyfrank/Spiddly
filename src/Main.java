import java.util.Scanner;

import Entities.Entity;
import Entities.Player;
import Entities.Slime;
import Equippables.Dagger;
import Equippables.Ring;
import Equippables.Shield;
import Equippables.Sword;

public class Main {

	public static void main(String[] args) {
		Entity player = new Player();
		Sword testSword = new Sword();
		testSword.generateWeapon();
		player.equip(testSword);
		Dagger testDagger = new Dagger();
		testDagger.generateWeapon();
		Ring testRing = new Ring();
		testRing.generateWeapon();
		Shield testShield = new Shield();
		testShield.generateWeapon();
		
		
		while(true){
			System.out.println("You encounter a slime!");
			Entity slime = new Slime();
			Scanner reader = new Scanner(System.in);
			System.out.println("attack?");
			String n = reader.nextLine();
			if(n.equals("attack") ||n.equals("Attack")){
				player.doDamage(slime);
				System.out.println("The slime has " + slime.getHealth() + " hp left.");
			}
		}
	}
	
}

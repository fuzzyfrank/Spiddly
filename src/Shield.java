import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Shield implements Weapon {

	String noun = this.generateNouns();
	String verb = this.generateVerbs();
	String adj = this.generateAdj();
	boolean legendary = this.generateLegenday();
	String legendaryMarker = "<LEGENDARY>";
	String name = this.weaponType();
	double attack = this.generateAttack();
	double defense = this.generateDefense();
	String element = this.setElement();
	String description = this.generateDescription();

	@Override
	public int generateAttack() {
		return 0;
	}

	@Override
	public String generateDescription() {
		int i = ThreadLocalRandom.current().nextInt(0, 3);
		if (i == 0) {
			return "The " + this.adj + " shield " + this.verb + " with " + this.noun + ".";
		} else if (i == 1) {
			return "You can feel that the " + this.adj + " shield " + this.verb + " with " + this.noun + ".";
		} else if (i == 2) {
			return "A plain looking shield.";
		}
		return "NoDescGenerated";
	}

	@Override
	public void generateWeapon() {
		if (this.legendary == true) {
			System.out.println(this.legendaryMarker + "[" + this.name + "][Atk: " + this.attack + " | Def: "
					+ this.defense + " | Elmt: " + this.element + " | Desc: " + this.description + "]");
		} else {
			System.out.println("[" + this.name + "][Atk: " + this.attack + " | Def: " + this.defense + " | Elmt: "
					+ this.element + " | Desc: " + this.description + "]");
		}
	}

	@Override
	public boolean generateLegenday() {
		double i = Math.ceil((Math.random() * 100));
		if (i <= 10) {
			this.legendaryMarker = "<LEGENDARY>";
			return true;
		}
		return false;
	}

	@Override
	public String generateVerbs() {
		ArrayList<String> verbs = new ArrayList<String>() {
			{
				add("glows handsomly");
				add("vibrates");
				add("chills you");
				add("burns");
			}
		};
		int verb = ThreadLocalRandom.current().nextInt(0, 4);
		return verbs.get(verb).toString();
	}

	@Override
	public String generateNouns() {
		ArrayList<String> nouns = new ArrayList<String>() {
			{
				add("destructive magic");
				add("protective magic");
				add("evil");
				add("hope");
			}
		};
		int noun = ThreadLocalRandom.current().nextInt(0, 4);
		return nouns.get(noun);
	}

	@Override
	public String generateAdj() {
		ArrayList<String> adjs = new ArrayList<String>() {
			{
				add("metal");
				add("rusted");
				add("heavy");
				add("light");
			}
		};
		int adj = ThreadLocalRandom.current().nextInt(0, 4);
		return adjs.get(adj);
	}

	@Override
	public String weaponType() {
		return "Shield";
	}

	@Override
	public String setElement() {
		ArrayList<String> elements = new ArrayList<String>() {
			{
				add("Fire");
				add("Water");
				add("Earth");
				add("Air");
			}
		};
		int elmt = ThreadLocalRandom.current().nextInt(0, 4);
		return elements.get(elmt);
	}

	@Override
	public int generateDefense() {
		int i = ThreadLocalRandom.current().nextInt(40, 80);
		if (this.legendary == true) {
			return i * 2;
		}
		return i;
	}

}

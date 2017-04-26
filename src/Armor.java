public interface Armor {

	String name = "DefaultWeapon";
	double attack = 1;
	double defense = 1;
	boolean legendary = false;
	String legendaryMarker = "";
	String description = "DefaultDescription";
	String noun = "DefualtNoun";
	String verb = "DefaultVerb";
	String adj = "DefaultAdj";
	
	public abstract int generateAttack();
	
	public abstract int generateDefense();
	
	public abstract String generateDescription();
	
	public abstract void generateWeapon();
	
	public abstract boolean generateLegenday();
	
	public abstract String generateVerbs();
	
	public abstract String generateNouns();
	
	public abstract String generateAdj();
	
	public abstract String armorType();
	
}

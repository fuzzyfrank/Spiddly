package Entities;

/**
 * TODO Put here a description of what this class does.
 *
 * @author phoongm.
 *         Created Apr 26, 2017.
 */
public class Slime extends Entity {

	public Slime(){
		this.str = 2;
		this.dex = 2;
		this.con = 2;
		this.wis = 0;
		this.intel = 0;
		this.cha = 0;
		this.resetHealth();
	}
	@Override
	public void resetHealth() {
		this.health = (int)((Math.random()+1)*100);
	}

}

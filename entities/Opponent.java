package entities;

public abstract class Opponent {
	public String name;
	public String description;
	
	public int hp;
	public int strength;
	public int defense;
	public int magic;
	public int resistance;
	public int fleetness;
	public int accuracy;
	
	public int xpEarned;
	
	public String type;
	
	boolean stunned1 = false;
	boolean stunned2 = false;
	boolean stunned3 = false;
	
	abstract boolean turnDecider();
	abstract void ai(PlayerCharacter player);
	
	boolean stunned() {
		boolean tstunned1 = this.stunned1;
		boolean tstunned2 = this.stunned2;
		boolean tstunned3 = this.stunned3;
		
		if(this.stunned1) {
			this.stunned1 = false;
		} else if(this.stunned2) {
			this.stunned2 = false;
			this.stunned1 = true;
		} else if(this.stunned3) {
			this.stunned3 = false;
			this.stunned2 = true;
		}
		
		return tstunned1 || tstunned2 || tstunned3;
	}
}

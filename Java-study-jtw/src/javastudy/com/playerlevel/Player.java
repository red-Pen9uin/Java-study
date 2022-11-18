package javastudy.com.playerlevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		this.level = new BeginerLevel();
		this.level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void upgradeLevel(PlayerLevel level){
		this.level = level;
		this.level.showLevelMessage();
	}
	
	public void play(int count) {
		this.level.go(count);
	}
	

}

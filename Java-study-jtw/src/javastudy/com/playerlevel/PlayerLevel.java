package javastudy.com.playerlevel;

public abstract class PlayerLevel {
	public abstract void showLevelMessage();
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	final public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}

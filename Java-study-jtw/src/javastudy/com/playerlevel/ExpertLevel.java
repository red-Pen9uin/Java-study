package javastudy.com.playerlevel;

public class ExpertLevel extends PlayerLevel{
	@Override
	public void showLevelMessage() {
		System.out.println("***** 고급자 레벨입니다. *****");
	}
	
	@Override
	public void run() {
		System.out.println("완전 빨리 달립니다.");
	}
	
	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}
	
	@Override
	public void turn() {
		System.out.println("Turn 합니다.");
	}
}

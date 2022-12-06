package javastudy.com.scheduler;

public class RoundRobin implements Scheduler{
	
	@Override
	public void getNextCall() {
		
		System.out.println("상담 전화를 대기열에서 순서대로 가져옵니다.");
	}
	
	@Override
	public void sendCallToAgent() {
		
		System.out.println("다음 순서의 상담원에게 전화를 배분합니다.");
	}
	
}

package javastudy.com.interfaceex;

public interface Sell {
	void sell();
	
	static void pay(){
		System.out.println("돈을 지불합니다");
	}
	
	default void order() {
		System.out.println("판매 주문");
	}
}

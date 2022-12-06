package javastudy.com.interfaceex;

public interface Buy {
	void buy();
	
	static void pay(){
		System.out.println("돈을 지불합니다");
	}
	
	default void order() {
		System.out.println("구매 주문");
	}
}

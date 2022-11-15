package javastudy.com.week12;

public class Person {
	String name;
	int age;
	
	public Person() {
		this("이름 없음", 0);
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Person p = new Person();
	
}

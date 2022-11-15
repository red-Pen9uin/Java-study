package javastudy.com.polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBook() {
		
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 움직입니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 움직입니다.");
	}
	
	public void flying() {
		
		System.out.println("독수리가 하늘을 높이 납니다.");
	}
}

public class AnimalTest1 {
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
		aTest.moveAnimal(new Animal());
		
		aTest.testCasting(new Human());
		aTest.testCasting(new Tiger());
		aTest.testCasting(new Eagle());
		aTest.testCasting(new Animal());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public void testCasting(Animal animal) {
		if (animal instanceof Human) {
			Human h = (Human)animal;
			h.readBook();
		}
		else if (animal instanceof Tiger) {
			((Tiger)animal).hunting();
		}
		else if(animal instanceof Eagle) {
			Eagle e = (Eagle)animal;
			e.flying();
		} else {
			System.out.println("해당되는 타입이 없습니다.");
		}
	}
}

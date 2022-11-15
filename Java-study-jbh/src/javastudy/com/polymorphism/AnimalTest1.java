package javastudy.com.polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("인간이 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("인간이 책을 읽습니다.");
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
		System.out.println("독수리가 하늘 높이 납니다.");
	}
}

public class AnimalTest1 {
	ArrayList <Animal> aniList = new ArrayList <Animal>();
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}
	
	public static void main(String[] args) {
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Animal());
		aTest.addAnimal();
		aTest.testCasting();
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}
	
	public void testCasting() {
		// aniList에 존재하는 각 인스턴스들이 가지고있는
		// 자신만의 메소드를 호출!
		// instanceof
		for (Animal animal: aniList) {
			if (animal instanceof Human) {
				Human h = (Human)animal; //Down-Casting
				h.readBook();
			} else if (animal instanceof Tiger) {
				Tiger t = (Tiger)animal; //Down-Casting
				t.hunting();
			} else if (animal instanceof Eagle) {
//				Eagle e = (Eagle)animal; //Down-Casting
//				e.flying();
				((Eagle)animal).flying(); //Down-Casting
			} else {
				System.out.println("지원하지 않는 형식입니다.");
			}
		}
	}
}

package homeWork04.part2_Animals;

import homeWork04.part3_Zoo.Zoo;

import java.util.ArrayList;

public class People extends Mammals {

	@Override
	public void move() {
		System.out.println("Move with car");

	}

	@Override
	public void eat() {
		System.out.println("Eat everything");

	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean swim() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void gregariousAction() {
		// TODO Auto-generated method stub

	}

	@Override
	public void communicate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void born() {
		System.out.println("live born");

	}

	@Override
	public void seePeople() {
		System.out.println("Oh that's me");
	}

	public void seeAnimalInZoo() {
		for (Vertebrate animal : Zoo.getAnimals())
			animal.seePeople();
	}

	
}

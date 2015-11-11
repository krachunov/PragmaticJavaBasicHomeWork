package homeWork04.part2_Animals;

public class Catfish extends Fish {

	@Override
	public void move() {
		System.out.println("moves like swimming");

	}

	@Override
	public void eat() {
		System.out.println("Eat small fish,forg");

	}

	@Override
	public void swim() {
		System.out.println("swim along the bottom");

	}

	@Override
	public void gregariousAction() {
		System.out.println("");

	}

	@Override
	public void communicate() {
		// TODO Auto-generated method stub

	}

	@Override
	public void born() {
		System.out.println("hatch from eggs");

	}

	@Override
	public void seePeople() {
		System.out.println("I'm a fish");

	}

	@Override
	public boolean fly() {
		return false;
	}

}

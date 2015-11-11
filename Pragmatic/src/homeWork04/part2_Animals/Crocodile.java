package homeWork04.part2_Animals;

public class Crocodile extends Rreptiles {

	@Override
	public void move() {
		System.out.println("moves on the ground and water");

	}

	@Override
	public void eat() {
		System.out.println("Eat meat");

	}

	@Override
	public boolean isSwim() {
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

	public void born() {
		System.out.println("hatch from eggs");

	}

	@Override
	public void seePeople() {
		System.out.println("Crocodile: I will eat you");
		
	}

}

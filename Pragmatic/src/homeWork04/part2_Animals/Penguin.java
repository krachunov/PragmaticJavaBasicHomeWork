package homeWork04.part2_Animals;

public class Penguin extends Birds{

	@Override
	public void move() {
		System.out.println("They walk");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat fish");
		
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return false;
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
		System.out.println("Penguin: hatch from eggs");
		
	}

	@Override
	public void seePeople() {
		System.out.println("Give me the fish");
		
	}

}

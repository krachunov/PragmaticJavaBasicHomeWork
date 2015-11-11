package homeWork04.part2_Animals;

public class Dolphins extends Mammals {

	@Override
	public void move() {
		System.out.println("They swim");
		
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
		System.out.println("Dolphins: Let swim together");
		
	}

}

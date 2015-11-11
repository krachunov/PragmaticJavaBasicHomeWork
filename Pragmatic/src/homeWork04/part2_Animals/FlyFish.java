package homeWork04.part2_Animals;

public class FlyFish extends Fish{

	@Override
	public void move() {
		System.out.println("moves like swimming and flying");
		
	}

	@Override
	public void eat() {
		System.out.println("They feed on plankton.");
		
	}

	@Override
	public void gregariousAction() {
		System.out.println("move on passages");
		
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
	public void swim() {
		System.out.println("Fly and swim");
		
	}

	@Override
	public void seePeople() {
		System.out.println("FlyFish: Blob blob");
		
	}

	@Override
	public boolean fly() {
		return true;
		
	}

}

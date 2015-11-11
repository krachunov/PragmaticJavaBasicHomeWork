package homeWork04.part2_Animals;

public class Bat extends Mammals{

	@Override
	public void move() {
		System.out.println("Fly by night");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat insects");
		
	}

	@Override
	public boolean fly() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean swim() {
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
		System.out.println("live born");
		
	}

	
	public void seePeople() {
		System.out.println("Bat: Keep quiet sleep");
		
	}

}

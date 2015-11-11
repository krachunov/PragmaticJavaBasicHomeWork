package homeWork04.part2_Animals;

public class Dragon extends Rreptiles{

	@Override
	public void move() {
		System.out.println("moves on the ground");
		
	}

	@Override
	public void eat() {
		System.out.println("Eat meat");
		
	}

	@Override
	public boolean isSwim() {
		
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
		System.out.println("hatch from eggs");
		
	}

	@Override
	public void seePeople() {
		System.out.println("I'm dragon");
		
	}
	
}

package homeWork04.part2_Animals;

public abstract class Rreptiles extends Vertebrate {

	public abstract boolean isSwim();

	@Override
	public void born() {
		System.out.println("hatch from eggs");
	}
}

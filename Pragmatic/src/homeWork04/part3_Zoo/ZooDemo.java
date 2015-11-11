package homeWork04.part3_Zoo;

import homeWork03.Person;
import homeWork04.part2_Animals.*;

public class ZooDemo {
	public static void main(String[] args) {
		Zoo zoo = new Zoo("zoologicalGarden");
		zoo.addAinmalInZoo(new Bat());
		zoo.addAinmalInZoo(new Dolphins());
		zoo.addAinmalInZoo(new Penguin());
		zoo.addAinmalInZoo(new Eagle());
		zoo.addAinmalInZoo(new FlyFish());
		zoo.addAinmalInZoo(new Catfish());
		zoo.addAinmalInZoo(new Dragon());
		zoo.addAinmalInZoo(new Crocodile());
		zoo.addAinmalInZoo(new Snake());

		People human = new People();
		People chovek2 = new People();
		chovek2.seeAnimalInZoo();
	}
}

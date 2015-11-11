package homeWork04.part3_Zoo;

import homeWork04.part2_Animals.*;

import java.util.ArrayList;

public class Zoo {
	private String zooName;
	private static ArrayList<Vertebrate> animals;

	public Zoo(String name) {
		this.zooName = name;
		setAnimals(new ArrayList<Vertebrate>());
	}

	public void addAinmalInZoo(Vertebrate animal) {
		getAnimals().add(animal);
	}

	public void removeAnimalFromZoo(Vertebrate animal) {
		getAnimals().remove(animal);
	}

	public void whatSayAnimalWhenSeePeople() {
		for (Vertebrate animal : getAnimals()) {
			animal.seePeople();
		}
	}

	public static ArrayList<Vertebrate> getAnimals() {
		return animals;
	}

	public void setAnimals(ArrayList<Vertebrate> animals) {
		this.animals = animals;
	}
}

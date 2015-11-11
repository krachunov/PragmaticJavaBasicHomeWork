package homeWork08;

public class Exercise01_Emploee implements Comparable<Exercise01_Emploee> {

	private String name;
	private int salary;

	public Exercise01_Emploee(String name, int salary) {
		setName(name);
		setSalary(salary);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Exercise01_Emploee emploee) {

		int compare = (this.getName().compareToIgnoreCase(emploee.getName()));
		if (compare == 0) {
			if (this.getSalary() == (emploee.getSalary())) {
				return 0;
			} else if (this.getSalary() > (emploee.getSalary())) {
				return 1;
			} else {
				return -1;
			}
		} else if (compare > 0) {
			return 1;
		} else {
			return -1;
		}

	}

	public String toString() {

		return "Name emploee: " + this.getName() + ", his salary "
				+ this.getSalary();

	}
}

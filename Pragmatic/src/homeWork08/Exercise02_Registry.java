package homeWork08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise02_Registry<T> {
	private String name;
	private LinkedList<T> elements;
	private int maxElement;

	public Exercise02_Registry(String name, int maxElement) {
		setName(name);
		setMaxElement(maxElement);
		elements = new LinkedList<>();

	}

	public LinkedList<T> getElements() {
		return elements;
	}

	public void setElements(LinkedList<T> elements) {
		this.elements = elements;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxElement() {
		return maxElement;
	}

	public void setMaxElement(int maxElement) {
		this.maxElement = maxElement;
	}

	public boolean addElement(T element) {
		if (this.elements.size() == getMaxElement()) {
			throw new IllegalStateException(
					"List is already at maximum size of " + getMaxElement());
		} else {
			this.elements.add(element);
			return true;
		}
	}

	public boolean removeElement(T element) {
		Iterator iterator = this.elements.iterator();
		while (iterator.hasNext()) {
			Object searchElement = iterator.next();
			if (searchElement.equals(element)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	public int getSize() {
		return elements.size();
	}

	public T[] listoToArrays() {
		T[] array = (T[]) new Object[this.getSize()];
		LinkedList<T> list = this.getElements();
		int index = 0;
		for (int i = 0; i < this.getSize(); i++) {
			array[i] = list.get(i);
		}
		return array;
	}

}

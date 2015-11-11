package homeWork08;

public class Exercise02_RegistryDemo {

	public static void main(String[] args) {
		Exercise02_Registry<Integer> integerRegister = new Exercise02_Registry<Integer>("intElement",
				5);
		System.out.println("Max element: " + integerRegister.getMaxElement());
		System.out.println("Size: " + integerRegister.getSize());
		integerRegister.addElement(1);
		integerRegister.addElement(2);
		integerRegister.addElement(3);
		integerRegister.addElement(4);
		integerRegister.addElement(5);
		System.out.println("Size: " + integerRegister.getSize());
		integerRegister.removeElement(3);
		System.out.println("Size after delete element: " + integerRegister.getSize());

		System.out.println();
		Object[] testArray = integerRegister.listoToArrays();
		System.out.println("Array length: " + testArray.length);
		for (Object a : testArray) {
			System.out.println(a);
		}
		 integerRegister.addElement(6);

	}

}

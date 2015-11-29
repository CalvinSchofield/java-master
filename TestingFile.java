//
//Runner File for testing Scripts - Main
//

public class TestingFile {

	public static void main(String[] args) {

		ArrayMaster arrayMaster = new ArrayMaster();

		int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		double[] doubleArray = { 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0 };

		float[] floatArray = { 1.0f, 1.5f, 2.0f, 2.5f, 3.0f, 3.5f, 4.0f, 4.5f, 5.0f };

		String[] stringArray = { "Calvin", "Adam", "John", "Kara", "Boomer", "Ellie", "Ellie" };

		System.out.println(arrayMaster.maxInt(intArray));

		System.out.println(arrayMaster.minInt(intArray));

		System.out.println();

		System.out.println();

		System.out.println(arrayMaster.maxDouble(doubleArray));

		System.out.println(arrayMaster.minDouble(doubleArray));

		System.out.println();

		System.out.println();

		System.out.println(arrayMaster.maxFloat(floatArray));

		System.out.println(arrayMaster.minFloat(floatArray));

		System.out.println();

		System.out.println();

		System.out.println(arrayMaster.maxString(stringArray));

	System.out.println(arrayMaster.minString(stringArray));

	}	

}
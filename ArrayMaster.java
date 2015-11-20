//Array Class

public class ArrayMaster {


	//Function : Find max int in array of int
	public int maxInt(int[] array) {

		int max = array[0];

		for(int index = 1; index < array.length; index++) {

			if(max < array[index]) {

				max = array[index];

			}

		}

		return max;

	}


	//Function : find min int in array of int
	public int minInt(int[] array) {

		int min = array[0];

		for(int index = 1; index < array.length; index++) {

			if(min > array[index]) {

				min = array[index];

			}

		}

		return min;

	}

}
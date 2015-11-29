//Array Class

public class ArrayMaster {

	//====================================================================
	//Function : Find max int in array of int
	//====================================================================
	public int maxInt(int[] array) {

		int max = array[0];

		for(int index = 1; index < array.length; index++) {

			if(max < array[index]) {

				max = array[index];

			}

		}

		return max;

	}


	//====================================================================
	//Function : find min int in array of int
	//====================================================================
	public int minInt(int[] array) {

		int min = array[0];

		for(int index = 1; index < array.length; index++) {

			if(min > array[index]) {

				min = array[index];

			}

		}

		return min;

	}


	//====================================================================
	//Function : Find max double in array of double
	//====================================================================
	public double maxDouble(double[] array) {

		double max = array[0];

		for(int index = 1; index < array.length; index++) {

			if(max < array[index]) {

				max = array[index];

			}

		}

		return max;

	}


	//====================================================================
	//Function : find min double in array of double
	//====================================================================
	public double minDouble(double[] array) {

		double min = array[0];

		for(int index = 1; index < array.length; index++) {

			if(min > array[index]) {

				min = array[index];

			}

		}

		return min;

	}


	//====================================================================
	//Function : Find max float in array of float
	//====================================================================
	public float maxFloat(float[] array) {

		float max = array[0];

		for(int index = 1; index < array.length; index++) {

			if(max < array[index]) {

				max = array[index];

			}

		}

		return max;

	}


	//====================================================================
	//Function : find min float in array of float
	//====================================================================
	public float minFloat(float[] array) {

		float min = array[0];

		for(int index = 1; index < array.length; index++) {

			if(min > array[index]) {

				min = array[index];

			}

		}

		return min;

	}


	//====================================================================
	//Function : Find longest word in array of String
	//====================================================================
	public String maxString(String[] array) {

		String max = array[0];

		for(int index = 1; index < array.length; index++) {

			if(max.length() < array[index].length()) {

				max = array[index];

			}

		}

		return max;

	}


	//====================================================================
	//Function : find shortest word in array of String
	//====================================================================
	public String minString(String[] array) {

		String min = array[0];

		for(int index = 1; index < array.length; index++) {

			if(min.length() > array[index].length()) {

				min = array[index];

			}

		}

		return min;

	}

}
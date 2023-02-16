public class MeanMedian {

	public double mean(int[] arr) {
		if (arr.length == 0) {
			return 0.0;		
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = arr[i];
		}
		double mean = (double) sum / arr.length;
		return mean;
	}

	public double median(int[] arr) {
		int middleIndex = arr.length / 2;
		if (arr.length % 2 == 1) {
			int middleLeft = arr[middleIndex];
			int middleRight = arr[middleIndex + 1];
			return (middleLeft + middleRight) / 2.0;
		} else {
			return (double) arr[middleIndex];
		}
	}

}
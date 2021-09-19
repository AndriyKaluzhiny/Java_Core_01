package lgs.lviv.ua;

public class Part3 {
	public static void main(String[] args) {
		int [] array = new int[10];
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i] = i);
			if (array[i] < min) {
				min = array[i];
			}
			else if (array[i] > max) {
				max = array[i];
			}
		}
		
		System.out.println("Max Value: " + max);
		System.out.println("Min Value: " + min);
	}
}

package guiExercise1;

public class Lab1Part3 {
	public static void main(String[] args) {
		double[][] array = new double[][] { {0.5,5.2,9.9,0.6,9.4},{12.6,11.7,10.8,12.9,13.1} };
		
		for (int i = 0; i < array.length; i++) {
		    for (int j = 0; j < array[i].length; j++) {
		        System.out.print(array[0][j] + "mm ");
		        System.out.print(array[1][j] + "c ");
		    }
		System.out.print("  ");
		}
	}
}

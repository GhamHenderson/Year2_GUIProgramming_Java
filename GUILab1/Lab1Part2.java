package guiExercise1;
public class Lab1Part2
{
	public static void main(String[] args) {
		char[] array =  new char[] {'F','I','N','G','L','A','S'};
		// Write for loop to print ASCII values
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i] + ", ");
			System.out.print((int)array[i]);
		}
	}
}
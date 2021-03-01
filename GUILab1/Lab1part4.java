package guiExercise1;

public class Lab1part4
{
	public static void main(String[] args) {
		System.out.println(halfMyAge(26));
		printMyNameInReverse("Graham","Henderson");
	}
	
	public static int halfMyAge(int age) {
		age = age / 2;
		return age;
	}
	
	public static void printMyNameInReverse(String FirstName, String SecondName) {
		System.out.println(SecondName + " " + FirstName);
	}
}

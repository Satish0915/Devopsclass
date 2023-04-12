/* CallingMethodsInSameClass.java
 *
 * illustrates how to call static methods a class
 * from a method in the same class
 */

public class CallingMethodsInSameClass
{
	public static void main(String[] args) {
		printOne();
		printOne();
		printTwo();
	}

	public static void printOne() {
		System.out.println("Hello World");
	}

	public static void printTwo() {
		printOne();
		printOne();
	}

	# feature202 changes made by Satish on April 12/22023
	public static void printList(int[] list)
	{	System.out.println("index, value");
		for(int i = 0; i < list.length; i++)
		{	System.out.println(i + ", " + list[i]);
		}
	}

	# added some new features for java methods by Umesh
	
{
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

}
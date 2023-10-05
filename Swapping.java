import java.util.Scanner;
public class Swapping {
	// Method to swap two numbers
    public static void swap(int a, int b) {
    	System.out.println("Before swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:");
        System.out.println("First number: " + a);
        System.out.println("Second number: " + b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;

        // Get user input
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        // Call the swap method
        swap(num1, num2);
        input.close();
    }
}

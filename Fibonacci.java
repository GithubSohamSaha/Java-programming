import java.util.Scanner;

class Fibo_genarator{
	//method to get the data from the user
	int getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms should be printed: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
	}
    //Method to generate the fibonacci series      
    void fibonacci_genarator(int n) {
         int first_fibo = 0;
         int second_fibo = 1;
         if (n<0)
            System.out.println("Please enter the positive number of limit!!!!");
           else {
            	 System.out.println("Fibonacci Series up to the " + n + "th term:");
                 if (n >= 1) {
                     System.out.print(first_fibo + " ");
                 }
                 if (n >= 2) {
                     System.out.print(second_fibo + " ");
                 }
                 for (int i = 3; i <= n; i++) {
                     int next_fibo = first_fibo + second_fibo;
                     System.out.print(next_fibo + " ");
                     first_fibo = second_fibo;
                     second_fibo = next_fibo;
                 }
            }    
    }
}

public class Fibonacci {
    public static void main(String[] args) {
        Fibo_genarator object = new Fibo_genarator();
        int term = object.getdata();
        object.fibonacci_genarator(term);
    } 
}

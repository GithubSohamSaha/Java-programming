import java.io.*;
public class SumOfSeries {
    public static void main(String[] args) throws NumberFormatException, IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the limit (nth term): ");
        int number = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 2; i <= 2*number; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers up to " + number + "th term is: " + sum);
    }
}

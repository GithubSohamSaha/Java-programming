import java.util.Scanner;

class complex_calculator{
	double real,imaginary;
	//method to get the data from the user
	void getdata(Scanner get) {
	        System.out.print("Enter the real part of the complex number: \n");
	        this.real = get.nextDouble();
	        System.out.print("Enter the imaginary part of the complex number: \n");
	        this.imaginary = get.nextDouble();
	}
	
	complex_calculator ComplexAddition(complex_calculator CN1,complex_calculator CN2) {
		complex_calculator result = new complex_calculator();
		result.real = CN1.real + CN2.real;
		result.imaginary = CN1.imaginary + CN2.imaginary; 
		return result;
	}
	
	complex_calculator ComplexMultipliaction(complex_calculator CN1,complex_calculator CN2) {
		complex_calculator result = new complex_calculator();
		result.real = CN1.real*CN2.real - CN1.imaginary*CN2.imaginary;
		result.imaginary = CN1.real*CN2.imaginary + CN1.imaginary*CN2.real;
		return result;
	}
	
	void showdata() {
		System.out.println(+real+" + "+imaginary+"i");
	}
	
}

public class ComplexNumber{
	public static void main(String[] args) {
		complex_calculator CN1 = new complex_calculator();
		complex_calculator CN2 = new complex_calculator();
		complex_calculator CN3 = new complex_calculator();
		complex_calculator CN4 = new complex_calculator();
		Scanner get = new Scanner(System.in);
		System.out.println("For the first complex number: \n");
		CN1.getdata(get);
		System.out.println("For the second complex number: \n");
		CN2.getdata(get);
		get.close();
		CN3=CN3.ComplexAddition(CN1,CN2);
		CN4=CN4.ComplexMultipliaction(CN1,CN2);
		System.out.println("The result of the Addition of two Complex number is follows: \n");
		CN3.showdata();
		System.out.println("The result of the Multiplication of two Complex number is follows: \n");
		CN4.showdata();
		
		
		
	}
};
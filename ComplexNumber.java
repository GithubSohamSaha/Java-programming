import java.util.Scanner;

public class ComplexNumber{
	double real,imaginary;
	
	void getdata(Scanner get) {
	        System.out.print("Enter the real part of the complex number: \n");
	        this.real = get.nextDouble();
	        System.out.print("Enter the imaginary part of the complex number: \n");
	        this.imaginary = get.nextDouble();
	}
	
	static ComplexNumber ComplexAddition(ComplexNumber CN1,ComplexNumber CN2) {
		ComplexNumber result = new ComplexNumber();
		result.real = CN1.real + CN2.real;
		result.imaginary = CN1.imaginary + CN2.imaginary; 
		return result;
	}
	
	static ComplexNumber ComplexMultipliaction(ComplexNumber CN1,ComplexNumber CN2) {
		ComplexNumber result = new ComplexNumber();
		result.real = CN1.real*CN2.real - CN1.imaginary*CN2.imaginary;
		result.imaginary = CN1.real*CN2.imaginary + CN1.imaginary*CN2.real;
		return result;
	}
	
	void showdata() {
		System.out.println(+this.real+" + "+this.imaginary+"i");
	}
	
	public static void main(String[] args) {
		ComplexNumber CN1 = new ComplexNumber();
		ComplexNumber CN2 = new ComplexNumber();
		ComplexNumber CN3 = new ComplexNumber();
		ComplexNumber CN4 = new ComplexNumber();
		Scanner get = new Scanner(System.in);
		CN1.getdata(get);
		CN2.getdata(get);
		get.close();
		CN3 = ComplexAddition(CN1,CN2);
		CN4 = ComplexMultipliaction(CN1,CN2);
		System.out.println("The result of the Addition of two Complex number is follows: \n");
		CN3.showdata();
		System.out.println("The result of the Multiplication of two Complex number is follows: \n");
		CN4.showdata();
		
		
		
	}
};
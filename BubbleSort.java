import java.util.Scanner;
class Sorting {
	int array[] = new int[20];
	int arraysize;
	//declaration of the Constructor Sorting...
	Sorting(){
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter the the size of the array: ");
	     arraysize = sc.nextInt();
	     System.out.println("Now enter the Elements of the array to be sorted: ");
	     for(int i=0; i<arraysize; i++){
	        System.out.println("array["+i+"]: ");
	        array[i] = sc.nextInt();
	    }
		System.out.print("Before Sorting the elements:\n");
		for(int i=0; i<arraysize; i++){
			System.out.println("array["+i+"]: "+array[i]);
		}
		sc.close();
	}
	//Member-function where the sorting will be done
	void mainsorting(){
		for(int i=0 ;i<arraysize ;i++)
        {
            for(int j=0 ;j<arraysize-i-1;j++)
            {
                if(array[j]>array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
	}
	
	void showdata(){
		System.out.print("After Sorting the elements:\n");
		for(int i=0; i<arraysize; i++){
			System.out.println("array["+i+"]: "+array[i]);
		}
	}
}

public class BubbleSort {
	public static void main(String[] args) {
		Sorting object = new Sorting();
		object.mainsorting();
		object.showdata();
	}
};
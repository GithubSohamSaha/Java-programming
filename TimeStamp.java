import java.io.*;

//this the class where the calculation is done
class Time_calculation{		
	//Initailizing the local varriables
	int hour;
	int min;
	int sec;
	
	//method for getting the data from user
	void getdata() throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Hour: ");
		hour = Integer.parseInt(br.readLine());
		System.out.println("Enter the MIN: ");
		min = Integer.parseInt(br.readLine());
		System.out.println("Enter the Second: ");
		sec = Integer.parseInt(br.readLine());

	}
	//method to add the times 
	void addtime(Time_calculation t1,Time_calculation t2){
		hour = t1.hour+t2.hour;
		min = t1.min+t2.min;
		sec = t1.sec+t2.sec;
		if (sec >= 60){
			min++;
			sec = sec - 60;
		}
		if (min >= 60){
			hour++;
			min = min - 60;
		}
	}
	//method to show the output
	void showtime(){
		System.out.println("The times is: "+hour+" hours  "+min+" minitues  "+sec+" seconds");
	}
	
}
public class TimeStamp {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//three objects t1,t2,t3 are declared..
		Time_calculation t1 = new Time_calculation();
		Time_calculation t2 = new Time_calculation();
		Time_calculation t3 = new Time_calculation();
		System.out.println("Time given from the first user:\n");
		t1.getdata();
		System.out.println("Time given from the second user:\n");
		t2.getdata();
		t3.addtime(t1, t2);
		t3.showtime();
	}
}
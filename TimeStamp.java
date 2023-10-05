import java.io.*;
public class TimeStamp {
	int hour;
	int min;
	int sec;
	
	void getdata() throws NumberFormatException, IOException{
		System.out.println("Enter the Hour: ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		hour=Integer.parseInt(br.readLine());
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the MIN: ");
		min=Integer.parseInt(br.readLine());
		System.out.println("Enter the Second: ");
		sec=Integer.parseInt(br.readLine());

	}
	
	void addtime(TimeStamp t1,TimeStamp t2){
		hour=t1.hour+t2.hour;
		min=t1.min+t2.min;
		sec=t1.sec+t2.sec;
		if (sec>=60){
			min++;
			sec=sec-60;
		}
		if (min>=60){
			hour++;
			min=min-60;
		}
	}
	
	void showtime(){
		System.out.println("The times is: "+hour+" hours  "+min+" minitues  "+sec+" seconds");
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		TimeStamp t1 = new TimeStamp();
		TimeStamp t2 = new TimeStamp();
		t1.getdata();
		t2.getdata();
		TimeStamp t3 = new TimeStamp();
		t3.addtime(t1, t2);
		t3.showtime();
	}

}
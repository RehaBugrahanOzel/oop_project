import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Play {

	String showName;
	Date date;
	Time time;
	String hall;
	public Play(String showName, Date date, Time time, String hall) {
		super();
		this.showName = showName;
		this.date = date;
		this.time = time;
		this.hall = hall;
		
	}
	
	public Play() {
		super();
	}

	public Stack addPlay() {
		Stack play_stack = new Stack();
		try  
		{  
		//the file to be opened for reading  
		FileInputStream fis=new FileInputStream("plays.txt");       
		Scanner sc=new Scanner(fis);    //file to be scanned  
		//returns true if there is another line to read  
		sc.nextLine();
		
		while(sc.hasNextLine())  
		{  
			String temp[] = sc.nextLine().split(";");
			Date date = new Date(Integer.parseInt(temp[1]),Integer.parseInt(temp[2]),Integer.parseInt(temp[3]));
			Time time = new Time(Integer.parseInt(temp[4]),Integer.parseInt(temp[5]));
			Play play = new Play(temp[0], date, time, temp[6]);
			
			play_stack.push(play);
			
		}  
		sc.close();     //closes the scanner  
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		}  
		
		return play_stack;
		
	}
	public String[] getShows(Stack plays) {
		String [] shows=new String[100];
		int stacksize=plays.size();
		for (int i = 0; i < stacksize; i++) {
			shows[i]=((Play)plays.elementAt(i)).showName+"-"+((Play)plays.elementAt(i)).date.day+"."+((Play)plays.elementAt(i)).date.month+"."+((Play)plays.elementAt(i)).date.year+"-"+((Play)plays.elementAt(i)).time.hour+"."+((Play)plays.elementAt(i)).time.minute+"-"+((Play)plays.elementAt(i)).hall;
		}
		return shows;
		
	}

}

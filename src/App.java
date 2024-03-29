import java.util.Scanner;

import Schedulers.IScheduler;
import Schedulers.Multi_Scheduler;
import Schedulers.Priority;
import Schedulers.Round_Robin;
import Schedulers.ShortestJobFirst;

public class App {

	public static void main(String[] args) {
		IScheduler s;
		System.out.println("1- Shortest Job First");
		System.out.println("2- Round Robin");
		System.out.println("3- Priority (with aging)");
		System.out.println("4- Multi Level");
		System.out.println("\nChoose a scheduling algorithm to simulate: ");
		
		Scanner scn = new Scanner(System.in);
		int choice = scn.nextInt();
		
		switch(choice)
		{
			case 1:
				s = new ShortestJobFirst();
				s.schedule();
				break;
		
		    case 2:
		    	
		    	s = new Round_Robin() ;
		    	s.schedule();
		    	
		    	break;
		
			case 3:
				s = new Priority();
				s.schedule();
				break;
			
			case 4:
				s = new Multi_Scheduler();
				s.schedule();
				break;	
				
			default:
				break;
		}
		scn.close();

	}

}
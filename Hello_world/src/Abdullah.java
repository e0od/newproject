import java.util.Scanner;

public class Abdullah {
	
	public static void Hello() {
        System.out.println("Hello");
        System.out.println("How are you" + "\n");
    }

	public static int Increase(int a, int b) {
        return a+b;
    }
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("What do you do Assam week ?");
		
		String day [] = { "Saturday:", "Sunday:", "Monday:", "Tuesday:", "Wednesday:", "Thursday:", "Friday:", };
		
		String action [] = new String[7];
		for(int i=0; i<day.length; i++) {
			System.out.print(day[i] + "\n");
			action[i] = reader.nextLine();
		}
		
		Hello();
		
		System.out.println( "45 + 25 = " + Increase(25, 45) + "\n");
		
		//Loop
		System.out.println("Start");
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("End" + "\n");
	
		//Matrix
		int[] numbers = { 10, 20, 30, 40, 50 };
		 
        
        for(int element: numbers)
        {
            System.out.println(element);
        }
		
        
        	{
        		
        	 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        	
        	}
		
		
		}
        
       
	


import java.util.Scanner; 
public class Sum 
{ 
	public static void main(String args[]) 
	{ 
		Scanner in=new Scanner(System.in); 
		System.out.print("Enter limit of series : "); 
		int limit=in.nextInt(); 
		int i=1; 
		while(i<=limit) 
		{ 
			if(i!=1) 
			{ 
				System.out.print(" + "); 
			} 
			System.out.print(i+++"/"+i); 
		} 
	} 
} 

import java.util.Scanner;

public class MovieDriver {
	
	//none loop variant
	/*public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Movie mOne=new Movie();
		
		System.out.print("Enter name of movie: ");
		mOne.setTitle(inp.nextLine());
		
		System.out.print("Enter movie rating: ");
		mOne.setRating(inp.nextLine());
		
		System.out.print("Enter number of tickets sold: ");
		mOne.setSoldTickets(inp.nextInt());
		
		System.out.println(mOne.toString());
	}*/
	
	//loop variant
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		String cont="y";
		String t="";
		do{
			Movie mOne=new Movie();
			System.out.println("Enter name of movie: ");
			mOne.setTitle(inp.nextLine());
			
			System.out.println("Enter movie rating: ");
			mOne.setRating(inp.nextLine());
			
			System.out.println("Enter number of tickets sold: ");
			mOne.setSoldTickets(inp.nextInt());
			System.out.println("Do you want to enter another? (y or n): ");
			
			cont=inp.next();
			t+="\n"+mOne.toString();
			mOne.setTitle(inp.nextLine());
		}while(cont.equals("y"));

		System.out.println(t);
		System.out.println("goodbye");
	}

}

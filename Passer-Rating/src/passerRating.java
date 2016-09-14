import java.util.Scanner;
public class passerRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of touchdowns.");
		double TD = input.nextDouble();
		System.out.println("Enter total yards.");
		double YDS = input.nextDouble();
		System.out.println("Enter number of interceptions.");
		double INT = input.nextDouble();
		System.out.println("Enter number of completions.");
		double COMP = input.nextDouble();
		System.out.println("Enter number of passing attempts.");
		double ATT = input.nextDouble();
		
		double a = ((COMP/ATT)-0.3)*5;
		if(a<0){
			a = 0;
		}
		if(a>2.375){
			a = 2.375;
		}
		
		double b = ((YDS/ATT)-3)*0.25;
		if(b<0){
			b = 0;
		}
		if(b>2.375){
			b = 2.375;
		}
		
		double c = (TD/ATT)*20;
		if(c<0){
			c = 0;
		}
		if(c>2.375){
			c = 2.375;
		}
		
		double d = 2.375-((INT/ATT)*25);
		if(d<0){
			d = 0;
		}
		if(d>2.375){
			d = 2.375;
		}
		
		double passerRating1 = ((a+b+c+d)/6)*100;
		passerRating1 = Math.round(passerRating1*10.0)/10.0;
		
		System.out.println("Passer Rating: " + passerRating1);
		

	}
}
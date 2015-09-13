package Quiz1Problem;
import java.util.Scanner;
public class passerRating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			System.out.println("What is your number of passing attempts?");
			double ATT = input.nextDouble();
			System.out.println("How many completions did you have?");
			double COMP = input.nextDouble();
			System.out.println("How many passing yards did you have?");
			double YDS = input.nextDouble();
			System.out.println("How many touchdown passes did you have?");
			double TD = input.nextDouble();
			System.out.println("How many interceptions did you throw?");
			double INT = input.nextDouble();
			
			double a = ((COMP/ATT)-.3)*5;
			double b = ((YDS/ATT)-3)*.25;
			double c = (TD/ATT)*20;
			double d = 2.375 - ((INT/ATT)*25);
			
			double passerRating = ((a+b+c+d)/6)*100;
			//calculates passer rating 
			
			System.out.printf("Your passer rating is %.1f", passerRating);
			
			
	}

}

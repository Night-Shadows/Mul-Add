package dynamic;
import java.util.Scanner;

public class testDynamic {
	public static void main(String args[]) {
		boolean running = true;
		while(running) {
			Mathmatics maths = null;
			System.out.println("Do you want to multiply [1] or add [2] two numbers? \n[1] Multiply\n[2] Add");
			Scanner scan = new Scanner(System.in);
			double mulladd = 0, number1 = 0, number2 = 0;
			if (scan.hasNext())
				mulladd = scan.nextDouble();

			System.out.println("First number: ");
			if (scan.hasNext())
				number1 = scan.nextDouble();


			System.out.println("Second number: ");

			if (scan.hasNext())
				number2 = scan.nextDouble();
			double result;
			if (mulladd == 1)
				result = maths.multiplyDouble(number1, number2);
			else
				result = maths.addingDouble(number1, number2);

			System.out.println("The result is: " + result);

			System.out.println("want to go again? \n[y] yes\n[n] no");
			switch (scan.next()){
				case "y":
					break;
				default:
					running = false;
			}
		}
			
	}
}

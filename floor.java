import java.util.Scanner;

public class floor {
	// computes and writes floor(sqrt(x)) for
	// an input value v >= 0

	public static void main(String[] args) {
		
		int x; // input value
		Scanner input = new Scanner(System.in);
		System.out.println("Find the floor of the square root of: ");
		
		
		//initialize
		int result = 0; // will equal floor of sqrt(x)
		int temp1 = 1;
		int temp2 = 1;
		
		// read input
		x = input.nextInt();
		
		
		// compute floor
		while (temp1 <= x) {
			++result;
			temp2 += 2;
			temp1 += temp2;
		} // end while
		System.out.println("The floor of the square root of " + x + " is " + result);
		input.close();
	}

}

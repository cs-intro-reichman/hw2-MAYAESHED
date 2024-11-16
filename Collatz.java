// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		// num of seeds
	    int seedN = Integer.parseInt(args[0]);
		// verbose or concise
		String mode = args [1]; 
		// loop from seed 1 to N
		for (int seed = 1; seed <= seedN; seed++) {
			int currentseed = seed;
			String seedsLine = currentseed + " ";
			int steps = 1;
			// loop until the line reaches 1	
			while (currentseed == 1) {
				if (currentseed % 2 != 0) {
					currentseed = (currentseed * 3) + 1; //odd
				} else {
					currentseed = currentseed / 2; // even
				}
				seedsLine += currentseed + " ";
				steps ++;
			}	
			while (currentseed != 1) {
				if (currentseed % 2 != 0) {
					currentseed = (currentseed * 3) + 1; //odd
				} else {
					currentseed = currentseed / 2; // even
				}
				seedsLine += currentseed + " ";
				steps ++;
			}	
			// verbose mode
			if (mode.equals("v")) {
				System.out.println(seedsLine + "(" + steps + ")");		
			}
		}		
		System.out.println("Every one of the first " + seedN + " hailstone sequences reached 1.");
	}
}


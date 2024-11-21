// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
		int numOfTerms = Integer.parseInt(args[0]);
		double sum = 0.0;
		for (int i = 0; i < numOfTerms; i++) {
			// 1.0 / (2 * i + 1)= 1, 1/3, 1/5, 1/7 ...
			double term = 1.0 / (2 * i + 1);
			// the even index are (+) and the odd are (-)
			if (i % 2 == 0) {
				sum += term;
			} else {
				sum -= term;
			}
		}
		double approxPI = sum * 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + approxPI);		
	}	
}


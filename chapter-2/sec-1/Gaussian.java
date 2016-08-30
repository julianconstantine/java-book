/******************************************************************************
 *  Compilation:  javac Gaussian.java
 *  Execution:    java Gaussian x mu sigma
 *
 *  Function to compute the Gaussian pdf (probability density function)
 *  and the Gaussian cdf (cumulative density function)
 *
 *  % java Gaussian 820 1019 209
 *  0.17050966869132111
 *
 *  % java Gaussian 1500 1019 209
 *  0.9893164837383883
 *
 *  % java Gaussian 1500 1025 231
 *  0.9801220907365489
 *
 *  The approximation is accurate to absolute error less than 8 * 10^(-16).
 *  Reference: Evaluating the Normal Distribution by George Marsaglia.
 *  http://www.jstatsoft.org/v11/a04/paper
 *
 ******************************************************************************/

public class Gaussian {
    // Return phi(x), the standard Gaussian PDF
    public static double phi(double x) {
	// phi(x) = (1/sqrt(2*pi))*exp(-x^2/2)
	return Math.exp(-x * x / 2) / Math.sqrt(2 * Math.PI);
    }

    // Return phi(x; mu, sigma), the Gaussian PDF
    public static double phi(double x, double mu, double sigma) {
	return phi((x - mu) / sigma) / sigma;
    }

    // Return Phi(z), the standard Gaussian CDF using the Taylor approx.
    public static double Phi(double z) {
	if (z < -8.0) return 0.0;
	if (z > 8.0) return 1.0;

	double sum = 0.0, term = z;

	for (int i = 3; sum + term != sum; i += 2) {
	    sum += term;
	    term *= (z * z) / i;
	}

	return 0.5 + sum * phi(z);
    }

    // Return Phi (z; mu, sigma)
    public static double Phi(double z, double mu, double sigma) {
	return Phi((z - mu) / sigma);
    }

    // Compute z such that Phi(z) = y via bisection search
    public static double PhiInverse(double y) {
	return PhiInverse(y, 0.00000001, -8, 8);
    }

    // Bisection search
    private static double PhiInverse(double y, double delta, double low, double high) {
	double mid = low + (high - low) / 2;
	
	if (high - low < delta) return mid;
	if (Phi(mid) > y) return PhiInverse(y, delta, low, mid);
	else return PhiInverse(y, delta, mid, high);
    }

    // Test client
    public static void main(String[] args) {
	double z = Double.parseDouble(args[0]);
	double mu = Double.parseDouble(args[1]);
	double sigma = Double.parseDouble(args[2]);

	System.out.println(Phi(z, mu, sigma));

	double y = Phi(z);
	
	System.out.println(PhiInverse(y));
    }
}
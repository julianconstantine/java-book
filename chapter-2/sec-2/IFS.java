/******************************************************************************
 *  Compilation:  javac IFS.java
 *  Execution:    java IFS trials < input.txt
 *  Dependencies: StdDraw.java
 *
 *  Here are some sample data files:
 *  
 *  http://www.cs.princeton.edu/introcs/22library/barnsley.txt
 *  http://www.cs.princeton.edu/introcs/22library/binary.txt
 *  http://www.cs.princeton.edu/introcs/22library/culcita.txt
 *  http://www.cs.princeton.edu/introcs/22library/cyclosorus.txt
 *  http://www.cs.princeton.edu/introcs/22library/dragon.txt
 *  http://www.cs.princeton.edu/introcs/22library/fern-sedgewick.txt
 *  http://www.cs.princeton.edu/introcs/22library/fishbone.txt
 *  http://www.cs.princeton.edu/introcs/22library/floor.txt
 *  http://www.cs.princeton.edu/introcs/22library/koch.txt
 *  http://www.cs.princeton.edu/introcs/22library/sierpinski.txt
 *  http://www.cs.princeton.edu/introcs/22library/spiral.txt
 *  http://www.cs.princeton.edu/introcs/22library/swirl.txt
 *  http://www.cs.princeton.edu/introcs/22library/tree.txt
 *  http://www.cs.princeton.edu/introcs/22library/zigzag.txt
 *
 ******************************************************************************/

public class IFS {
    public static void main(String[] args) {
	// Number of iterations
	int trials = Integer.parseInt(args[0]);

	// Probability distribution for choosing each rule
	double[] dist = StdArrayIO.readDouble1D();

	// Update matrices
	double[][] cx = StdArrayIO.readDouble2D();
	double[][] cy = StdArrayIO.readDouble2D();

	// Iniiialize current value of x, y to 0, 0
	double x = 0.0, y = 0.0;

	// Do trials number of iterations of the chaos game
	StdDraw.enableDoubleBuffering();

	for (int t = 0; t < trials; t++) {
	    // Pick a random rule according to the probability distribution
	    int r = StdRandom.discrete(dist);

	    // Do the update
	    double x0 = cx[r][0] * x + cx[r][1] * y + cx[r][2];
	    double y0 = cy[r][0] * x + cy[r][1] * y + cy[r][2];

	    x = x0;
	    y = y0;

	    // Draw the resulting point
	    StdDraw.point(x, y);

	    // For efficiency, display only every 100 iterations
	    if (t % 100 == 0) {
		StdDraw.show();
		StdDraw.pause(10);
	    }
	}

	// Ensure that everything gets drawn
	StdDraw.show();
    }
}
/******************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski n size
 *  Dependencies: StdDraw.java
 *
 *  Play chaos game on triangle to produce Sierpinski triangle.
 *  Plots n points.
 *
 *  % java Sierpinski 10000
 *
 ******************************************************************************/

public class Sierpinski {
    public static void main(String[] args) {
	// Number of points to plot
	int n = Integer.parseInt(args[0]);

	double[] cx = { 0.000, 1.000, 0.500 };
	double[] cy = { 0.000, 0.000, 0.866 };

	double x = 0.0, y = 0.0;

	for (int i = 0; i < n; i++) {
	    // Generate a random number between 0 and 2
	    // Equivalent to: (int) 3*Math.random()
	    int r = StdRandom.uniform(3);

	    x = (x + cx[r]) / 2.0;
	    y = (y + cy[r]) / 2.0;

	    StdDraw.point(x, y);
	}
    }
}
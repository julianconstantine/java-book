/******************************************************************************
 *  Compilation:  javac Transpose.java
 *  Execution:    java Transpose n
 *  
 *  Transpose an n-by-n matrix in-place, without creating a second
 *  2D array.
 *
 *  Submitted by Christian Rubio.
 *
 ******************************************************************************/

import java.util.Arrays;

public class Transpose {
    public static void main(String[] args) {
	// Size of matrix
	int n = Integer.parseInt(args[0]);

	// Initialize an empty n x n matrix
	int[][] A = new int[n][n];
	
	// Fill in the matrix with the numbers 1, 2, ..., n^2
	for (int i = 0; i < n; i++) {
	    for (int j = 0; j < n; j++) {
		A[i][j] = i*n + j + 1;
	    }
	}

	// Print out the matrix
	System.out.println(Arrays.deepToString(A));

	// Transpose the matrix
	for (int i = 0; i < n; i++) {
	    for (int j = i+1; j < n; j++) {
		int temp = A[i][j];
		A[i][j] = A[j][i];
		A[j][i] = temp;
	    }
	}

	// Print out the transposed matrix
	System.out.println(Arrays.deepToString(A));
    }
}
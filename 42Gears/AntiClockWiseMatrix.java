// Anti-Clock-Wise-Rotate-Matrix
input : 	int [] [] matrix = {{1,2,3,4},
				{5,6,7,8}};
output : roatated Array
[4, 8]
[3, 7]
[2, 6]
[1, 5]

package com.company;
import java.util.*;
public class AnticlockWiseMatrix {
	public static void main(String[] args) {
		int [] [] matrix = {{1,2,3,4},
				{5,6,7,8}};
		// Calls Static Method RoatateMatrix and store result in reversedMatrix
		int [][] reversedMatrix = RotateMatrix(matrix);
		System.out.println("roatated Array");
		for(int rows []:reversedMatrix)
		{
			System.out.println(Arrays.toString(rows));
		}
	}
	// Static Method of RotateMatrix
	static int [][] RotateMatrix(int matrix [][])
	{
		// Length of rows and colunmns
		int rows = matrix.length;
		int cols = matrix[0].length;
		// Create a new matrix of size cols x rows → 4 x 2 to store the rotated result.
		int [] [] reversedMatrix = new int [cols][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				//reversedMatrix[4 - 0 - 1][0] = matrix[0][0];
                                //reversedMatrix[3][0] = 1;

				reversedMatrix[cols-j-1][i] = matrix[i][j];
			}
		}
		return reversedMatrix;
	}

}

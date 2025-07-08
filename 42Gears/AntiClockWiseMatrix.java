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
		int [][] reversedMatrix = RotateMatrix(matrix);
		System.out.println("roatated Array");
		for(int rows []:reversedMatrix)
		{
			System.out.println(Arrays.toString(rows));
		}
	}
	static int [][] RotateMatrix(int matrix [][])
	{
		int rows = matrix.length;
		int cols = matrix[0].length;
		int [] [] reversedMatrix = new int [cols][rows];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				reversedMatrix[cols-j-1][i] = matrix[i][j];
			}
		}
		return reversedMatrix;
	}

}

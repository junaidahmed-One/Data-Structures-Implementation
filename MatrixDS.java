import java.util.*;
import java.io.*;

public class MatrixDS {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no. of rows & columns: ");
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matrix = new int[m][n];
		takeInputForMatrix(matrix);
		printMatrix(matrix);
	}

	public static void takeInputForMatrix(int[][] matrix) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values of matrix: ");
		int m = matrix.length;
		int n = matrix[0].length;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = scan.nextInt();
			}
		}

	}

	public static void printMatrix(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
import java.util.*;
import java.io.*;

public class ArraysDS {

	public static void main(String[] args) {
		int n = 5;
		int[] arr = new int[n];
		takeInputForArray(arr, n);
		printArray(arr, n);
		rightShift(arr, 2);

	}

	public static void leftShift(int[] arr, int k) {
		int count = 0;
		while (count < k) {
			int firstEle = arr[0];
			for (int i = 0; i < arr.length - 1; i++) {
				arr[i] = arr[i + 1];
			}
			arr[arr.length - 1] = firstEle;
			count++;
		}
		printArray(arr, arr.length);
	}

	public static void rightShift(int[] arr, int k) {

		int count = 0;
		while (count < k) {
			int lastEle = arr[arr.length - 1];
			for (int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = lastEle;
			count++;
		}
		printArray(arr, arr.length);
	}

	public static void takeInputForArray(int[] arr, int n) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
	}

	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n ; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
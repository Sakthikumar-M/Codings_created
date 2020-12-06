/*
Given an array of integers say nums and an integer say target, return
indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and
you may not use the same element twice.You can return the answer in any order.
 */
package sample_codes;
import java.util.Scanner;

public class Java_Target_Identification {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Target value = ");
		int ans = scn.nextInt();
		System.out.println();
		@SuppressWarnings("unused")
		boolean flag = target(arr, ans);
		if(flag==false) {
			System.out.println("No matching value in array");
		}

	}

	public static boolean target(int[] arr, int ans) {
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] + arr[j] == ans) {
					System.out.println("Array[" + i + "] + Array[" + j + "]  = " + arr[i] + " + " + arr[j]);
					flag = true;
				}
			}
		}
		return flag;		
	}

}

package a_cake;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();// ��������
		int k = scn.nextInt();// ��������

		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		int fullPerson = 0;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (count < k) {
				count += arr[i];
			} else {
				++fullPerson;
				count = arr[i];
			}
		}
		System.out.println(fullPerson + 1);
	}
}

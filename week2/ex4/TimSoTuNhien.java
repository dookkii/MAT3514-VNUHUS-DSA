package vn.io.tunaa.dsa.week2.ex4;

import java.util.Scanner;

public class TimSoTuNhien {
    public static void insertionSort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }

            a[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        insertionSort(arr);

        if (arr[0] > 0) {
            System.out.println(0);
            return;
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                System.out.println(arr[i - 1] + 1);
                return;
            }
        }

        System.out.println(arr[n - 1] + 1);
    }
}

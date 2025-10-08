package vn.io.tunaa.dsa.week2.ex4;

import java.util.Scanner;

public class TanSo {
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

        int count = 1;
        for (int i = 1; i < n; i++){
            if (arr[i] == arr[i - 1]){
                count++;
            } else {
                System.out.print(arr[i -1] + " " + count + "; ");
                count = 1;
            }
        }
        System.out.print(arr[n - 1] + " " + count + "; ");
    }
}

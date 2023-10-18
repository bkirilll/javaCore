package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2, -6, 9, 0, 0, -4, 16, 19, 43};
        System.out.println(numberOfEvenNumbers(array));
        System.out.println(diffMaxMin(array));
        System.out.println(neighbourZero(array));
    }


    public static int numberOfEvenNumbers(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) count++;
        }
        return count;
    }

    public static int diffMaxMin(int[] arr) {
        int max = 0, min = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < 0) {
                min = j;
            }
        }
        return max - min;
    }

    public static boolean neighbourZero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] && arr[i] == 0) return true;
        }
        return false;
    }

}
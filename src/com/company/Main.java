package com.company;

public class Main {

    public static void main(String[] args) {
	   int[] array = {1, 10, 20, 4, 5, 7, 2, 3, 5, 4};
	   QuickSort.quickSort(array);
	   for(int n : array)
	   	System.out.printf("%d ", n);
    }
}

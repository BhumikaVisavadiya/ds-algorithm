package org.algorithms;

import java.util.Arrays;

public class QuickSort {
	
	static int[] arr = {4,2,7,8,1,0};
	
	public static void main(String... args){
		
		System.out.println(Arrays.toString(arr));

		quickSort(0,arr.length-1);

		System.out.println(Arrays.toString(arr));
	}
	
	private static void quickSort(int lowerIndex, int higherIndex){
		
		int i = lowerIndex;
		int j = higherIndex;		
		int pivot = arr[lowerIndex + (higherIndex - lowerIndex)/2];
		
		while(i<=j){
			
			while(arr[i]<pivot){
				i++;
			}
			
			while(arr[j]>pivot){
				j--;
			}
			
			if(i<=j){
				exchangeNumbers(i,j);
		        i++;
		        j--;
			}
		}
		
		if(lowerIndex < j){
			quickSort(lowerIndex, j);
		}
		if(i < higherIndex){
			quickSort(i, higherIndex);
		}
	}
	
	private static void exchangeNumbers(int i, int j) {
		int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}

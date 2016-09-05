package org.algorithms;

import java.util.Arrays;

public class InsertionSort {
	
	public static void main(String... args){
		
		int[] arr = {2,4,0,12,1};
		
		int n = arr.length;
		
		System.out.println(Arrays.toString(arr));
		
		for(int j=1; j<n; j++){
			
			int key = arr[j];
			int i = j-1;
			
			while((i>-1) && (arr[i] > key)){
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1]=key;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}

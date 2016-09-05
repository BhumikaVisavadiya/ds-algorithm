package org.algorithms;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args){
		
		int[] arr = {27,14,35,33,10};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length;i++){
			for(int j=1;j<(arr.length-i);j++){
				if(arr[j-1]>arr[j]){
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1]=tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}	
}

package org.algorithms;

import java.util.Arrays;

public class MergeSort {
	
	static int[] arr = {4,1,2,23,5,1,4,5,6,3,0,12};
	static int[] tmpArr;
	
	public static void main(String... args){
		
		tmpArr = new int[arr.length];
		System.out.println(Arrays.toString(arr));
		mergeSort(0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	private static void mergeSort(int lowIndex, int highIndex){
		
		if(lowIndex < highIndex){
			
			int middle = lowIndex + (highIndex - lowIndex)/2;
			
			mergeSort(lowIndex, middle);
			mergeSort(middle+1, highIndex);
			mergeParts(lowIndex, middle, highIndex);
		}
	}
	
	private static void mergeParts(int lowIndex, int middle, int highIndex){
		for(int i=lowIndex; i<=highIndex; i++){
			tmpArr[i]=arr[i];
		}
		int i=lowIndex;
		int j=middle+1;
		int k=lowIndex;
		
		while(i<=middle && j<=highIndex){
			if(tmpArr[i] < tmpArr[j]){
				arr[k]=tmpArr[i];
				i++;
			}else{
				arr[k]=tmpArr[j];
				j++;
			}
			k++;
		}
		
		while(i<=middle){
			arr[k]=tmpArr[i];
			k++;
			i++;
		}
	}
}

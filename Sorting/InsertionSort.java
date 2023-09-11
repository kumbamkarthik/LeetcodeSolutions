package newPack;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5,4,1};
		System.out.println(Arrays.toString(ISort(arr)));
	}
	static void swap(int arr[],int a1,int a2) {
		int temp = arr[a1];
		arr[a1] = arr[a2];
		arr[a2] = temp;
	}
	static int[] ISort(int arr[]) {
		for(int i=0;i<arr.length-1 ;i++) {
			for(int j=i+1;j>0;j--) {
				if(arr[j-1]>arr[j])
					swap(arr,j,j-1);
				else
					break;
			}
		}
		return arr;
	}
	}

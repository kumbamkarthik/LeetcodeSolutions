package newPack;
import java.util.Arrays;
public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5,4,1};
		System.out.println(Arrays.toString(SSort(arr)));
	}
	static int [] SSort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int last = arr.length-i-1;
			int max = getMaxIndex(arr,0,last);
			swap(arr,max,last);
		}
		return arr;
	}
	static void swap(int arr[],int a1,int a2) {
		int temp = arr[a1];
		arr[a1] = arr[a2];
		arr[a2] = temp;
	}
	static int getMaxIndex(int arr[],int start,int last) {
		int max=start;
		for(int i=start;i<=last;i++) {
			if(arr[i]>arr[max])
				max = i;
		}
		return max;
	}
}

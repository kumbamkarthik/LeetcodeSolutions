package newPack;
import java.util.Arrays;
public class QuickSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {23,57,11,2,45,33,9,12};
        QSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
	static void QSort(int arr[],int low,int high) {
		if(low>high)
			 return;
		int start = low,end=high;
		int mid = start + (end-start)/2;
		int pivot = arr[mid];
		while(start<=end) {
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				start++;
				end--;
			}
		}
		QSort(arr,low,end);
		QSort(arr,start,high);
	} }

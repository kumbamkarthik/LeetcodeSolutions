package newPack;
import java.util.Arrays;
public class sprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {23,34,42,45,54,65,69,72,93};
		int target = 57;
		System.out.println(Ceil(arr,target));
		System.out.println(Floor(arr,target));
	}
	static int Ceil(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		if(target>arr[end])
			return -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>target) 
				end = mid-1;
			else if(arr[mid]<target)
				start = mid+1;
			else
				return mid;
		}
		return arr[start];
	}
	static int Floor(int arr[],int target) {
		int start = 0;
		int end = arr.length-1;
		if(target<arr[start])
			return -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>target)
				end = mid-1;
			else if(arr[mid]<target)
				start = mid+1;
			else
				return mid;
		}
		return arr[end];
	}
}

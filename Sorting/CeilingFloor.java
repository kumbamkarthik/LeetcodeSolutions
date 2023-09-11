package newPack;

public class CeilingFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44,55,66,77,88};
		int target = 23;
		System.out.println(Ceiling(arr,target));
		System.out.println(Floor(arr,target));
	}
	static int Ceiling(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		if(target>arr[arr.length-1])
			return  -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>target)
				end = mid-1;
			else if(arr[mid]<target)
				start = mid+1;
			else
				return mid;
		}
		return start;
     }
	static int Floor(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		if(target<arr[0])
			return  -1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]>target)
				end = mid-1;
			else if(arr[mid]<target)
				start = mid+1;
			else
				return mid;
		}
		return end;
    }
}
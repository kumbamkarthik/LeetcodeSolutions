package newPack;
public class BinarySerach {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {11,22,33,44,55,66,77,88};
		int target = 33;
		System.out.println(BSearch(arr,target));
	}
	static int BSearch(int[] arr,int target) {
		int start = 0;
		int end = arr.length-1;
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[mid]>target)
				end = mid-1;
			else
				start = mid+1;
		}
		return -1;
	}

}

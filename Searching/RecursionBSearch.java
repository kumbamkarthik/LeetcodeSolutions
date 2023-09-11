package newPack;

public class RecursionBSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,24,38,42,59,61,77};
		int target = 61;
		System.out.println(BSearch(arr,target,0,arr.length-1));
	}
	static int BSearch(int arr[],int target,int start,int end) {
		int mid = start + (end-start)/2;
		if(arr[mid]==target)
			return mid;
		if(arr[mid]>target)
			return BSearch(arr,target,start,mid-1);
		return BSearch(arr,target,mid+1,end);
	}

}
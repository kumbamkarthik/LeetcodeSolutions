package newPack;

public class RotatedSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,0,1,2};
		int target = 1;
		int ans = search(arr,target);
		System.out.print(ans);

	}
	static int search(int[] nums, int target) {
		int pivot = findPivot(nums);
		if(pivot==-1)
			return BSearch(nums,target,0,nums.length-1);
		else {
			int firstTry = BSearch(nums,target,0,pivot);
			if(firstTry!=-1)
				return firstTry;
			else
				return BSearch(nums,target,pivot+1,nums.length-1);
		}
		 
	 }
	static int BSearch(int arr[],int target,int start,int end) {
		while(start<=end) {
			int mid = start + (end-start)/2;
			if(target<arr[mid])
				end = mid-1;
			else if(target>arr[mid])
				start = mid+1;
			else
				return mid;
		}
		return -1;
	}
	static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
            	return mid-1;
            if(arr[mid]<=arr[start])
            	end = mid-1;
            else
            	start = mid + 1;
        }
        return -1;
    }
	static int findPivotDuplicates(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
                return mid;
            if(mid>start && arr[mid]<arr[mid-1])
            	return mid-1;
            if(arr[mid]==arr[start] && arr[mid]==arr[end]) {
            	if(arr[start]>arr[start+1])
            		return start+1;
            	start++;
            	if(arr[end]<arr[end-1])
            		return end-1;
                end--;	
            }
            else if(arr[start]<arr[mid] ||
            		(arr[start]==arr[mid] && arr[mid]>arr[end])) {
            	start = mid+1;
            }
            else {
            	end=mid-1;
            }
        }
        return -1;
    }

}

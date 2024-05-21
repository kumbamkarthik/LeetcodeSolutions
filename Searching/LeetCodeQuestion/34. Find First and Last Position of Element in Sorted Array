class Solution {
    public int[] searchRange(int[] nums, int target) {
        int p1 = BinarySearch(nums,target,true);
        int p2 = BinarySearch(nums,target,false);
        return new int [] {p1,p2};
    }
    int BinarySearch(int arr[],int target,boolean flag){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else if(arr[mid]<target){
                start = mid+1;
            }else{
                ans = mid;
                if(flag){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

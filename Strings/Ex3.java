package newPack;

import java.util.Arrays;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,4,3,2,2};
		System.out.println(findDuplicate(arr));
	}
	public static int findDuplicate(int[] nums) {
        nums = CSort(nums);
        return nums[nums.length-1];
   }
   static int[] CSort(int arr[]){
       int i = 0;
       while(i<arr.length){
           int correct = arr[i]-1;
           if(correct!=arr[i])
               swap(arr,i,correct);
           else
               i++;
       }
       return arr;
   }
   static void swap(int arr[],int a,int b){
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;
   }
}

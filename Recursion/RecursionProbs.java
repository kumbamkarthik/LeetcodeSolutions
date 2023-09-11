package newPack;
import java.util.*;
public class RecursionProbs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,5,6,7,1,2,3};
		int target = 4;
		System.out.println(isSorted(arr,0));
		System.out.println(isExisted(arr,0,target));
		System.out.println(repeatedTimes(arr,0,target));
		System.out.println(rotatedBSearch(arr,target,0,arr.length-1));
	}
	static boolean isSorted(int arr[],int index) {
		if(index==arr.length-1)
			return true;
		return (arr[index]<=arr[index+1])&&isSorted(arr,index+1);
	}
	static boolean isExisted(int arr[],int index,int target) {
		if(index == arr.length)
			return false;
		return arr[index]==target || isExisted(arr,index+1,target);	
	}
	static ArrayList<Integer> list = new ArrayList<>();
	static ArrayList<Integer> repeatedTimes(int arr[],int index,int target){
	      if(index==arr.length)
	    	  return list;
	      if(arr[index]==target)
	    	  list.add(index);
	      return repeatedTimes(arr,index+1,target);	  
	}
	static int rotatedBSearch(int arr[],int target,int start,int end) {
		int mid = start + (end-start)/2; 
		if(start>end)
			return -1;
		if(arr[mid]==target)
			return mid;
		if(arr[start]<=arr[mid]) {
			 if(arr[start]<=target && arr[mid]>=target)
				 return rotatedBSearch(arr,target,start,mid-1);
			 else
				 return rotatedBSearch(arr,target,mid+1,end);	 
		 }
		else {
			if(arr[mid]<=target && arr[end]>=target)
				return rotatedBSearch(arr,target,mid+1,end);
			else
				return rotatedBSearch(arr,target,start,mid-1);
		}
	}
	
}

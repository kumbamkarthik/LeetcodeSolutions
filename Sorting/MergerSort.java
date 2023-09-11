package newPack;
import java.util.Arrays;
public class MergerSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,5,34,11,99,24,51,63,57};
		System.out.println(Arrays.toString(MSort(arr)));
	}
	static int [] MSort(int arr[]) {
		if(arr.length==1)
			 return arr;
		int mid = arr.length/2;
		int first[] = MSort(Arrays.copyOfRange(arr,0,mid));
		int second[] = MSort(Arrays.copyOfRange(arr,mid,arr.length));
		return merge(first,second);
	}
	static int [] merge(int arr1[],int arr2[]) {
		int res[] = new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j])
				res[k++] = arr1[i++];
			else 
				res[k++] = arr2[j++];
		}
		while(i<arr1.length)
			res[k++] = arr1[i++];
		while(j<arr2.length)
			res[k++] = arr2[j++];
		return res;
	}
}

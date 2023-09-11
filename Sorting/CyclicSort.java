package newPack;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int arr[] = {1,4,2,6,7,5,8,3};
	    System.out.println(Arrays.toString(CSort(arr)));
	}
	static void swap(int arr[],int a,int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	static int[] CSort(int arr[]) {
		int i=0;
		while(i<arr.length) {
			int correct = arr[i]-1;
			if(arr[i]!=arr[correct])
				swap(arr,i,correct);
			else
				i++;
		}
		return arr;
	}
}

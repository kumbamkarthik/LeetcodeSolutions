package newPack;
import java.util.Arrays;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,2,5,4,1};
		System.out.println(Arrays.toString(BSort(arr)));
	}
	static int [] BSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
		}
		return arr;
	}
}
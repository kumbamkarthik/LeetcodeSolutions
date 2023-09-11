package newPack;
import java.util.Arrays;
public class RecursionPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=8;
      // Pattern3(n,0);
      // Pattern4(n,0);
        int arr1[] = {91,63,31,46,21,56,11,9};
        int arr2[] = {3,6,2,9,7,1,22,64};
        BubbleSort(arr1,n-1,0);
        SelectionSort(arr2,n-1,0,0);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
	}
    static void Pattern3(int row,int col) {
    	if(row==0)
    		return;
    	if(row!=col) {
    		System.out.print("*");
    		Pattern3(row,col+1);
    	}
    	else {
    		System.out.println();
    		Pattern3(row-1,0);
    	}
    }
    static void Pattern4(int row,int col) {
    	if(row==0)
    		return;
    	if(col<row) {
    		Pattern4(row,col+1);
    		System.out.print("*");
    	}
    	else {
    		Pattern4(row-1,0);
    		System.out.println();
    	}
    }
    static void BubbleSort(int arr[],int r,int c) {
    	if(r==0)
    		return;
    	if(c<r){
    		if(arr[c]>arr[c+1])
    			swap(arr,c,c+1);
    		BubbleSort(arr,r,c+1);
    	}
    	else
    		BubbleSort(arr,r-1,0);    		
    }
    static void swap(int arr[],int a,int b) {
    	int temp = arr[a];
    	arr[a] = arr[b];
    	arr[b] = temp;
    }
    static void SelectionSort(int arr[],int r,int c,int max) {
    	if(r==0)
    		return;
    	if(c<r) {
    		if(arr[c]>arr[max])
    			SelectionSort(arr,r,c+1,c);
    		else
    			SelectionSort(arr,r,c+1,max);
    	}
    	else {
    		swap(arr,r-1,max);
    		SelectionSort(arr,r-1,0,0);
    	}
    }
}



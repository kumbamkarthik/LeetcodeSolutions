package newPack;

import java.util.Arrays;

public class BSearchSorted2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		System.out.println(Arrays.toString(search(arr,25)));

	}
	static int [] BSearch(int [][] arr,int row,int cstart,int cend,int target) {
		while(cstart<=cend) {
			int mid = cstart+(cend-cstart)/2;
			if(arr[row][mid]==target)
				return new int[] {row,mid};
			if(arr[row][mid]<target)
				cstart = mid+1;
			else
				cend = mid-1;	
		}
		return new int[] {-1,-1};
	}
	static int [] search(int [][]arr,int target) {
		int rows = arr.length;
		int col = arr[0].length;
		if(rows==1) {
			return BSearch(arr,0,0,col-1,target);
		}
		int rstart = rows;
		int rend = rows-1;
		int cmid = col/2;
		while(rstart<=rend-1) {
			int mid = rstart + (rend-rstart)/2;
			if(arr[mid][cmid]==target)
				return new int[] {mid,cmid};
			if(arr[mid][cmid]<target) 
				rstart = mid;
			else
				rend = mid;
		}
		if(arr[rstart][cmid]==target)
			return new int[] {rstart,cmid};
		if(arr[rstart+1][cmid]==target)
			return new int[] {rstart+1,cmid};
		if(target<=arr[rstart][cmid-1])
			return BSearch(arr,rstart,0,cmid-1,target);
		if(target>=arr[rstart][cmid+1] && target<=arr[rstart][col-1]);
			return BSearch(arr,rstart,cmid+1,col-1,target);
	/*	if(target<=arr[rstart+1][cmid-1])
			return BSearch(arr,rstart+1,0,cmid-1,target);
		else
			return BSearch(arr,rstart+1,cmid+1,col-1,target);
		*/	
	}

}

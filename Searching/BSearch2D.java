package newPack;
import java.util.Arrays;
public class BSearch2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = {
				{10,20,30,40},
				{15,25,35,45},
				{18,28,37,46},
				{19,29,39,48}
		};
		int target =25;
		System.out.println(Arrays.toString(BinSearch(arr,target)));
	}
	static int[] BinSearch(int[][] arr,int target) {
		int r=0,c=arr.length-1;
		while(r<arr.length-1 &&c>0) {
			if(arr[r][c]==target)
				return new int[] {r,c};
			else if(arr[r][c]<target)
				r++;
			else
				c--;
		}
		return new int[] {-1,-1};
	}
}

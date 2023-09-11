package newPack;

import java.util.Arrays;

public class Spiral {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][] = {
    		  {1,2,3,4,5,6},
    		  {7,8,9,10,11,12},
    		  {13,14,15,16,17,18}
    		  };
      System.out.println(Arrays.toString(SpiralSort(arr)));	
    }
	static int[] SpiralSort(int arr[][]){
		int row = arr[0].length;
		int col = arr.length;
		int res[] = new int[row*col];
		int count = 0;
		int i=0,j=0;
		int c1=row,c2=col,c3=0,c4=0;
		while(count<row*col) {
			while(j<c1) {
				res[count] = arr[i][j++];
				count++;
			}
			if(count==row*col)
				break;
			i++;
			j--;
			while(i<c2) {
				res[count] = arr[i++][j];
				count++;
			}
			if(count==row*col)
				break;
			j--;
			i--;
			while(j>=c4) {
				res[count] = arr[i][j--];
				count++;
			}
			if(count==row*col)
				break;
			i--;
			j++;
			while(i>c3) {
				res[count] = arr[i--][j];
				count++;
			}
			i++;
			j++;
			c1--;
			c2--;
			c3++;
			c4++;   
		}
		return res;

	}
}

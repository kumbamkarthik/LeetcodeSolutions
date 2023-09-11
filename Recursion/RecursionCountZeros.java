package newPack;

public class RecursionCountZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n =1209790;
         Zeros(n);
         System.out.println(count);
	}
	static int count=0;
	static void Zeros(int n) {
		if(n==0)
			return;
		if(n%10==0)
			count++;
		Zeros(n/10);
	}
}

package newPack;
public class RecFibo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(7));
	}
	static int fibo(int n) {
	    if(n<2)
	    	return n;
	    return fibo(n-1)+fibo(n-2);
	}
}

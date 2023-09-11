package newPack;
import java.util.Scanner;
public class DiceThrow {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Dice("",n);
	}
	static void Dice(String p,int n) {
		if(n==0) {
			System.out.println(p);
			return;
		}
		for(int i=1;i<=6&&i<=n;i++) {
			Dice(p+i,n-i);
		}
	}
}

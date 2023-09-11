package newPack;
import java.util.Scanner;
public class StringPermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		permutations("",str);
		System.out.println(count);
	}
	static int count=0;
	static void permutations(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			count++;
			return;
		}
		char ch = up.charAt(0);
		for(int i=0;i<=p.length();i++) {
			String s1,s2;
			s1 = p.substring(0,i);
			s2 = p.substring(i,p.length());
			permutations(s1+ch+s2,up.substring(1));
		}
	}
}

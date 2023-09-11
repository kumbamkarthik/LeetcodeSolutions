package newPack;
public class SubSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "abc";
    SubStrings("","abc");
	}
	static void SubStrings(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		SubStrings(p+ch,up.substring(1));
		SubStrings(p,up.substring(1));
	}
}

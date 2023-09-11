package newPack;

public class LinearSerach {
	public static void main(String[] args) {
		String name = "karthik";
		char target = 'i';
	    System.out.println(search(name,target));	
	}
	public static boolean search(String str, char target) {
		if(str.length()==0)
			return false;
		else {
			for(char c : str.toCharArray()) {
				if(c==target)
					return true;
			}
			return false;
		}
	}

}

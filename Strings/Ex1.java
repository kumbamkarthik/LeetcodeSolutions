package newPack;

import java.util.ArrayList;
import java.util.List;

interface example1{
	void noArguments();
}
interface example2{
	void twoArguments(String s1, String s2);
}
class example3{
	Integer a1;
	String a2;
	String a3;
	public Integer getA1() {
		return a1;
	}
	public void setA1(Integer a1) {
		this.a1 = a1;
	}
	public String getA2() {
		return a2;
	}
	public void setA2(String a2) {
		this.a2 = a2;
	}
	public String getA3() {
		return a3;
	}
	public void setA3(String a3) {
		this.a3 = a3;
	}
	public example3(Integer a1, String a2, String a3) {
		super();
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}
	public String toString()
    {
        return "empId : "+a1+", empName : "+a2+", country : "+a3;
    }
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example1 k1 = () -> System.out.println("No Arguments");
		k1.noArguments();
		
		example2 k2 = (String x, String y) ->System.out.println("Two Arguments "+x+" "+y);
		k2.twoArguments("Karthik","Reddy");
		
		example3 x1 = new example3(50,"karthik","reddy");
		example3 x2 = new example3(14,"Kaditham","SaiTeja");
		example3 x3 = new example3(49,"Hari","Bharadwaj");
		
		List<example3> newList = new ArrayList<>();
		newList.add(x1);
		newList.add(x2);
		newList.add(x3);
		System.out.println("Before Sort : "+newList);
		newList.sort((l1,l2)->l1.getA1().compareTo(l2.getA1()));
		System.out.println("Before Sort : "+newList);
	}

}

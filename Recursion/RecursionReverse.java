package newPack;
public class RecursionReverse {
        public static void main(String[] args) {
        	int n=12345;
        	//System.out.println(sum(n));
        	int value = (int)(Math.log10(n))+1;
        	System.out.println(value);
            reverse(n);
            System.out.println(sum);
        }
        static int sum(int n) {
        	if(n==0)
        		return 0;
            return sum(n/10)+n%10;
        }
        static int sum=0;
        static int reverse(int n) {
        	if(n==0)
        		return 1;
        	int rem = n%10;
        	sum = sum*10 + rem;
        	return reverse(n/10);
       }
}


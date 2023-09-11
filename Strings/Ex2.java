package newPack;

import java.util.Scanner;
class Ex2{
	public static void main(String[] args) {
    int y,m,d;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the day");
    d = sc.nextInt();
    System.out.println("enter the month");
    m = sc.nextInt();
    System.out.println("enter the year");
    y = sc.nextInt();
    int l,sum = 0;
    if(y%4==0) {
    	if(y%100==0) {
    		if(y%400==0) {
    		     l = 1;    
    		}
    		else {
    			l = 0;
    		}
    	}
    	else {
    		l = 1;
    	}
    }
    else {
    	 l =0;
    }
     int temp = y;
     y = y%400;
     int x = y/100;
     if(x==1) {
    	 sum = sum + 5; 
     }
     else if( x==2) {
    	 sum = sum +3;
     }
     else if(x==3) {
    	 sum = sum +1;
     }
     int a = y%100 ;
     for(int i =1;i<a;i++) {
    	 if(i%4==0) {
    		 sum = sum +2;
    	 }
    	 else {
    		 sum = sum +1;
    	 }
     }
     for(int i=1;i<m;i++) {
    	 if((i<=7)&&(i%2!=0)) {
    		 sum = sum +3;
    	 }
    	 else if((i<=7)&&(i%2==0)&&(i!=2)) {
    		 sum = sum + 2;
    	 }
    	 else if((i>=8)&&(i%2!=0)) {
    		 sum = sum + 2;
    	 }
    	 else if((i>=8)&&(i%2==0)) {
    		 sum = sum + 3;
    	 }
    	 else if(i==2) {
    		 if(l==1) {
    			 sum = sum + 1;
    		 }
    	 }
     }
     sum = sum + d;
     if(temp%400==0) {
    	 sum = sum-2;
     }
     sum = sum%7;
     if(sum == 0) {
    	 System.out.println("sunday funday");
     }
     else if(sum == 1) {
    	 System.out.println("monday motivation");
     }
     else if(sum==2) {
    	 System.out.println("tuesday thoughts");
     }
     else if(sum==3) {
    	 System.out.println("wednesday wealth");
     }
     else if(sum==4) {
    	 System.out.println("thirsty thursaday");
     }
     else if(sum==5) {
    	 System.out.println("friday friary");
     }
     else if(sum==6) {
    	 System.out.println("stuntless saturday");
     }
	}
	}

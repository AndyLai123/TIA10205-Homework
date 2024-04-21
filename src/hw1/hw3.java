package hw1;

public class hw3 {
    public static void main(String[] args) {
    	int num = 256559;
    	int day, hr, min , sec;
    	sec=num % 60;
    	min=(num %(60*60))/60;
    	hr=(num % (60*60*24))/(60*60);
    	day=num / (60*60*24 );
    			
    	System.out.print(day);
    	System.out.print("天");
    	System.out.print(hr);
    	System.out.print("小時");
    	System.out.print(min);
    	System.out.print("分");
    	System.out.print(sec);
    	System.out.print("秒");
    	
    }
}

//Decimal to Binary conversion
import java.util.ArrayList;
public class convertBinary {
	//Recursive version: Keep dividing the number by 2 and adding to call stack-- 
	
	public static String recConvert(int n){
		StringBuilder sb = new StringBuilder();
		if(n>0){
			String res =recConvert(n/2);
			sb.append(res+(n%2));
		}
		return sb.toString();
	}
	
	
	//Iterative version
	public static String itConvert(int n){//To check if ith bit is ON --> & 2^i
		StringBuilder sb = new StringBuilder();
		while(n>0){
			sb.append(n%2);
			n = n/2;
		}
		return sb.reverse().toString(); //Need to reverse it
	}
	public static void main(String args[]){
		String res =itConvert(576);
		System.out.println(res);
		//Calling the recursive version
		res =recConvert(576);
		System.out.println(res);
		
	}
}

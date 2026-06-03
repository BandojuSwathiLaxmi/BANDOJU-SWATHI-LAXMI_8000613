import java.util.*;
class PalindromeChecker{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String rstr="";
		str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for(int i=str.length()-1;i>=0;i--){
			char ch=str.charAt(i);
			rstr+=ch;
		}
		if(str.equals(rstr)){
			System.out.println(str+" is a palindrome.");
		}
		else{
			System.out.println(str+" is not a palindrome.");
		}
	}
}
			
import java.util.*;
class StringReversal{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string:");
		String str=sc.next();
		StringBuilder sb=new StringBuilder(str);
		String reversed=sb.reverse().toString();
		System.out.println("Reversed String:"+reversed);
	}
}
		
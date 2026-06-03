import java.util.*;
class OperatorPrecedence{
	public static void main(String[] args){
		int a=10+5*2;
		int b=(10+5)*2;
		int c=10/5*2;
		int d=20/4+6*4;
		int e=30-4/2+5;
		System.out.println("10+5*2="+a);
		System.out.println("(10+5)*2="+b);
		System.out.println("10/5*2="+c);
		System.out.println("20/4+6*4="+d);
		System.out.println("30-4/2+5="+e);
	}
}
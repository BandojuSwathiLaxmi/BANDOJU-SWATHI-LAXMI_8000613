import java.util.*;
class SimpleCalculator{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Choose an operation");
		char op=sc.next().charAt(0);
		switch(op){
			case '+':System.out.println(a+b);
			break;
			case '-':System.out.println(a-b);
			break;
			case '*':System.out.println(a*b);
			break;
			case '/':System.out.println(a/b);
			break;
			default:System.out.println("enter correct operation");
		}
	}
}

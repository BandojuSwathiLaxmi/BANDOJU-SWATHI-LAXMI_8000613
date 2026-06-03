import java.util.*;
class TryCatch{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two integers:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		try{
			int res=num1/num2;
			System.out.println(num1+" / "+num2+"= "+res);
		}
		catch(ArithmeticException e){
			System.out.println("Error: Division by zero is not allowed!");
		}
	}
}
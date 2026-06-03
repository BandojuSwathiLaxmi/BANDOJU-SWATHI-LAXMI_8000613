import java.util.*;
class Factorial{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter only positive number");
		int num=sc.nextInt();
		if(num<0){
			System.out.println("Enter positive number");
		}
		else{
			int f=1;
			for(int i=1;i<=num;i++){
				f*=i;
			}
			System.out.println("Factorial of "+num+" is "+f);
		}
	}
}
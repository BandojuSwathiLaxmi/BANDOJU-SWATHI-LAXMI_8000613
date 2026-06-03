import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
	}
}
class CustomException{
	static void checkage(int age) throws InvalidAgeException{
		if(age<18){
			throw new InvalidAgeException("Age should be 18 or above are eligible.");
		}
		else{
			System.out.println("You are Eligible");
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter age:");
		int age=sc.nextInt();
		try{
			checkage(age);
		}
		catch(InvalidAgeException e){
			System.out.println(e.getMessage());
		}
	}
}

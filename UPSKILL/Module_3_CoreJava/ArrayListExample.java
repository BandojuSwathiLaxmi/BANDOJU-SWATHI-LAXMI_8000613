package src;
import java.util.*;
class ArrayListExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<String> st=new ArrayList<>();
		System.out.println("no.of names");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter name "+(i+1)+":");
			String name=sc.nextLine();
			st.add(name);
		}
		System.out.println("Student Names:");
		for(String val:st){
			System.out.println(val);
		}
	}
}
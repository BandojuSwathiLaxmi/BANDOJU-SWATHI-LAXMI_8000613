import java.util.*;
class HashMapExample{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> st=new HashMap<>();
		System.out.println("How many Students ?");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.println("Enter Student id:");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Student name:");
			String name=sc.nextLine();
			st.put(id,name);
		}
		System.out.println("\n Enter ID :");
		int target=sc.nextInt();
		if(st.containsKey(target)){
			System.out.println("Student Name:"+st.get(target));
		}
		else{
			System.out.println("Student ID not found in database");
		}
	}
}
import java.util.*;
class LambdaExpressions{
	public static void main(String[] args){
		List<String> names=Arrays.asList("Ramu","Sneha","Preethi","Kiran","Swathi","Nandhu","Keerthi");
		Collections.sort(names,(a,b)->a.compareTo(b));
		System.out.println("Sorted List:");
		for(String name:names)
			System.out.println(name);
	}
}
import java.util.*;
import java.util.stream.*;
record Person(String name, int age) {}
class RecordExample{
    public static void main(String[] args){
        Person p1 = new Person("Hamidha", 20);
        Person p2 = new Person("Jyothi", 15);
        System.out.println(p1);
        System.out.println(p2);
        List<Person> people = List.of(p1,p2,new Person("Kiran", 25));
        List<Person> adults = people.stream().filter(p -> p.age() >= 18).collect(Collectors.toList());
        System.out.println("Adults:");
        for(Person p:adults){
			System.out.println("Name: "+p.name()+",Age:"+p.age());
		}
    }
}
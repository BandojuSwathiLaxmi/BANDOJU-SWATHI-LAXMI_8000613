class Animal{
	void makeSound(){
		System.out.println("Animals will make Sound");
	}
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("Bark");
	}
}
class Inheritance {
	public static void main(String[] args){
		Animal an=new Animal();
		Dog dog =new Dog();
		an.makeSound();
		dog.makeSound();
	}
}
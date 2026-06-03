class MethodOverLoading{
	static void add(int a,int b){
		System.out.println("Sum of two Integer:"+(a+b));
	}
	static void add(double a,double b){
		System.out.println("Sum of two Doubles:"+(a+b));
	}
	static void add(int a,int b,int c){
		System.out.println("multiplication of three Integers:"+(a*b*c));
	}
	public static void main(String[] args){
		add(63.9,34.3);
		add(48,98);
		add(5,9,0);
	}
}
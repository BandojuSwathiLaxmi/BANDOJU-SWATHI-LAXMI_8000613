class Car{
	String make;
	String model;
	int year;
	void displayDetails(){
		System.out.println("Car Details");
		System.out.println("Car Make:"+make+"\n Model: "+model+"\n Year :"+year);
	}
}
class CarClass{
	public static void main(String[] args){
		Car c1=new Car();
		c1.make="Toyato";
		c1.model="Corolla";
		c1.year=2022;
		Car c2=new Car();
		c2.make="Honda";
		c2.model="City";
		c2.year=2023;
		c1.displayDetails();
		c2.displayDetails();
	}
}
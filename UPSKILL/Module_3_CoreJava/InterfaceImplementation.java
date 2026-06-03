interface Playable{
	void play();
}
class Guitar implements Playable{
	public void play(){
		System.out.println("This is Guitar class.Playing Guitar");
	}
}
class Piano implements Playable{
	public void play(){
		System.out.println("This is Piano class.Playing Piano");
	}
}
class InterfaceImplementation{
	public static void main(String[] args){
		Playable guitar=new Guitar();
		Playable piano=new Piano();
		guitar.play();
		piano.play();
	}
}
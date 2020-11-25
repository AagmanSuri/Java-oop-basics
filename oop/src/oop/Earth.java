package oop;

public class Earth {

	public static void main(String[] args) {
		Human tom;
		
		tom= new Human();
		
		tom.age=13;
		tom.name="tom";
		tom.heightininches=56;
		tom.speak();
		System.out.println("\n");
		Human joe = new Human();
		joe.age=31;
		joe.name="joe";
		joe.heightininches=98;
		
		joe.speak();
		
	}

}

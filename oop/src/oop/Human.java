package oop;

public class Human {//This is the Human Class
		
	String name;
	int age;
	int heightininches;
	String eyeColour;
public Human() {//constructor method//name should be same as the class name
	age=13;
	name="tom";
	heightininches=56;
}

public void speak() {
	System.out.println("Hello, My name is "+name);
	System.out.println("My age is  "+age);
	System.out.println("I am  "+heightininches+" inches Tall");
	}
public void walk() {
	System.out.println("walkinggggg....");
	}
public void eat() {
	System.out.println("eatinggggg....");
	}
public void work() {
	System.out.println("workinggggg....");
	}
} 
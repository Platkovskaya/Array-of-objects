package by.htp.animal.model;

public class Dog {

	Animal animal = new Animal("Bim");

	public void bark() {
		System.out.println("I am " + animal.name + " and I am barking");
	}

	public void run() {
		System.out.println("I am " + animal.name + " and I am runing ");
	}

	public void jump() {
		System.out.println("I am " + animal.name + " and I am jumping");
	}

	public void bit() {
		System.out.println("I am " + animal.name + " and I am biting");
	}

}

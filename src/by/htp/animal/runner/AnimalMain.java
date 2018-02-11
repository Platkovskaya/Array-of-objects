//Создать объект класса Щенок, используя классы Животное, Собака.
//Методы: вывести на консоль имя, подать голос, прыгать, бегать, кусать.

package by.htp.animal.runner;

import by.htp.animal.model.Dog;
import by.htp.animal.model.Puppy;

public class AnimalMain {

	public static void main(String[] args) {
		Puppy puppy = new Puppy("Bim");
		Dog dog = new Dog();
		dog.bark();
		dog.run();
		dog.jump();
		dog.bit();
	}

}

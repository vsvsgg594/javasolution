package thisandsuper;

import java.util.Objects;

public class Q3 {
	private final String name;
	private int age = 0;

	public Q3(String name) {
		this.name = Objects.requireNonNull(name);
	}

	public Q3(String name, int age) {
		this(name);
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {
		// Calling the `Person(String)` constructor.
		var jane = new Q3("Jane");
		System.out.println(jane.name + " is " + jane.age + " years old.");

		// Calling the `Person(String, int)` constructor.
		var john = new Q3("John", 3);
		System.out.println(john.name + " is " + john.age + " years old.");
	}
}
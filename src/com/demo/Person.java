package com.demo;

import java.util.Comparator;
import java.util.Objects;

class SortAsPerNameThenAsPerAge implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {

		int value = o1.getName().compareTo(o2.getName());
		if (value == 0) {
			value = Integer.compare(o2.getAge(), o1.getAge());
		}
		return value;

	}
}

class AgeSorter implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return Integer.compare(o2.getAge(), o1.getAge());
	}
}

//class NameSorter implements Comparator<Person> {
//	@Override
//	public int compare(Person o1, Person o2) {
//		return o1.getName().compareTo(o2.getName());
//	}
//}

public class Person implements Comparable<Person> {
	private int id;
	private String name;
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return age;
		// return Objects.hash(age, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.getId(), o.getId());
	}

}

package com.demo;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("foo");
		names.add("bar");
		names.add("jar");
		names.add("car");

		System.out.println("-------------before sorting---------");
		for (String name : names) {
			System.out.println(name);
		}
		
		Collections.sort(names);

		System.out.println("-------------after sorting---------");
		for (String name : names) {
			System.out.println(name);
		}

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(12, "rajiv", 45));
		persons.add(new Person(102, "sumit", 40));
		
		persons.add(new Person(192, "kapil", 35));
		persons.add(new Person(193, "kapil", 65));
		
		persons.add(new Person(120, "shiv", 55));

		System.out.println("-------------before sorting printing person details---------");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		Collections.sort(persons);
		System.out.println("-------------after sorting printing person details-(natural sort)--------");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		//NameSorter
		
//		Collections.sort(persons, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.getName().compareTo(o2.getName());
//			}
//		});
		
		Collections.sort(persons, ( o1,  o2)->  o1.getName().compareTo(o2.getName()));
		
		System.out.println("-------------after sorting as per name printing person details--------");
		for (Person person : persons) {
			System.out.println(person);
		}
		

		Collections.sort(persons, new AgeSorter());
		System.out.println("-------------after sorting as per person age printing person details--------");
		for (Person person : persons) {
			System.out.println(person);
		}
		
		//SortAsPerNameThenAsPerAge
		

		Collections.sort(persons, new SortAsPerNameThenAsPerAge());
		System.out.println("-------------SortAsPerNameThenAsPerAge--------");
		for (Person person : persons) {
			System.out.println(person);
		}
		

	}

}

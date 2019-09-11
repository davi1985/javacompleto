package course.chapter5.poo.list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Davi");
		list.add("Joelma");
		list.add("Sarah");

		// size of list
		System.out.println(list.size());

		// show list items
		for (String string : list) {
			System.out.println(string);
		}

		System.out.println("------------------------");

		// remove item
		list.removeIf(x -> x.charAt(0) == 'D');
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("------------------------");
		
		//index of item;
		System.out.println("Index of Joelma: " + list.indexOf("Joelma"));
		System.out.println("Index of Sarah: " + list.indexOf("Sarah"));

		System.out.println("------------------------");

		// filter list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("------------------------");
		
		// found first result
		String name = list.stream().filter(x -> x.charAt(0) == 'H').findFirst().orElse(null);
		System.out.println(name);

	}

}

package com.tahauddin.syed;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class App {

	public static void main(String[] args) {

		ArrayList<Integer> list = ArrayListExample.getArrayList();

		List<Integer> filteredList = list.stream().filter(n -> n > 25).collect(Collectors.toList());

		System.out.println(filteredList);
		System.out.println(filteredList.getClass().getName());

		LinkedList<String> linkedList = ArrayListExample.getLinkedList();

	//	List<String> listStartsWithS =
				 Long count =
				linkedList.stream().filter(n -> n.startsWith("M"))
						 .count();
		//				.collect(Collectors.toList());

		 System.out.println(count);
		// by default when we call Collectors.toList() method it will
		// return ArrayList Object.
	//	System.out.println(listStartsWithS.getClass().getName());

	}

}

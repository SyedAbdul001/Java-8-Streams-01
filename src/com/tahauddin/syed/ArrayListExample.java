package com.tahauddin.syed;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExample {

	
	public static ArrayList<Integer> getArrayList() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(35);
		list.add(25);
		list.add(15);
		list.add(5);
		list.add(45);
		
		return list;
		
	}
	
	
	public static LinkedList<String> getLinkedList() {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("Mark");
		linkedList.add("David");
		linkedList.add("Mike");
		linkedList.add("Tom");
		linkedList.add("James");
		linkedList.add("John");
		linkedList.add("Sam");
		linkedList.add("Tom");
		
		
		return linkedList;
		
	}
}

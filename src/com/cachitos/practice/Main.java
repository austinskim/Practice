package com.cachitos.practice;

import com.cachitos.practice.interview.lists.solution.AustinListAddition;
import com.cachitos.practice.interview.lists.solution.MichaelListAddition;
import com.cachitos.practice.interview.lists.solution.RickyListAddition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		listAdditionTest();

	}

	private static void listAdditionTest() {

		System.out.println("============================ List Addition ============================");
		// Test 1 data
		List<Integer> list1a = new ArrayList<>(Arrays.asList(4, 9, 7));
		List<Integer> list1b = new ArrayList<>(Arrays.asList(2, 3, 3));
		List<Integer> sumList1 = new ArrayList<>(Arrays.asList(7, 3, 0));

		// Test 2 data
		List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 0, 0));
		List<Integer> sumList2 = new ArrayList<>(Arrays.asList(1, 0, 0, 0));

		// Test 3 data
		List<Integer> list3a= new ArrayList<>(Arrays.asList(6, 2));
		List<Integer> list3b = new ArrayList<>(Arrays.asList(4, 9, 0));
		List<Integer> sumList3 = new ArrayList<>(Arrays.asList(5, 5, 2));

		// Print solutions

		System.out.println("***** Michael's Solution *****");
		MichaelListAddition michaelListAddition = new MichaelListAddition();
		List<Integer> michaelSum1 = michaelListAddition.add(list1a, list1b);
		List<Integer> michaelSum2 = michaelListAddition.add(list2, list2);
		List<Integer> michaelSum3 = michaelListAddition.add(list3a, list3b);
		System.out.println("Test 1: " + listToInteger(michaelSum1));
		System.out.println("Test 2: " + listToInteger(michaelSum2));
		System.out.println("Test 3: " + listToInteger(michaelSum3));

		System.out.println("***** Ricky's Solution *****");
		RickyListAddition rickyListAddition = new RickyListAddition();
		List<Integer> rickySum1 = rickyListAddition.add(list1a, list1b);
		List<Integer> rickySum2 = rickyListAddition.add(list2, list2);
		List<Integer> rickySum3 = rickyListAddition.add(list3a, list3b);
		System.out.println("Test 1: " + listToInteger(rickySum1));
		System.out.println("Test 2: " + listToInteger(rickySum2));
		System.out.println("Test 3: " + listToInteger(rickySum3));

		System.out.println("***** Austin's Solution *****");
		AustinListAddition austinListAddition = new AustinListAddition();
		List<Integer> austinSum1 = austinListAddition.add(list1a, list1b);
		List<Integer> austinSum2 = austinListAddition.add(list2, list2);
		List<Integer> austinSum3 = austinListAddition.add(list3a, list3b);
		System.out.println("Test 1: " + listToInteger(austinSum1));
		System.out.println("Test 2: " + listToInteger(austinSum2));
		System.out.println("Test 3: " + listToInteger(austinSum3));

		System.out.println("***** Answer Key *****");
		System.out.println("Test 1: " + listToInteger(sumList1));
		System.out.println("Test 2: " + listToInteger(sumList2));
		System.out.println("Test 3: " + listToInteger(sumList3));
	}

	private static String listToInteger(List<Integer> integerList) {
		String solution = "";

		for (int integer : integerList) {
			solution += integer;
		}

		return solution;
	}

}
